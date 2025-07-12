import 'package:ap2_api/screens/login_screen.dart';
import 'package:ap2_api/services/firebase_auth_service.dart';
import 'package:flutter/material.dart';
import 'package:ap2_api/models/character.dart';
import 'package:ap2_api/screens/screen_one.dart';
import 'package:ap2_api/screens/screen_two.dart';
import 'package:ap2_api/screens/screen_details.dart';

class ScreenMain extends StatefulWidget {
  const ScreenMain({super.key});

  @override
  State<ScreenMain> createState() => _ScreenMainState();
}

class _ScreenMainState extends State<ScreenMain> {
  final FirebaseAuthService firebaseAuth = FirebaseAuthService();

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 2,
      child: Scaffold(
        appBar: AppBar(
          title: const Text("Pokémon App"),
          actions: [
            IconButton(
              onPressed: () {
                firebaseAuth.logout();
                Navigator.pushReplacement(context, MaterialPageRoute(builder: (context){
                  return LoginScreen();
                },
                ),
                );
              },
              icon: const Icon(Icons.logout),
            )
          ],
          leading: Builder(
            builder: (context) {
              return IconButton(
                onPressed: () {
                  Scaffold.of(context).openDrawer();
                },
                icon: const Icon(Icons.menu),
              );
            },
          ),
          bottom: const TabBar(
            tabs: [
              Tab(icon: Icon(Icons.house)),
              Tab(icon: Icon(Icons.info)),
            ],
          ),
        ),
        body: const TabBarView(
          children: [
            ScreenOne(),
            ScreenTwo(),
          ],
        ),
        drawer: Drawer(
          child: ListView(
            children: [
              const DrawerHeader(child: Text("Menu")),
              ListTile(
                title: const Text("Details (teste)"),
                leading: const Icon(Icons.settings),
                onTap: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) => CharacterDetailsScreen(
                        character: Character(
                          name: "Lorenzo",
                          image: "https://via.placeholder.com/150",
                        ),
                      ),
                    ),
                  );
                },
              ),
              const ListTile(
                title: Text("Screen Two"),
                leading: Icon(Icons.alarm),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
