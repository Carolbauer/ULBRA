import 'package:ap2_api/screens/login_screen.dart';
import 'package:ap2_api/services/firebase_auth_service.dart';
import 'package:flutter/material.dart';
import 'package:ap2_api/screens/screen_main.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:firebase_core/firebase_core.dart';
import 'firebase_options.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();

  await Firebase.initializeApp(
    options: DefaultFirebaseOptions.currentPlatform,
  );

  final FirebaseAuthService firebaseAuth = FirebaseAuthService();
  await firebaseAuth.makeLogin("bauercaca@gmail.com", "123456");

  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Personagens App',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.lightBlue),
        scaffoldBackgroundColor: const Color(0xFFE3F2FD),
        appBarTheme: const AppBarTheme(
          backgroundColor: Colors.lightBlue,
          foregroundColor: Colors.white,
        ),
        textTheme: GoogleFonts.poppinsTextTheme(),
        elevatedButtonTheme: ElevatedButtonThemeData(
          style: ElevatedButton.styleFrom(
            backgroundColor: Colors.lightBlue,
            foregroundColor: Colors.white,
            textStyle: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold),
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(12),
            ),
            padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 12),
          ),
        ),
        useMaterial3: true,
      ),
      home: LoginScreen(),
    );
  }
}

class Initializer extends StatefulWidget{

  @override
  State<StatefulWidget> createState()  => _Initializer();
}
class _Initializer extends State<Initializer>{
  final FirebaseAuthService firebaseAuth = FirebaseAuthService();
  @override
  Widget build(BuildContext context) {
    return LoginScreen();
    //return firebaseAuth.firebaseAuth.currentUser != null ? const ScreenMain() : Text("Login Screens");
  }

}