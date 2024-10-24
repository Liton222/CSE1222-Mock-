package q1;

public class Runner1 {
    public static void main(String[] args) {
        Worker worker = new Worker("Rahim", 65000);
        Supervisor supervisor = new Supervisor("Karim", 80000, "Sales");
        Director director = new Director("Messi", 100000, "Operations");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}