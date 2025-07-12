import 'package:ap2_api/services/firebase_utils.dart';
import 'package:flutter/material.dart';

class RegisterScreen extends StatefulWidget {
  const RegisterScreen({super.key});

  @override
  State<RegisterScreen> createState() => _RegisterScreenState();
}

class _RegisterScreenState extends State<RegisterScreen> {
  final firebaseUtils = FirebaseUtils();
  final _emailController = TextEditingController();
  final _passwordController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Cadastre-se"),
      ),
      body: Padding(
        padding: const EdgeInsets.all(24.0),
        child: Column(
          children: [
            TextField( controller: _emailController,
              decoration: const InputDecoration(
                labelText: "Email",
                  hintText: "Digite seu e-mail"
              ),
            ),
            const SizedBox(height: 24), // Adiciona espaço entre os campos
            TextField( controller: _passwordController,
              decoration: const InputDecoration(
                labelText: "Password",
                  hintText: "Digite sua senha"
              ),
              obscureText: true,
            ),
            SizedBox(height: 24),
            ElevatedButton(onPressed: (){
              debugPrint(_emailController.text);
              firebaseUtils.register(_emailController.text, _passwordController.text);
              Navigator.pop(context);
            } ,child: Text("Cadastrar"))
          ],
        ),
      ),
    );
  }
}
