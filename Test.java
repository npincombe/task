public class Test {
    public static void main(String[] args) {
        MonitorDevice md = new MonitorDevice();

        CircleCollection cc = new CircleCollection();
        cc.add(new Circle(10, 10, 50));
        cc.add(new Circle(5, 5, 20));
        cc.drawToDevice(md);

        SquareCollection sc = new SquareCollection();
        sc.add(new Square(20, 30, 50));
        sc.drawToDevice(md);

        RectangleCollection rc = new RectangleCollection();
        rc.add(new Rectangle(40, 20, 25, 55));
        rc.drawToDevice(md);

        PointCollection pc = new PointCollection();
        pc.add(new Point(60, 60));
        pc.drawToDevice(md);
    }
}
