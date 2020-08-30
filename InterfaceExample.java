interface Sum{
    void summation();   //Compiler will Provide  " public abstract " automatically
}
interface Subtract{
    public abstract void subtraction(); //Here We provided the " public abstract " 
}
class Operation implements Sum,Subtract{      // " Multiple Inheritance " has used .
    int a,b;
    Operation(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public void summation()
    {
        System.out.println(a+b);
    }
    @Override
    public void subtraction()
    {
        System.out.println(a-b);
    }
}
public class InterfaceExample {
    public static void main(String args[])
    {
        Operation obj=new Operation(10,5);
        obj.summation();
        obj.subtraction();
    }
}
