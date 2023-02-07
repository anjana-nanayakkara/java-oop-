public class Main {
    public static void main(String[] args) {
        // create a student object

        Student std = new Student(25,60);
        std.eat();
        System.out.println(std.age);

        std.learn();
        System.out.println(std.marks);
    }
}
