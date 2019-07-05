public class ThreadRaceApp {

    static RunnerThread tortoise = new RunnerThread("Tortoise", 0, 10);
    static RunnerThread hare = new RunnerThread("Hare", 90, 100);

    public static void main(String[] args) {
        System.out.println("Get set...Go!");
        tortoise.start();
        hare.start();
    }
}
