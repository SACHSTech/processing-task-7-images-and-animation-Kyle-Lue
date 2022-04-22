import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage imgBackground;
  PImage imgTurtle;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
    float fltCircleY = 0;
    float fltCircleX = 50;
    float fltSpeedY = 2;
    float fltSpeedX = 3;
    float fltImageX = 50;
    float fltImageY = 50;
    float fltImgSpeedX = 4;
    float fltImgSpeedY = 2;

  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    imgBackground = loadImage("Background.png");
    imgTurtle = loadImage("turtle.png");
    int intHeight = (int)(imgBackground.height * (float)1.5625);
    int intWidth = (int)(imgBackground.width *(float)1.5625);
    imgBackground.resize(intWidth, intHeight);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  background(32,32,32);
    image(imgBackground, 0, 0);
    fill(125,67, 180);
    image(imgTurtle, fltImageX, fltImageY);
    ellipse(fltCircleX, fltCircleY, 20, 20);

    fltCircleX = fltCircleX + fltSpeedX;
    fltCircleY = fltCircleY + fltSpeedY;
    
    fltImageX = fltImageX + fltImgSpeedX;
    fltImageY = fltImageY + fltImgSpeedY;

    fltSpeedY = fltSpeedY + (float)0.1;
    fltImgSpeedY = fltImgSpeedY + (float)0.001;

    //bounce off left and right
    if(fltCircleX < 0 || fltCircleX > width) {
    fltSpeedX = fltSpeedX * -1;
    }

   // bounce off top and bottom
    if(fltCircleY < 0 || fltCircleY > height) {
    fltSpeedY = fltSpeedY * -1;

    //bounce off left and right
    if(fltImageX < 0 +150 || fltImageX >= width - 150) {
    fltImgSpeedX = fltImgSpeedX * -1;
    }
  
     // bounce off top and bottom
    if(fltImageY < 0 + 150 || fltImageY >= height - 150) {
    fltImgSpeedY = fltImgSpeedY * -1;
    }
  }
  
  // define other methods down here.
  }
}