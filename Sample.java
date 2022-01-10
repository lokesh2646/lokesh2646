
public class Sample{
    void display()
    {
    try
    {
    int a[]=new int[8];
    a[9]=7;
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    System.out.println("java is not a joke");
    }
    public static void main(String args[]){
        Sample obj=new Sample();
        obj.display();
    }
}
