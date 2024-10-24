package app;

public class Employee {
    private String name;
    private String profession;
    private String email;
    private String telephone;
    private int age;

    public Employee(String name, String profession, String email, String telephone, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getAge() {
        return age;
    }
}
