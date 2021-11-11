import java.awt.*;

public abstract class Shape {
    public Color color ;
    public Point point;

    public Shape(Color color, int x,int y) {
        this.color = color;
        this.point = new Point(x,y);
    }
    public abstract void draw(Graphics g);

    public void ShiftX(){
        this.point.shiftx();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", point=" + point +
                '}';
    }
}
