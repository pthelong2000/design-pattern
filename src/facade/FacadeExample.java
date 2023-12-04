package facade;

public class FacadeExample {

    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacadeImpl();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}

interface ShapeFacade {

    void drawSquare();
    void drawCircle();
    void drawRectangle();
}

class ShapeFacadeImpl implements ShapeFacade {

    private Square square;
    private Circle circle;
    private Rectangle rectangle;

    public ShapeFacadeImpl() {
        this.square = new Square();
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    @Override
    public void drawSquare() {
        square.draw();
    }

    @Override
    public void drawCircle() {
        circle.draw();
    }

    @Override
    public void drawRectangle() {
        rectangle.draw();
    }
}

class Circle {

    void draw() {
        System.out.println("draw circle");
    }
}

class Square {

    void draw() {
        System.out.println("draw square");
    }
}

class Rectangle {

    void draw() {
        System.out.println("draw rectangle");
    }
}