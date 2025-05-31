import 'package:flutter/material.dart';
import 'package:ap2_api/models/character.dart';
import 'package:ap2_api/services/character_service.dart';
import 'package:ap2_api/screens/screen_details.dart';

class ScreenOne extends StatefulWidget {
  const ScreenOne({super.key});

  @override
  State<ScreenOne> createState() => _ScreenOneState();
}

class _ScreenOneState extends State<ScreenOne> {
  CharacterService service = CharacterService();

  late Future<List<Character>> _personagensFuture;
  late List<Character> _personagens;
  late List<Character> _personagensFiltrados;

  @override
  void initState() {
    super.initState();
    _personagensFuture = _carregarPersonagens();
  }

  Future<List<Character>> _carregarPersonagens() async {
    _personagens = await service.getCharacters();
    _personagensFiltrados = _personagens;
    return _personagens;
  }

  void _filtrarPersonagens(String filtro) {
    setState(() {
      _personagensFiltrados = _personagens
          .where((personagem) =>
          personagem.name.toLowerCase().contains(filtro.toLowerCase()))
          .toList();
    });
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Padding(
          padding: const EdgeInsets.all(16),
          child: TextField(
            onChanged: _filtrarPersonagens,
            decoration: const InputDecoration(
              labelText: 'Buscar Pokémon',
              border: OutlineInputBorder(),
              prefixIcon: Icon(Icons.search),
            ),
          ),
        ),
        Expanded(
          child: FutureBuilder<List<Character>>(
            future: _personagensFuture,
            builder: (context, snapshot) {
              if (snapshot.hasData) {
                return GridView.builder(
                  padding: const EdgeInsets.all(12),
                  gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
                    crossAxisCount: 2,
                    crossAxisSpacing: 12,
                    mainAxisSpacing: 12,
                    childAspectRatio: 0.85,
                  ),
                  itemCount: _personagensFiltrados.length,
                  itemBuilder: (context, index) {
                    final personagem = _personagensFiltrados[index];
                    return GestureDetector(
                      onTap: () {
                        Navigator.push(
                          context,
                          MaterialPageRoute(
                            builder: (context) => CharacterDetailsScreen(
                              character: personagem,
                            ),
                          ),
                        );
                      },
                      child: Card(
                        elevation: 4,
                        shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.circular(12),
                        ),
                        child: Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Image.network(
                              personagem.image,
                              height: 100,
                              width: 100,
                              fit: BoxFit.cover,
                            ),
                            const SizedBox(height: 10),
                            Text(
                              personagem.name,
                              style: const TextStyle(
                                fontSize: 16,
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                            const SizedBox(height: 5),
                            const Icon(
                              Icons.touch_app_outlined,
                              size: 20,
                              color: Colors.grey,
                            ),
                          ],
                        ),
                      ),
                    );
                  },
                );
              }

              if (snapshot.hasError) {
                return const Center(child: Text("Erro ao carregar dados"));
              }

              return const Center(child: CircularProgressIndicator());
            },
          ),
        ),
      ],
    );
  }
}
