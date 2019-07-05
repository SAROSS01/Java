package business;

public class RunnerThread extends Thread {

	String name;
	private int stamina; // 1-100, indicating the likelihood a runner will rest
	private int speed; // how many meters the runner travels per move
	private int progress; // indicates runners progress on course

	public RunnerThread(String name, int stamina, int speed, int progress) {
		super();
		this.name = name;
		this.stamina = stamina;
		this.speed = speed;
		this.progress = progress;
	}

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	@Override
	public void run() {
		while (progress < 1000) {
			double d = Math.random() * 100;
			try {
				
				if (d > stamina) {
				Thread.sleep(100);
				} else {
				progress += speed;
				System.out.println(name +": " + progress);
				}
				Thread.sleep(100);
				} 
				catch (InterruptedException e) {};
			}
		System.out.println(name + ": I finished!");
	}
}
