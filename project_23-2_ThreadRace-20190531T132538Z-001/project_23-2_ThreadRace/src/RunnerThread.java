public class RunnerThread extends Thread {

    private int rest;           // the odds that on any turn, the runner will rest
    private int speed;          // the number of meters traveled if the runner isn't resting
    private int position;       // the position on the course, which is 1000 meters long.
    private String name;

    public RunnerThread(String name, int rest, int speed) {
        this.name = name;
        this.rest = rest;
        this.speed = speed;
        this.position = 0;
    }

    public String getRunnerName() {
        return this.name;
    }

    @Override
    public void run() {
        int chance;
        while (position < 1000) {
            chance = ((int) (Math.random() * 99)) + 1;
            if (chance > rest) {
                position += speed;          // run!
                System.out.println(name + " : " + position);
            }
            try {
                Thread.sleep(100);          // next turn
            } catch (InterruptedException e) {
                System.out.println(this.name + ": I was interrupted!");
                break;
            }
        }
        if (position >= 1000) {
            System.out.println(this.name + ": I finished!");
        }

    }
}