import 'package:flutter/material.dart';

class ScreenTwo extends StatelessWidget {
  const ScreenTwo({super.key});

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      body: Padding(
        padding: EdgeInsets.all(24.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.info_outline, size: 64, color: Colors.blue,),
            SizedBox(height: 16,),
            Text(
              'Aplicativo Flutter desenvolvido por Caroline Bauer\n\n'
                  'API utilizada: PokéAPI\n'
                  'Funcionalidades: Busca, navegação, UI com grid e Detalhes.',
              textAlign: TextAlign.center,
              style: TextStyle(fontSize: 18),
            )
          ]


        ),
      ),
    );
  }
}