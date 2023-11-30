package br.com.ulbra.ap2.dtos;

public class ClientDto {
    public ClientDto(final String name, final String profession, final int age) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    private String profession;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
