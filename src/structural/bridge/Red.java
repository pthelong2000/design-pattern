package structural.bridge;

public class Red implements Color {

    @Override
    public void color(String shape) {
        System.out.println(shape + " red");
    }
}
