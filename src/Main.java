import java.awt.AWTException;
import java.awt.Robot;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Main {
	public static final int DELAY = 600000;
	public static final int MAX_Y = 400;
	public static final int MAX_X = 400;

	public static void main(String[] args) throws Exception {

		// ***** This is for mouse movement just in case the keypress option doesn't work for you. *****
		// Robot robot = new Robot();
		// Random random = new Random();

		// while (true){
		// 	robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
		// 	Thread.sleep(DELAY);
		// }

		Timer timer = new Timer();
		int delay = 5000; // This will wait x number of milliseconds before it will start pressing the key.
		int period = 600000; // After the application has started, it will wait x number of milliseconds before it executes again.

		timer.scheduleAtFixedRate(new TimerTask(){
			public void run() {
				try {
					Robot robot = new Robot();

					robot.keyPress(17); //ctrl key
					robot.keyRelease(17); //ctrl key

				} catch (AWTException e) {
					e.printStackTrace();
				}
			}
		}, delay, period);

		System.out.printf("ZombiePress is running... It is sending Ctrl key every %s(ms). Type Ctrl + c to exit.", period);
	}
}