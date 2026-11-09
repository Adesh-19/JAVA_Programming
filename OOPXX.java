
class Arithmetic
{
    public int No1;
    public int No2;

    Arithmetic()
    {
        this.No1 = 0;
        this.No2 = 0;
    }

    Arithmetic(int i,int j)
    {
        this.No1 = i;
        this.No2 = j;
    }

    public int Addition()
    {

        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;

    }

    public int Substraction()
    {

        int Ans = 0;
        Ans = this.No1 - this.No2;
        return Ans;
    }




}

class OOPXX
{
    public static void main(String A[])
    {

        Arithmetic aobj1 = new Arithmetic(21,10);

        int Result = 0;

        Result = aobj1.Addition();

        System.out.println("Addition is : "+Result);

        Result = aobj1.Substraction();

        System.out.println("Substraction is : "+Result);

    }
}