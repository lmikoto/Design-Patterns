package SimpleFactor;

public class ShapFactory {

    public static Shape getShape(String type){
        Shape shape = null;
        switch (type){

            case "rect":
                shape = new RectShape();
                break;
            case "circle":
                shape = new CircleShape();
                break;
            case "triangle":
                shape = new TriangleShape();
                break;
        }
        return shape;
    }
}
