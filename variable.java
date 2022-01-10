public class Sample{
    int a=1000;
    static
    {
        System.out.println("static variable in JAVA");
     }
     void show()
     {
         System.out.println("times better than local variable");
     }
    public static void main(String args[]){
        Sample obj=new Sample ();
        System.out.println(obj.a);
        obj.show();
    }
}
