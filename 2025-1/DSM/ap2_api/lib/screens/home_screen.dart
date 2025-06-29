
import 'package:ap2_api/models/character.dart';
import 'package:ap2_api/services/character_service.dart';
import 'package:flutter/material.dart';

class MyHomeScreen extends StatefulWidget{
  const MyHomeScreen({super.key, required this.title});

  final String title;

  @override
  State<MyHomeScreen> createState() => _MyHomeScreenState();
}

class _MyHomeScreenState extends State<MyHomeScreen>{
  final CharacterService _characterService = CharacterService();
  late Future<List<Character>> _charactersFuture;

  @override
  void initState() {
    super.initState();
    _charactersFuture = _characterService.getCharacters();
  }

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    throw UnimplementedError();
  }

}