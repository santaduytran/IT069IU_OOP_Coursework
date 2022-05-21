package Question3;

public class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        double distance(Point p) {
            double result;
            result = Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
            return result;
        }
}
