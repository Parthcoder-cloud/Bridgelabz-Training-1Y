class person {

    String name;
    int age;

    person(String n, int a) {
        name = n;
        age = a;
    }

   
    person(person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        person p1 = new person("Rahul", 20);
        person p2 = new person(p1);

        p1.display();
        p2.display();
    }
}