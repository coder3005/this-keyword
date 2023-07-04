/*this keyword*/
class A 
{
    A()
    {
        this(10); /*this time output will be '10' but if we remove this line then no output will come blank */
    }
    A (int a)
    {
        System.out.print(a);
    }
    public static void main(String[] args) {
        A r=new A();
    }
}
