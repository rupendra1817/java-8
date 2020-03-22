package in.tecmentor.deadlock;

import java.util.Random;

public class DeadLockTest {

	public static void main(String[] args) {
		Intersection intersection = new Intersection();
		Random random = new Random();

		Thread t1 = new Thread(() -> {
			while (true) {
				try {
					long sleepTime = random.nextInt(5);
					Thread.sleep(sleepTime);
					intersection.takeRoadA();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while (true) {
				try {
					long sleepTime = random.nextInt(5);
					Thread.sleep(sleepTime);
					intersection.takeRoadB();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		});

		t1.start();
		t2.start();
	}
}