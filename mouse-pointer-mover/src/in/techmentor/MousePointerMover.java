package in.techmentor;

import java.awt.Robot;
import java.util.Random;

/**
 * The Class MousePointerMover.
 */
public class MousePointerMover {

	/** The Constant TEN_SECONDS. */
	public static final int TEN_SECONDS = 10000;

	/** The Constant X_AXIS. */
	public static final int X_AXIS = 500;

	/** The Constant Y_AXIS. */
	public static final int Y_AXIS = 500;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws Exception
	 *             the exception
	 */
	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		Random random = new Random();
		while (true) {
			robot.mouseMove(random.nextInt(X_AXIS), random.nextInt(Y_AXIS));
			Thread.sleep(TEN_SECONDS);
		}
	}
}
