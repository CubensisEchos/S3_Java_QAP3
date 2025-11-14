public abstract class Shape
{
    private String name;

    //constructor
    public Shape(String name)
    {
        this.name = name;
    }

    //abstract method
    public abstract double getArea();
    public abstract double getPerimeter();

    //get and set stuff
    public String getName()
    {
        return name;
    }

    //tostring
    @Override
    public String toString()
    {
        return this.name + " | Area: " + getArea() + " | Perimeter: " + getPerimeter();
    }
}