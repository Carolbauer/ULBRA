import 'package:firebase_auth/firebase_auth.dart';

class FirebaseAuthService {
  FirebaseAuth firebaseAuth = FirebaseAuth.instance;
  late UserCredential userCredential;

  Future<UserCredential>makeLogin(String email, String password)async{
    try {
      return userCredential = await firebaseAuth.signInWithEmailAndPassword(email: email, password: password);
    }on FirebaseAuthException catch (e){
      throw FirebaseAuthException(code: e.code);
      
    }

  }
  logout(){
    firebaseAuth.signOut();
  }

}