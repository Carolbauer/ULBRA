import 'package:exerciciofluterapi/models/character.dart';
import 'package:exerciciofluterapi/services/character_service.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
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
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: const Text("Personagens")),
        body: Column(
          children: [
            Padding(
              padding: const EdgeInsets.all(20),
              child: TextField(
                onChanged: _filtrarPersonagens,
                decoration: const InputDecoration(
                  border: OutlineInputBorder(),
                  labelText: "Filtro",
                ),
              ),
            ),
            FutureBuilder<List<Character>>(
              future: _personagensFuture,
              builder: (context, snapshot) {
                if (snapshot.hasData) {
                  return Expanded(
                    child: Padding(
                      padding: const EdgeInsets.only(bottom: 50),
                      child: ListView.separated(
                        itemCount: _personagensFiltrados.length,
                        itemBuilder: (context, index) {
                          final personagem = _personagensFiltrados[index];
                          return ListTile(
                            title: Text(personagem.name),
                            leading: Image.network(personagem.image),
                          );
                        },
                        separatorBuilder: (context, index) => const Divider(),
                      ),
                    ),
                  );
                }

                if (snapshot.hasError) {
                  return const Text("Erro ao carregar dados");
                }

                return const CircularProgressIndicator();
              },
            ),
          ],
        ),
      ),
    );
  }
}
