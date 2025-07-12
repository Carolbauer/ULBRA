import 'package:ap2_api/screens/register_screen.dart';
import 'package:ap2_api/services/firebase_auth_service.dart';
import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/material.dart';
import 'package:ap2_api/screens/screen_main.dart';

class LoginScreen extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _LoginScreen();
}

class _LoginScreen extends State<LoginScreen> {
  FirebaseAuthService firebaseAuth = FirebaseAuthService();
  final emailController = TextEditingController();
  final passwordController = TextEditingController();
  String? emailTextError;
  String? passwordTextError;
  bool isVisible = false;
  bool isLoading = false;

  Future<void> handleLogin() async {
    setState(() {
      isLoading = true;
      emailTextError = null;
      passwordTextError = null;
    });
    try {
      var email = emailController.text.trim();
      var password = passwordController.text;

      await firebaseAuth.makeLogin(email, password);

      Navigator.pushReplacement(
        context,
        MaterialPageRoute(
          builder: (context) => const ScreenMain(),
        ),
      );
    } on FirebaseAuthException catch (e) {
      setState(() {
        emailTextError = "Usuário ou senha inválidos";
        passwordTextError = "Usuário ou senha inválidos";
      });

      showDialog(
        context: context,
        builder: (context) => AlertDialog(
          title: const Text("Erro no login"),
          content: const Text("Usuário ou senha inválidos"),
          actions: [
            TextButton(
              onPressed: () => Navigator.pop(context),
              child: const Text("OK"),
            ),
          ],
        ),
      );
    } finally {
      setState(() {
        isLoading = false;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Login"),
      ),
      body: Container(
        decoration: const BoxDecoration(
          gradient: LinearGradient(
            colors: [Colors.lightBlueAccent, Colors.white],
            begin: Alignment.topCenter,
            end: Alignment.bottomCenter,
          ),
        ),
        child: Center(
          child: isLoading
              ? const CircularProgressIndicator()
              : SingleChildScrollView(
            padding: const EdgeInsets.all(24.0),
            child: Column(
              mainAxisSize: MainAxisSize.min,
              children: [
                Image.asset(
                  "assets/images/teste7.png",
                  width: 300,
                  height: 200,
                ),
                const SizedBox(height: 24),
                TextField(
                  controller: emailController,
                  decoration: InputDecoration(
                    errorText: emailTextError,
                    prefixIcon: const Icon(Icons.email),
                    label: const Text("Email"),
                    hintText: "Digite seu e-mail",
                    border: const OutlineInputBorder(),
                  ),
                ),
                const SizedBox(height: 24),
                TextField(
                  controller: passwordController,
                  obscureText: !isVisible,
                  decoration: InputDecoration(
                    errorText: passwordTextError,
                    prefixIcon: const Icon(Icons.lock),
                    label: const Text("Senha"),
                    hintText: "Digite sua senha",
                    border: const OutlineInputBorder(),
                    suffixIcon: IconButton(
                      onPressed: () {
                        setState(() {
                          isVisible = !isVisible;
                        });
                      },
                      icon: Icon(
                        isVisible
                            ? Icons.visibility
                            : Icons.visibility_off,
                      ),
                    ),
                  ),
                ),
                const SizedBox(height: 32),
                SizedBox(
                  width: double.infinity,
                  child: ElevatedButton(
                    style: ElevatedButton.styleFrom(
                      backgroundColor: Colors.blueAccent,
                      padding: const EdgeInsets.symmetric(vertical: 16),
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(10),
                      ),
                    ),
                    onPressed: handleLogin,
                    child: const Text(
                      "Entrar",
                      style: TextStyle(
                        fontSize: 18,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                  ),
                ),
                const SizedBox(height: 24),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    const Text("Não tem conta?"),
                    TextButton(
                      onPressed: () {
                        Navigator.push(
                          context,
                          MaterialPageRoute(
                            builder: (context) =>
                            const RegisterScreen(),
                          ),
                        );
                      },
                      child: const Text(
                        " Cadastre-se",
                        style: TextStyle(
                          color: Colors.blueAccent,
                          decoration: TextDecoration.underline,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
