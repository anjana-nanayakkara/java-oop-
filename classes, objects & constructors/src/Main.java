public class Main {
    public static void main(String[] args){
        // System.out.println("Hello...");
        //create Human objects

        Human anjana = new Human("anjana");
        Human kamal = new Human("kamal");
        // Human imal = new Human();

        // System.out.println(anjana);
        // System.out.println(imal);

        // anjana.eat();
        System.out.println(anjana.name);
        anjana.eat();
        kamal.eat();
    }
}
