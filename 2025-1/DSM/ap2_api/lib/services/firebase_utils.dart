import 'package:firebase_auth/firebase_auth.dart';

class FirebaseUtils {
  final FirebaseAuth auth = FirebaseAuth.instance;

  register(String email, String password) async {
    await auth.createUserWithEmailAndPassword(email: email, password: password);
  }
}