package bridge;

public class Main {
    public static void main(String[] args) {
        Color redColor = new Red();
        Color blueColor = new Blue();

        Shape redCircle = new Circle(redColor);
        Shape blueCircle = new Circle(blueColor);

        redCircle.draw();
        blueCircle.draw();
    }
}
