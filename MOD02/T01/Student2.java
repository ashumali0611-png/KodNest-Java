
public class Student2 {

    String name;
    int age;
    double height;

    Student2() {
        name = "Anu";
        age = 20;
        height = 5.3;
    }

    Student2(String name) {
        this.name = name;
    }

    Student2(String name, int age, double height) {
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

public class Student2 {

    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.display();
        Student2 s3 = new Student2("Manu");
        s3.display();
        Student2 s1 = new Student2("Raja", 18, 5.5);
        s1.display();
    }
}
