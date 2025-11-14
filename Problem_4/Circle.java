public class Circle extends Shape
{
    private double radius;

    //constructor
    public Circle(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }

    //get and set stuff
    public double getRadius()
    {
        return radius;
    }

    //maths/methods
    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    //scale form scalable
    @Override
    public void scale(double factor)
    {
        radius *= factor;
    }

    //tostring
    @Override
    public String toString()
    {
        return super.toString() + " (Radius: " + radius + ")";
    }
}
