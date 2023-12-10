package br.com.ulbra.ap2.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Data
@DynamicUpdate
@NoArgsConstructor
@Table(name = "client")
public class Client {
    @Id
@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="client_seq")
private long id;
private String name;
private int age;
private String profession;

    public Client(final String name, final int age, final String profession) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

}
