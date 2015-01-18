//Main Program
public class RobotDemo {
  public static void main(String args[])
    throws InterruptedException {
      System.out.println("Starting Up");

      //creates robot object
      IdealRobot robot = new IdealRobot();
      //TODO: Change IdealRobot so this command works instead:
      //IdealRobot robot = new IdealRobot("Bob");

      //creates thread to monitor robot
      Thread rt = new Thread(new RobotTracker(robot));  
      rt.start();

      boolean keepGoing = true;

      for(int x=0 ; x < 8 ; x++) {
        //This should cause the robot to move in a square, twice 
        robot.move(10,10);
        Thread.sleep(2000);
        robot.rotate(90); 
      }
      //TODO: Add a debug message here
      robot.stop();
      Thread.sleep(5000);

      while(keepGoing) {
        robot.move(10,10);
        Thread.sleep(2000);
        robot.stop();
        Thread.sleep(2000);
     
        //TODO: go write this method so we can get out of here
        //keepGoing = !(robot.hasHitSomething());
      }

      //TODO: Add anyting else you want to do/print



      //If the program gets this far, kill off the robot monitor
      rt.interrupt();
  }
}
