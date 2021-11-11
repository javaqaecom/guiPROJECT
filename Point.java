public class Point {
    public int x ;
    public int y ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void shiftx(){
        this.x+=20;
    }
    public void shifty(){
        this.y+=50;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
