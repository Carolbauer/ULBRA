import 'package:flutter/material.dart';
import 'package:exerciciofluterapi/models/character.dart';
import 'package:exerciciofluterapi/services/character_service.dart';
import 'package:exerciciofluterapi/screens/screen_details.dart';

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
              labelText: 'Buscar personagem',
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
                return ListView.separated(
                  itemCount: _personagensFiltrados.length,
                  itemBuilder: (context, index) {
                    final personagem = _personagensFiltrados[index];
                    return ListTile(
                      title: Text(personagem.name),
                      leading: Image.network(personagem.image),
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
                    );
                  },
                  separatorBuilder: (context, index) => const Divider(),
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
