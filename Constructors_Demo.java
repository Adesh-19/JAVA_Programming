
class Demo
{

    public Demo()
    {
        System.out.println("Inside default constructor");
    }

    public Demo(int i,int j)
    {
        System.out.println("Inside parametrized constructor");
    }


}

class Constructors_Demo
{
    public static void main(String A[])
    {

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);

    }
}