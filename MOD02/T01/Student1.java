public class Student1 {
    String name;
    int age;
    double height;
    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
public class Student1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.input("Ashu", 20, 5.4);
        s1.display();
    }
}