public class Demo
{
    public static void main(String[] args) {
        
        //person
        Person varg = new Person("Varg Vikernes", 34, "M");
        System.out.println(varg);

        //student
        Student scott = new Student("Scoot Ian", 17, "M", "HS1991", 3.7);
        System.out.println(scott);

        //teacher
        Teacher mrKilmister = new Teacher("Ian Kilmister", 48, "M", "Music Theory", 80000);
        System.out.println(mrKilmister);

        //college student
        CollegeStudent shieme = new CollegeStudent("Shieme Moriyama", 21, "F", "UCB1989", 3.0, 2, "English");
        System.out.println(shieme);
    }
}
