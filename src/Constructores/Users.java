package Constructores;

public class Users {
    String name;
    int age;
    String gender;
    String email;

    public Users(String name) {
        this.name = name;
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Users(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Users(String name, int age, String gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
