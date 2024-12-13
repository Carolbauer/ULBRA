const playerWhite = "Jogador com Peças Brancas";
const playerBlack = "Jogador com Peças Pretas";
const getNextChar = (c, move = 1) =>
  String.fromCharCode(c.charCodeAt(0) + move);

const combineLettersAndNumbers = (letters, numbers) => {
  return letters.reduce((arr, h) => {
    numbers.forEach((a) => {
      arr.push(h + a);
    });
    return arr;
  }, []);
};

const greySquare = (square) =>
  $(`#${tagBoard} .square-${square}`).addClass("gray");
const highlightSquare = (square) =>
  $(`#${tagBoard} .square-${square}`).addClass("highlight");
const removeGreySquares = () =>
  $(`#${tagBoard} .square-55d63`).removeClass("gray");
const removeHighlightSquare = () =>
  $(`#${tagBoard} .highlight`).removeClass("highlight");

const canMove = (piece) => {
  if (!turn || twoComputer) return false;
  if (
    (turn === "white" && piece.search(/^w/) === -1) ||
    (turn === "black" && piece.search(/^b/) === -1)
  ) {
    return false;
  }
  return true;
};

const isEmptySquare = (square, board) => {
  if (!(square in board)) return true;
  return false;
};

const isValidMove = (from, to, moves) => {
  const move = moves.filter((m) => m.from == from && m.to == to);
  if (move.length > 0) return true;
  return false;
};

const eat = (removeSquare, currPos) => {
  delete currPos[removeSquare];
  return currPos;
};

const getHorizontalMovesForking = (batas, i, j, k, pieces, currBoard, plus) => {
  let newS;
  let newSquare = [];
  let jRemove = undefined;
  let kRemove = undefined;

  while (batas(i) && (j >= 1 || k <= 8)) {
    if (j >= 1) {
      newS = i + j;
      if (isEmptySquare(newS, currBoard)) {
        const tmp = {
          to: newS,
        };
        if (jRemove) {
          tmp["remove"] = jRemove;
          tmp["removePiece"] = currBoard[jRemove];
        }
        newSquare.push(tmp);
      } else {
        if (currBoard[newS][0] == pieces[0]) j = 0;
        if (!jRemove) jRemove = newS;
        else j = 0;
      }
      j--;
    }

    if (k <= 8) {
      newS = i + k;
      if (isEmptySquare(newS, currBoard)) {
        const tmp = {
          to: newS,
        };
        if (kRemove) {
          tmp["remove"] = kRemove;
          tmp["removePiece"] = currBoard[kRemove];
        }
        newSquare.push(tmp);
      } else {
        if (currBoard[newS][0] == pieces[0]) k = 9;
        if (!kRemove) kRemove = newS;
        else k = 9;
      }
      k++;
    }
    i = getNextChar(i, plus);
  }
  return newSquare;
};

const getKingMoves = (square, pieces, currBoard) => {
  const [letters, numbers] = [...square];
  let j = parseInt(numbers) - 1;
  let k = parseInt(numbers) + 1;
  let newSquare = [];

  getHorizontalMovesForking(
    (i) => i >= "a",
    getNextChar(letters, -1),
    j,
    k,
    pieces,
    currBoard,
    -1
  ).forEach((m) => newSquare.push(m));
  getHorizontalMovesForking(
    (i) => i <= "h",
    getNextChar(letters, 1),
    j,
    k,
    pieces,
    currBoard,
    1
  ).forEach((m) => newSquare.push(m));
  return newSquare.reduce((arr, m) => {
    arr.push({
      ...m,
      color: pieces[0],
      piece: pieces,
      from: square,
    });
    return arr;
  }, []);
};

const getPawnMoves = (square, pieces, currBoard) => {
  const [letters, numbers] = [...square];
  const newnumbers = [];
  const newletters = [];
  const warna = pieces[0];

  if (numbers > 1 && (warna == "b" || (warna == "w" && backMove)))
    newnumbers.push(numbers - 1);
  if (numbers < 8 && (warna == "w" || (warna == "b" && backMove)))
    newnumbers.push(parseInt(numbers) + 1);
  if (letters > "a") newletters.push(getNextChar(letters, -1));
  if (letters < "h") newletters.push(getNextChar(letters, 1));

  return combineLettersAndNumbers(newletters, newnumbers).reduce((arr, s) => {
    const m = {
      color: pieces[0],
      piece: pieces,
      from: square,
      to: s,
    };
    if (isEmptySquare(m.to, currBoard)) {
      if (!backMove) arr.push(m);
    } else if (currBoard[m.to][0] != pieces[0]) {
      const eatMove = getMovesEat(square, m.to, pieces, currBoard);
      if (eatMove) arr.push(eatMove);
    }
    return arr;
  }, []);
};

