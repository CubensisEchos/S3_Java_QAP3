public class Triangle extends Shape
{
    private double side1;
    private double side2;
    private double side3;

    //constructor
    public Triangle(String name, double side1, double side2, double side3)
    {
        super(name);
        if(side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2)
        {
            System.out.println("Error: Triangle side(s) entered are invalid");
            System.exit(1);
        }
        else
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    //Maths
    @Override
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea()
    {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
