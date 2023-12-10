package br.com.ulbra.ap2.dtos;


import br.com.ulbra.ap2.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientResponseDto {
    private String profession;
    private String name;
    private int age;

    public ClientResponseDto(final Client client) {
        profession = client.getProfession();
        name = client.getName();
        age = client.getAge();


    }

    public ClientResponseDto(String name, final int age, final String profession) {
    }
}