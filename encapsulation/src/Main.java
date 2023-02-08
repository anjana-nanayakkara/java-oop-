public class Main {
    public static void main(String[] args) {
        Human human = new Human("kasun",30);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        human.setAge(25);
        human.setName("chamara");
        System.out.println(human.getName());
        System.out.println(human.getAge());
    }   
}
