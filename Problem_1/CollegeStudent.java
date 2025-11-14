public class CollegeStudent extends Student
{
    protected String myMajor;
    protected int myYear;

    //constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major)
    {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    //get and set stuff
    public int getYear()
    {
        return myYear;
    }
    public void setYear(int year)
    {
        myYear = year;
    }

    public String getMajor()
    {
        return myMajor;
    }
    public void setMajor(String major)
    {
        myMajor = major;
    }

    //tostring
    @Override
    public String toString()
    {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }
}





// String myMajor = major;
// int myYear = year;
