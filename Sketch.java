import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage imgBackground = loadImage("Background.png");
  imgBackground = imgBackground.resize(imgBackground.width * (float) 1.5625) , imgBackground.height * (float) 1.5625;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
    float fltCircleY = 0;
    float fltCircleX = 50;
    float fltSpeedY = 2;
    float fltSpeedX = 3;

  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  background(32,32,32);
    fill(125,67, 180);
    ellipse(fltCircleX, fltCircleY, 20, 20);

    fltCircleX = fltCircleX + fltSpeedX;
    fltCircleY = fltCircleY + fltSpeedY;
    fltSpeedY = fltSpeedY + (float)0.1;

    //bounce off left and right
    if(fltCircleX < 0 || fltCircleX > width) {
    fltSpeedX = fltSpeedX * -1;
    }

   // bounce off top and bottom
    if(fltCircleY < 0 || fltCircleY > height) {
    fltSpeedY = fltSpeedY * -1;
  }
  
  // define other methods down here.
  }
}