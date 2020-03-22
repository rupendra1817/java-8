package in.tecmentor.deadlock;

public class Intersection {

	private Object roadA = new Object();
	private Object roadB = new Object();

	public void takeRoadA() {
		synchronized (roadA) {
			System.out.println("Road A locked by thread " + Thread.currentThread().getName());

			synchronized (roadB) {
				System.out.println("Train is passing through road A.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

		}
	}

	/*public void takeRoadB() {
		synchronized (roadB) {
			System.out.println("Road B locked by thread " + Thread.currentThread().getName());

			synchronized (roadA) {
				System.out.println("Train is passing through road B.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

		}
	}*/
	
	
	// Solution 
	public void takeRoadB() {
		synchronized (roadA) {
			System.out.println("Road A locked by thread " + Thread.currentThread().getName());

			synchronized (roadB) {
				System.out.println("Train is passing through road B.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

		}
	}
	 
}
