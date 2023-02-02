public class Student extends Human{
    int marks;

    //constructors
    Student(int age, int marks){
        super(age);
        this.marks = marks;
    }


    void learn(){
        System.out.println("he is learning");
    }

    //this will override Human.eat();
    void eat(){
        System.out.println("student is eating");

    }
}
