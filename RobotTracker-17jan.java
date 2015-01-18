
public class RobotTracker implements Runnable {
  private IdealRobot robot;
  
  //The 'final' indicates this is a constant
  private final int SLEEP_INTERVAL=100; 	//Run every 100ms

  private double totalMetersRight=0;
  private double totalMetersLeft=0;
  private double totalMeters=0;


  public RobotTracker(IdealRobot r) {
    this.robot=r;
  }

  /** 
   * Try to track total distance traveled
   */
  private void logDistance(float leftMPS, float rightMPS, float mSec) {
    //TODO: Add calculation
    totalMetersRight += 0;
    totalMetersLeft += 0;
    totalMeters += 0;
  }

  /** 
   * This is a background task/thread that runs independently of the main() program
   * 
   */
  public void run() {
    //Create some temporary variables
    float left, right;		//create some temporary variables

    //Get Robot Name
    String robotName = "";

    try {
      while (true) {
        //TODO: Make this run 
        Thread.sleep(1000);	      //Wait 1000ms 
        right = robot.getRightMPS();  //Get position
        left = robot.getLeftMPS();    //Get position

        //TODO: Don't print if the robot is stopped
        //Print robot name and speed
        System.out.println(robotName + " Speed: L=" + left + " mps R=" + right + " mps");

        //TODO: Call method to track distance
        // Hint: check out the skeleton method above
        //logDistance(?, ?, ?)

      }
    }
    //If the 'sleep' method is interrupted, this thread is being shut down
    catch (InterruptedException e) {
      //TODO: Change print statement to show distance(s) traveled
      double metersTraveled = 0;
      System.out.println("Done.  Approximate Distance Traveled: " + metersTraveled );
    }
  }
}
 

        

