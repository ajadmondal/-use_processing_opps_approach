
public class CircleShape {
    private final int DIAMETER = 15;
    private int xAxis;
    private int yAxis;
    private int speed;
    TryProcessing processing;

    public CircleShape(int xAxis, int yAxis, int speed, TryProcessing processing) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.speed = speed;
        this.processing = processing;
    }

    public  void showSketch(){
        processing.ellipse(xAxis, yAxis, DIAMETER, DIAMETER);
        xAxis += speed;
    }
}
