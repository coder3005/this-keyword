/*this keyword*/
class A 
{
    int a
    A(int a)
    {
       this.a=a; /*if we do not write 'this.' then output will be '0' this time it will print '100' */
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        A r=new A(100);
        r.show();
    }
}
