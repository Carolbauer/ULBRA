// game type selection
let gameChoice,
  blackLevel,
  whiteLevel,
  allMovesNow,
  gameStartTime,
  gameDuration;
const gameChoiceForm = document.getElementById("pilihan-game");
const blackLevelForm = document.getElementById("level-hitam");
const whiteLevelForm = document.getElementById("level-putih");
const startButton = document.getElementById("tombol-mulai");
const surrenderButton = document.getElementById("tombol-menyerah");
const stopButton = document.getElementById("tombol-hentikan");
const turnDisplay = document.getElementById("turnDisplay");
const winnerDisplay = document.getElementById("winnerDisplay");
const listHistory = document.getElementById("list-history");
const timePlayed = document.querySelector(".lama-bermain");

// Game variables
let turn,
  backMove,
  hasHighlight,
  squareHighlighted,
  history,
  positionNow,
  twoComputer,
  nodeCount,
  timeOut;
const tagBoard = "board";
const turnComputer = "black";
const initialPosition =
  "1p1p1p1p/p1p1p1p1/1p1p1p1p/8/8/P1P1P1P1/1P1P1P1P/P1P1P1P1";

// Function for Event Handler
const checkStartButton = () => {
  if (blackLevel && gameChoice == "lawan") startButton.disabled = false;
  else if (gameChoice == "komputer" && blackLevel && whiteLevel)
    startButton.disabled = false;
  else startButton.disabled = true;
};

gameChoiceForm.addEventListener("change", () => {
  gameChoice = gameChoiceForm.value;
  if (gameChoice == "lawan") {
    blackLevelForm.classList.remove("d-none");
    whiteLevelForm.classList.add("d-none");
  } else if (gameChoice == "komputer") {
    blackLevelForm.classList.remove("d-none");
    whiteLevelForm.classList.remove("d-none");
  } else {
    blackLevelForm.classList.add("d-none");
    whiteLevelForm.classList.add("d-none");
    startButton.disabled = true;
  }
  checkStartButton();
});

blackLevelForm.addEventListener("change", () => {
  blackLevel = parseInt(blackLevelForm.value);
  checkStartButton();
});

whiteLevelForm.addEventListener("change", () => {
  whiteLevel = parseInt(whiteLevelForm.value);
  checkStartButton();
});

const downloadHistory = () => {
  var a = document.createElement("a");
  var file = new Blob([JSON.stringify(history)], { type: "application/json" });
  a.href = URL.createObjectURL(file);
  a.download = "history.json";
  a.click();
};

const hgameChoice = (adawinnerDisplay = false) => {
  surrenderButton.classList.add("d-none");
  stopButton.classList.add("d-none");
  turn = null;
  startButton.disabled = false;
  if (adawinnerDisplay) {
    Swal.fire("Fim do Jogo", "Peça Branca ou Preta venceu!", "success");
  } else {
    Swal.fire("Jogo Encerrado", "O jogo foi interrompido!", "info");
  }
  gameDuration = new Date().getTime() - gameStartTime;
  timePlayed.textContent = `(Duração do jogo ${gameDuration / 1000} segundos)`;

  gameChoiceForm.disabled = false;
  blackLevelForm.disabled = false;
  whiteLevelForm.disabled = false;
  clearTimeout(timeOut);
};

surrenderButton.addEventListener("click", () => {
  Swal.fire({
    title: "Voce tem certeza que deseja desistir?",
    icon: "warning",
    showCancelButton: true,
    confirmButtonColor: "#3085d6",
    cancelButtonColor: "#d33",
    confirmButtonText: "Confirmar :(",
    cancelButtonText: "Cancelar!",
  }).then((result) => {
    if (result.isConfirmed) {
      hgameChoice();
      winnerDisplay.innerHTML = `Peças Pretas(AI Depth ${blackLevel})`;
    }
  });
});

stopButton.addEventListener("click", () => {
  Swal.fire({
    title: "Voce tem certeza que deseja desistir?",
    icon: "warning",
    showCancelButton: true,
    confirmButtonColor: "#3085d6",
    cancelButtonColor: "#d33",
    confirmButtonText: "Confirmar",
    cancelButtonText: "Cancelar",
  }).then((result) => {
    if (result.isConfirmed) {
      hgameChoice();
    }
  });
});

// Function for Event Handler
const onDrop = (source, target, piece, newPos, oldPos, orientation) => {
  if (Chessboard.objToFen(newPos) !== Chessboard.objToFen(oldPos)) {
    const moves = [...allMovesNow];
    if (!isValidMove(source, target, moves)) return "snapback";

    const move = moves.filter((m) => m.to == target && m.from == source)[0];
    const newPosition = movePiece(move, oldPos);
    positionNow = newPosition;
    board.position(newPosition, false);
    history.push(move);

    removeGreySquares();
    if (move["remove"]) {
      if (!hasAnotherEat(target, piece)) changeTurn();
      else
        allMovesNow = getAllMoves(turn, positionNow).filter(
          (m) => m.from == target
        );
    } else changeTurn();

    listHistory.innerHTML =
      `<li class="list-group-item">Peças Brancas : ${move.from} ke ${move.to}` +
      listHistory.innerHTML;
    return "trash";
  }
};

const onDragStart = (source, piece, position, orientation) => canMove(piece);

