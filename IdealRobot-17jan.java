/*
/ TeamIllusion 4464 Java Tutorial Code
*/
public class IdealRobot {
  //TODO: Add any other constants you may need here, note 'final' keyword
  final float SOME_CONSTANT = 1234.56f;

  // BEGIN DON'T TOUCH THESE!!
  // 'Experimentally' determined constants:
  // At R=1.5, L=-1.5 rev/sec, robot rotates 11.1 deg CW per millesecond
  final float ROTATE_RATE_RPS = 1.5f;
  final float ROTATE_MSEC_PER_DEGREE = 11.1f;
  //
  // END DON'T TOUCH THESE

  //Add any other instance variables you may need here:
  float leftRevPerSec = 0;
  float rightRevPerSec = 0;


  //TODO: Add name to default constructor
  public IdealRobot() {
    //Think about any extra initialization you may need to do
    //instanceVariableName = methodParameterName; 
  }

  //TODO: Rename this method to something that makes more sense
  //Are we really 'moving' it, or doing something different
  public void move(float leftMPS, float rightMPS) {
     //TODO: Calculate desired RPM from MPS. Note: You'll need some new constants
     this.leftRevPerSec = leftMPS;
     this.rightRevPerSec = rightMPS;

     System.out.println("Robot speed set to L="+ leftMPS + " mps, R=" + rightMPS + " mps");
  }

  //TODO: Alternatively, write a move method that looks like this:
  public boolean moveForward(float meters) {
    //TODO: Do some magic, wait some time, and if all goes well:
    return true;
  }

  public float getRightMPS() {
    //TODO Calculate this value too, opposite of what you did for Move()
    return rightRevPerSec;  // RPS is not the right answer!
  }

  public float getLeftMPS() {
    //TODO Calculate this value too, opposite of what you did for Move()
    return leftRevPerSec;  // RPS is not the right answer!
  }

  public void stop() {
    move(0,0);
    //TODO: Add debug out messages
  }  

  public void rotate(int angle) {
    //TODO: Figure out what you need to do here
  }
}
