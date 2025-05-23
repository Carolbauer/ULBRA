import 'package:flutter/material.dart';
import 'package:exerciciofluterapi/models/character.dart';

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
            Image.network(character.image, height: 250),
            const SizedBox(height: 24),
            Text(
              "Nome: ${character.name}",
              style: const TextStyle(fontSize: 22),
            ),
            // Se tiver mais campos no Character, pode adicionar aqui
          ],
        ),
      ),
    );
  }
}
