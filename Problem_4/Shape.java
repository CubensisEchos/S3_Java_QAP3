public abstract class Shape implements Scalable
{
    private String name;

    //constructor
    public Shape(String name)
    {
        this.name = name;
    }

    //get and set stuff
    public String getName()
    {
        return name;
    }

    //abstract methods
    public abstract double area();
    public abstract double perimeter();

    //tostring
    @Override
    public String toString()
    {
        return name + " (Area: " + area() + ", Perimeter: " + perimeter() + ")";
    }
}
