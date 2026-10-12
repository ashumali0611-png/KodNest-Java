
public class Developer {

    void work() {
        System.out.println("Developer Working");
    }

    void project() {
        System.out.println("Developer Doing Project");
    }

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);

        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}

class JavaDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("JavaDeveloper Working");
    }

    @Override
    void project() {
        System.out.println("JavaDeveloper Doing Project");
    }
}

class PythonDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("PythonDeveloper Working");
    }

    @Override
    void project() {
        System.out.println("PythonDeveloper Doing Project");
    }
}
