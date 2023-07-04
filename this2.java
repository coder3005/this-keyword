/*this keyword*/
class A 
{
    A()
    {
        System.out.print("Abhi Gupta");
    }
    A (int a)
    {
        this(); /*this time out will be 'Abhi Gupta100' if we remove 'this' keyword then output will be '100' */
        System.out.print(a);
    }
    public static void main(String[] args) {
        A r=new A(100);
    }
}
