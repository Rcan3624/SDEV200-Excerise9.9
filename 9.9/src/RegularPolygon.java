public class RegularPolygon {
    // Private data fields
    private int n;            // Number of sides
    private double side;      // Length of each side
    private double x;         // x-coordinate of the center
    private double y;         // y-coordinate of the center

    // No-arg constructor with default values
    public RegularPolygon() {
        this.n = 3;         // Default to a triangle
        this.side = 1.0;    // Default side length
        this.x = 0.0;       // Default x-coordinate
        this.y = 0.0;       // Default y-coordinate
    }

    // Constructor with specified number of sides and side length, centered at (0,0)
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor with specified number of sides, side length, and coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor methods
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Mutator methods
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to get the perimeter of the polygon
    public double getPerimeter() {
        return n * side; // Perimeter = number of sides * length of each side
    }

    // Method to get the area of the polygon
    public double getArea() {
        // Area = (n * side^2) / (4 * tan(PI / n))
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    // Main method for testing the RegularPolygon class
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon(); // Default polygon
        System.out.println("Default Polygon: Perimeter = " + polygon1.getPerimeter() + ", Area = " + polygon1.getArea());

        RegularPolygon polygon2 = new RegularPolygon(5, 2.0); // Pentagon with side length 2
        System.out.println("Pentagon: Perimeter = " + polygon2.getPerimeter() + ", Area = " + polygon2.getArea());

        RegularPolygon polygon3 = new RegularPolygon(6, 3.0, 1.0, 1.0); // Hexagon with side length 3 at (1,1)
        System.out.println("Hexagon: Perimeter = " + polygon3.getPerimeter() + ", Area = " + polygon3.getArea());
    }
}
