import org.code.neighborhood.*;

public class PainterPlus extends Painter {

 public void turnRight(){
   turnLeft();
   turnLeft();
   turnLeft();
 }

  public void moveMore(int spaces) {
    int i = spaces;
    while (i > 0) {
      move();
      i--;
    }
  }
  
  }



