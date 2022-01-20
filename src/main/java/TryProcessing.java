import javafx.scene.shape.Circle;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 840;
    public static final int WIDTH = 740;
    private CircleShape firstCircle;
    private CircleShape fourthCircle;
    private CircleShape secondCircle;
    private CircleShape thirdCircle;

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        int relativeYAxisPosition = HEIGHT / 5;
        firstCircle = new CircleShape(0, relativeYAxisPosition, 1, this);
        secondCircle = new CircleShape(0, 2 * relativeYAxisPosition, 2, this);
        thirdCircle = new CircleShape(0, 3 * relativeYAxisPosition, 3, this);
        fourthCircle = new CircleShape(0, 4 * relativeYAxisPosition, 4, this);
    }

    @Override
    public void draw() {
        firstCircle.showSketch();
        secondCircle.showSketch();
        thirdCircle.showSketch();
        fourthCircle.showSketch();
    }
}