const onMouseoverSquare = (square, piece) => {
  if (piece && canMove(piece)) {
    const moves = allMovesNow.filter((m) => m.from == square);
    if (moves.length > 0) {
      greySquare(square);
      moves.forEach((m) => greySquare(m.to));
    }
  }
};

const onMouseoutSquare = () => {
  removeGreySquares();
};

const onSnapbackEnd = () => {
  Swal.fire("Movimento inválido");
};
const resetGame = () => {
    turn = "white";
    positionNow = initialPosition;
    board.position(initialPosition, false);
    allMovesNow = getAllMoves(turn, positionNow);
    history = [];
    backMove = false;
    hasHighlight = false;
    squareHighlighted = null;
  
    turnDisplay.textContent = "Peças Brancas";
    listHistory.innerHTML = "";
    winnerDisplay.innerHTML = "-";
    timePlayed.textContent = "";

    gameChoiceForm.disabled = false;
    blackLevelForm.disabled = false;
    whiteLevelForm.disabled = false;

    startButton.disabled = false;

    surrenderButton.classList.add("d-none");
    stopButton.classList.add("d-none");

    clearTimeout(timeOut);
  };

  const changeTurn = () => {
    if (turn === "white") {
        turn = "black";
        turnDisplay.textContent = "Peças Pretas";
    } else if (turn === "black") {
        turn = "white";
        turnDisplay.textContent = "Peças Brancas";
    }

    allMovesNow = getAllMoves(turn, positionNow);

    removeHighlightSquare();
    allMovesNow.forEach((m) => {
        if ("remove" in m) highlightSquare(m.from);
    });

    if (allMovesNow.length === 0) {
        const winnerColor = turn === "white" ? "black" : "white"; // Cor oposta ao turno atual
        const winnerName = winnerColor === "white" ? "Peças Brancas" : "Peças Pretas";

        Swal.fire({
            title: "Fim do Jogo",
            text: `${winnerName} venceu o jogo!`,
            icon: "success",
            confirmButtonText: "OK",
        }).then(() => {
            resetGame(); // Reinicia o jogo após o modal ser fechado
        });
    } else if (turn === turnComputer || twoComputer) {
        timeOut = window.setTimeout(playComputer, 500);
    }
};



const playComputer = () => {
  nodeCount = 0;
  let move, value, lamaMikir;
  let perpindahan = "";
  const position = positionNow;
  const alpha = Number.NEGATIVE_INFINITY;
  const beta = Number.POSITIVE_INFINITY;

  lamaMikir = new Date().getTime();
  if (turn == "white") {
    [move, value] = minmax(
      positionNow,
      whiteLevel,
      alpha,
      beta,
      true,
      0,
      turn,
      turn
    );
    perpindahan += '<li class="list-group-item">Peças Brancas : ';
  } else {
    [move, value] = minmax(
      positionNow,
      blackLevel,
      alpha,
      beta,
      true,
      0,
      turn,
      turn
    );
    perpindahan +=
      '<li class="list-group-item list-group-item-dark">Peças pretas : ';
  }
  lamaMikir = new Date().getTime() - lamaMikir;

  let newPos = {
    ...position,
  };

  move["nodeCount"] = nodeCount;
  move["waktu"] = lamaMikir;

  while ("nextEat" in move) {
    let nextEat = move["nextEat"];
    perpindahan += `${move.from} ke ${move.to} || `;
    delete move.nextEat;
    newPos = movePiece(move, newPos);
    board.position(newPos);
    history.push(move);
    move = nextEat;
  }

  perpindahan += `${move.from} ke ${move.to} `;
  newPos = movePiece(move, newPos);
  positionNow = newPos;
  board.position(newPos);
  history.push(move);

  perpindahan += `(${nodeCount} Nós avaliados em ${lamaMikir /
    1000} segundos)</li>`;
  listHistory.innerHTML = perpindahan + listHistory.innerHTML;

  if (nodeCount > 600000) {
    blackLevel -= 2;
    whiteLevel -= 2;
    Swal.fire("Nível da IA foi reduzido");
  }
  changeTurn();
};

// Chessboard Configuration
const config = {
  position: initialPosition,
  draggable: true,
  onDragStart: onDragStart,
  onDrop: onDrop,
  onMouseoverSquare: onMouseoverSquare,
  onMouseoutSquare: onMouseoutSquare,
  onSnapbackEnd: onSnapbackEnd,
};

const board = Chessboard(tagBoard, config);
positionNow = board.position();

startButton.addEventListener("click", () => {
    resetGame();
  turnDisplay.textContent = "Peças Brancas";
  startButton.disabled = true;
  if (gameChoice == "lawan") {
    surrenderButton.classList.remove("d-none");
    twoComputer = false;
  } else if (gameChoice == "komputer") {
    twoComputer = true;
    stopButton.classList.remove("d-none");
  }
  listHistory.innerHTML = "";
  winnerDisplay.innerHTML = "-";

  // Setting Game
  turn = "white";
  history = [];
  backMove = false;
  hasHighlight = false;
  squareHighlighted = null;
  board.position(initialPosition);
  positionNow = board.position();
  allMovesNow = getAllMoves(turn, positionNow);

  gameChoiceForm.disabled = true;
  blackLevelForm.disabled = true;
  whiteLevelForm.disabled = true;

  timePlayed.textContent = "";
  gameStartTime = new Date().getTime();

  if (twoComputer) timeOut = window.setTimeout(playComputer, 500);
});