const getMovesEat = (currSquare, nextSquare, pieces, currBoard) => {
  const [letters, numbers] = [...currSquare];
  const [h, a] = [...nextSquare];

  let newA;

  if (pieces[0] == "w") {
    if (a > numbers && a < 8) newA = parseInt(a) + 1;
    else if (a < numbers && backMove && a > 1) newA = parseInt(a) - 1;
  } else if (pieces[0] == "b") {
    if (a < numbers && a > 1) newA = parseInt(a) - 1;
    else if (a > numbers && backMove && a < 8) newA = parseInt(a) + 1;
  }

  if (newA) {
    let newSquare;
    if (h > letters && h < "h") newSquare = getNextChar(h, 1) + newA;
    else if (h < letters && h > "a") newSquare = getNextChar(h, -1) + newA;
    if (newSquare && isEmptySquare(newSquare, currBoard)) {
      return {
        color: pieces[0],
        piece: pieces,
        from: currSquare,
        to: newSquare,
        remove: nextSquare,
        removePiece: currBoard[nextSquare],
      };
    }
  }
  return;
};

const spreadNextEat = (move) => {
  if ("nextEat" in move) {
    const newMove = [];
    let nextEat = [];
    move.nextEat.forEach((m) => {
      spreadNextEat(m).forEach((m2) => nextEat.push(m2));
    });

    delete move.nextEat;
    nextEat.forEach((m) => {
      newMove.push({
        ...move,
        nextEat: m,
      });
    });
    return newMove;
  }
  return [move];
};

const getMoves = (square, pieces = null, currBoard = null, recur = false) => {
  if (!currBoard) currBoard = positionNow;

  if (!pieces) {
    pieces = currBoard[square];
    if (!pieces) return [];
  }

  if (!recur) {
    if (hasHighlight && squareHighlighted != square) return [];
  }

  let moves;

  if (pieces[1].toLowerCase() == "p")
    moves = getPawnMoves(square, pieces, currBoard);
  else moves = getKingMoves(square, pieces, currBoard);

  moves.forEach((m) => {
    if (isPromoted(m.to, pieces)) m["promote"] = pieces;
  });

  if (hasHighlight) return moves.filter((m) => "remove" in m);
  return moves;
};

const getMovesRecur = (square, pieces = null, currBoard = null) => {
  if (!currBoard) {
    currBoard = positionNow;
  }

  if (!pieces) {
    pieces = currBoard[square];
    if (!pieces) return [];
  }

  const moves = getMoves(square, pieces, currBoard, true);
  moves.forEach((m) => {
    if ("remove" in m) {
      let newPos = movePiece(m, currBoard);
      let newPiece = m.piece;

      if ("promote" in m) {
        if (newPiece[0] == "w") newPiece = "wQ";
        else newPiece = "bQ";
      }

      if (hasAnotherEat(m.to, newPiece, false, newPos)) {
        const nextEat = getMovesRecur(m.to, newPiece, newPos).filter(
          (m2) => "remove" in m2
        );

        if (nextEat.length > 0) m["nextEat"] = nextEat;
      }
      squareHighlighted = undefined;
      backMove = false;
      hasHighlight = false;
    }
  });
  return moves;
};

const hasAnotherEat = (
  square,
  pieces,
  highlightSquare2 = true,
  position = null
) => {
  if (highlightSquare2) removeHighlightSquare();

  backMove = true;
  squareHighlighted = square;
  if (highlightSquare2) highlightSquare(square);
  hasHighlight = true;
  const moves = getMoves(square, pieces, position);

  if (moves.length == 0) {
    squareHighlighted = undefined;
    backMove = false;
    hasHighlight = false;
    if (highlightSquare2) removeHighlightSquare();
    return false;
  }
  return true;
};

const isPromoted = (target, pieces) => {
  if (pieces[1].toLowerCase() != "p") return false;
  if (pieces[0] == "w" && target[1] == 8) return true;
  if (pieces[0] == "b" && target[1] == 1) return true;
  return false;
};

const movePiece = (move, position) => {
  position = {
    ...position,
  };
  if ("remove" in move) delete position[move.remove];
  let piece = position[move.from];
  delete position[move.from];
  position[move.to] = piece;

  if ("promote" in move) {
    if (piece[0] == "w") piece = "wQ";
    else piece = "bQ";
    position[move.to] = piece;
  }
  return position;
};

const getAllMoves = (turn, position) => {
  let squarePieces = [];
  for (let square in position) {
    if (position[square][0] == turn[0]) squarePieces.push(square);
  }
  let hasRemove = false;
  let moves = squarePieces.reduce((arr, s) => {
    getMovesRecur(s, position[s], position).forEach((m) => {
      arr.push(m);
      if ("remove" in m) hasRemove = true;
    });
    return arr;
  }, []);
  if (hasRemove) moves = moves.filter((m) => "remove" in m);
  return moves;
};
