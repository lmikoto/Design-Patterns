package SimpleFactor;

public class Cilent {

    public static void main(String[] args) {
        Shape shape;
        shape = ShapFactory.getShape("rect");
        shape.draw();

        shape = ShapFactory.getShape("rect");

        shape.draw();

        shape = ShapFactory.getShape("triangle");

        shape.draw();
    }
}
