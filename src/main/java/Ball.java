import processing.core.PApplet;

public class Ball {
    PApplet pApplet;
    private int width;
    private int height;
    private int diameter;
    private int rateOfSpeed;

    public Ball(){
    }

    public Ball(PApplet pApplet, int width, int height, int diameter, int rateOfSpeed) {
        this.pApplet = pApplet;
        this.width = width;
        this.height = height;
        this.diameter = diameter;
        this.rateOfSpeed = rateOfSpeed;
    }

    public void draw_circle(){
       pApplet.ellipse(width,height,diameter,diameter);
        width+=rateOfSpeed;
    }
}
