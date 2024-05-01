package task6;

public class UserData {

    private String name;
    private int age;

    public UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
