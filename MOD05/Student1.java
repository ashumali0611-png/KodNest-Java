
class Student {

    

          int roll;
        String name;

        @Override
        public boolean equals(Object obj) {
            Student s = (Student) obj;
            if (this.roll == s.roll && this.name.equals(s.name)) {
                return true;
            } else {
                return false;
            }
        }
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}
