package shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapes2 = new ArrayList<>();

        Triangle t = new Triangle();
        t.x = 10;
        t.y = 20;
        t.r = 15;
        t.color = "red";
        shapes.add(t);

        Triangle t2 = (Triangle) t.clone();
        shapes.add(t2);

        cloneShape(shapes, shapes2);
    }

    private static void cloneShape(List<Shape> shapes, List<Shape> copy){
        for (Shape shape : shapes){
            copy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) != copy.get(i)){
                System.out.println(i + "Shapes are different");
            }
            else{
                System.out.println(i + "Shapes are the same");
            }
        }
    }
}
