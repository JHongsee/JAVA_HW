package edu.pnu.edit;

import java.util.List;
import java.util.ArrayList;
import edu.pnu.shape.*;

public class Editor {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape s) {
        if(s instanceof Rectangle) {
            Rectangle r = (Rectangle) s;
            shapes.add(r);
        }
        else if(s instanceof Circle) {
            Circle c = (Circle) s;
            shapes.add(c);
        }
    }

    public void clear() {
        shapes.clear();
    }

    public void list() {
        System.out.println(shapes.toString());
    }
}
