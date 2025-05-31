import 'dart:convert';
import 'package:ap2_api/constants.dart';
import 'package:ap2_api/models/character.dart';
import 'package:http/http.dart' as http;

class CharacterService {
  Future<List<Character>> getCharacters() async {
    final response = await http.get(Uri.parse('$BASE_URL/pokemon?limit=100'));

    if (response.statusCode == 200) {
      final jsonResponse = json.decode(response.body);
      List results = jsonResponse["results"];
      return results.map((item) => Character.fromJson(item)).toList();
    } else {
      throw Exception("Erro ao buscar pokémons");
    }
  }
}