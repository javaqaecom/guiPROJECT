import java.awt.*;

public class Circle extends Shape{
    //DATA
    public int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.point.x,this.point.y,this.radius*2,this.radius*2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", point=" + point +
                '}';
    }
}
