import 'package:ap2_api/models/character.dart';
import 'package:flutter/material.dart';
import 'package:ap2_api/models/character.dart';

class CharacterDetailsScreen extends StatelessWidget {
  final Character character;

  const CharacterDetailsScreen({super.key, required this.character});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(character.name),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () => Navigator.pop(context),
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.all(24.0),
        child: Column(
          children: [
            Center(
              child: Image.network(
                  character.image, width: 250,height: 250, fit: BoxFit.cover
              ),
            ),

            const SizedBox(height: 200),
            Text(
              "Nome do Pokémon: ${character.name}",
              style: const TextStyle(fontSize: 22),
            ),

          ],
        ),
      ),
    );
  }
}