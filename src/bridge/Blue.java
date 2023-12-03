package bridge;

public class Blue implements Color {

    @Override
    public void color(String shape) {
        System.out.println(shape + " blue");
    }
}
