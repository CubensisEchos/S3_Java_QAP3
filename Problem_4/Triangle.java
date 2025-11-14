public class Triangle extends Shape
{
    private double side1;
    private double side2;
    private double side3;

    //constructor
    public Triangle(String name, double side1, double side2, double side3)
    {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //get and set stuff
    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    //Maths/methods
    @Override
    public double area()
    {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter()
    {
        return side1 + side2 + side3;
    }

    //scael from scalable
    @Override
    public void scale(double factor)
    {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    //tostring
    @Override
    public String toString()
    {
        return super.toString() + " (Sides: " + side1 + ", " + side2 + ", " + side3 + ")";
    }
}
