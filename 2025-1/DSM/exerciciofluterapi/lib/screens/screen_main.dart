import 'package:flutter/material.dart';
import 'package:exerciciofluterapi/models/character.dart';
import 'package:exerciciofluterapi/screens/screen_one.dart';
import 'package:exerciciofluterapi/screens/screen_two.dart';
import 'package:exerciciofluterapi/screens/screen_details.dart';

class ScreenMain extends StatelessWidget {
  const ScreenMain({super.key});

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 2, // 👈 Você está usando apenas duas abas: casa e info
      child: Scaffold(
        appBar: AppBar(
          title: const Text("TAB's"),
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
