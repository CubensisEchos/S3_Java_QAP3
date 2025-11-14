public class Demo
{
    //scale all the shapes
    public static void scaleAll(Scalable[] shapes, double factor)
    {
        System.out.println("\nScaling all shapes by factor of: " + factor);
        for (Scalable s : shapes)
        {
            s.scale(factor);
        }
    }

    public static void main(String[] args)
    {
        Circle circle = new Circle("Circle1", 5);
        Ellipse ellipse = new Ellipse("Ellipse1", 2, 4);
        Triangle triangle = new Triangle("Triangle1", 3, 4, 5);
        EquilateralTriangle equilateral = new EquilateralTriangle("Equilateral", 6);

        //store shapes
        Scalable[] shapes = {circle, ellipse, triangle, equilateral};

        //pre-scale print
        System.out.println("Before scaling: ");
        for (Scalable s : shapes)
        {
            System.out.println(s);
        }

        //scaling
        double factor = 2.0;
        scaleAll(shapes, factor);

        //post-scaling print
        System.out.println("\nAfter scaling: ");
        for (Scalable s : shapes)
        {
            System.out.println(s);
        }

        //default and static methods
        circle.displayScalable();
        Scalable.staticInfo();
    }
}
