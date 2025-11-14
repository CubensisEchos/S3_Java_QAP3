public interface Scalable
{

    public abstract void scale(double factor);

    default void displayScalable()
    {
        System.out.println("Think object is scalable");
    }

    public static void staticInfo()
    {
        System.out.println("This object can be scaled");
    }

}
