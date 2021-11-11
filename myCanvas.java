import java.awt.*;
import java.util.ArrayList;

public class myCanvas extends Canvas {
    //DATA
    public ArrayList<Shape> shapes;

    public myCanvas(){
        shapes = new ArrayList<Shape>();
        shapes.add( new Circle(Color.red, 50,50,40));
        shapes.add( new Circle(Color.green, 150,50,40));
        shapes.add( new Circle(Color.pink, 350,50,40));
        shapes.add( new rectangle(Color.cyan, 200,300,150,49));
        shapes.add( new rectangle(Color.blue, 200,400,150,49));
        shapes.add( new rectangle(Color.yellow, 200,200,150,49));
    }
    @Override
    public void paint(Graphics g) {
       for (Shape s: shapes)
           s.draw(g);
    }

    public void moveX(){
        for (Shape s: shapes)
            s.ShiftX();
        repaint();
    }
}
