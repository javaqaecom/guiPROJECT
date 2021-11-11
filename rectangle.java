import java.awt.*;

public class rectangle extends Shape{
    //DATA
    public int width;
    public int hight;

    public rectangle(Color color, int x, int y, int width, int hight) {
        super(color, x, y);
        this.width = width;
        this.hight = hight;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);//הגדרת צבע למברשת
        g.fillRect(this.point.x, this.point.y,this.width,this.hight);

    }
}
