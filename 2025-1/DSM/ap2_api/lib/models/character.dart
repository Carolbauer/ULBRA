class Character {
  final String name;
  final String image;

  const Character({required this.name, required this.image});

  factory Character.fromJson(Map<String, dynamic> json) {
    final name = json['name'];
    final url = json['url'];


    final id = url.split('/')[url.split('/').length - 2];
    final imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$id.png";

    return Character(name: name, image: imageUrl);
  }
}
