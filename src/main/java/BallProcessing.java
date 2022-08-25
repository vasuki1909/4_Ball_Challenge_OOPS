import processing.core.PApplet;

public class BallProcessing extends PApplet {

    public static final int HEIGHT = 800;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 20;
    int totalBalls = 4;
    Ball balls[] = new Ball[totalBalls];
    
    public static void main(String[] args) {
        PApplet.main("BallProcessing", args);
    }
    
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        balls = new Ball[totalBalls];
        for (int i = 0; i < totalBalls; i++) {
            int divisor= 5;
            balls[i] = new Ball(this, 0, (i+1)*HEIGHT/divisor, DIAMETER, (i+1));
        }
    }
    
    @Override
    public void draw() {
        for (int ball_count = 0; ball_count < totalBalls; ball_count++) {
            balls[ball_count].draw_ball();
        }
    }
}
