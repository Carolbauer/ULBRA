# 📱 Pokémon Flutter App

Este é um aplicativo Flutter desenvolvido para fins acadêmicos. O app utiliza **Firebase Authentication** para login e cadastro de usuários, além de consumir uma API pública de Pokémon para exibir dados. Também conta com funcionalidades de logout e interface responsiva.

O projeto possui as seguintes funcionalidades:
- Tela de Login com autenticação via Firebase.
- Tela de Cadastro para novos usuários, com autenticação via Firebase.
- Tela Principal que exibe uma lista de itens consumidos de uma API pública.
- Logout funcional, redirecionando o usuário para a tela de login.
- Mensagens de erro amigáveis e feedback visual.
- Interface com imagem temática do Pokémon, campos centralizados, botões destacados e layout moderno.

**Tecnologias e pacotes utilizados**:
- Flutter
- Dart
- Firebase Authentication
- HTTP (para consumir API pública)
- Google Fonts
- Widgets: `Scaffold`, `AppBar`, `TextField`, `FutureBuilder`, `ListView`, `AlertDialog`, `ElevatedButton`, `TextButton`, entre outros.

**Estrutura do projeto**:
- Tela de Login: permite login com Firebase e link para cadastro.
- Tela de Cadastro: permite criar conta com Firebase.
- Tela Principal: exibe dados de API pública (Pokémon API ou outra).
- Lógica de logout incluída na tela principal.
- Diretórios organizados em `screens/`, `services/` e `models/`.


