
abstract class Bankers
{
    abstract void display ();
    abstract void show();
    abstract void clr();
 }
class Accounts extends Bankers
    {
        void display ()
        {
            int x=4;
            int y=8;
            int z=9;
            int g=4;
        if((x<y) && (y<z)&&(z>y)&&(g>z))
            {
                System.out.println("SBI 🏦 SBI 🏦 SBI");
                System.out.println("Hello sir/madam Welcome to SBI BANK 🏦");
                System.out.println("Enter your account number:0000000000000");
                System.out.println("PLEASE ENTER IFC CODE:sbi00000");
                System.out.println("ENTER LOCATION: HYDERABAD");
                
             }
      else if((x>y)&&(y<z)&&(x>z)&&(g<x))
            {
                System.out.println("BOB BANK OF BARODA with Barosaa");
                System.out.println("Hello sir/madam welcome to Bank of Baroda BANK 🏦");
                System.out.println("Enter your account number:00000000000");
                System.out.println("PLEASE ENTER IFC CODE:Bob00000");
                System.out.println("ENTER LOCATION: KOLKATA");
                
      }
      else if((x<z)&&(z>y)&&(z>x)&&(g<y))
           {
        System.out.println("HDFC selection for growth HDFC HDFCHDFCHDFC");
    System.out.println("hello sir/madam welcome to HDFC BANK 🏦");
    System.out.println("Enter your account number:0000000090");
                System.out.println("PLEASE ENTER IFC CODE:hdf0000");
                System.out.println("ENTER LOCATION: VIJAYAWADA");
                
                
}
     else if((x>y)&&(y<z)&&(z>y)&&(g<x))
     {
         System.out.println("UNION BANK 🏦 UNION BANK 🏦 UNION");
    System.out.println("hello sir/madam welcome to UNION BANK ");
    System.out.println("Enter your account number:000000000");
                System.out.println("PLEASE ENTER IFC CODE:union00000");
                System.out.println("ENTER LOCATION: KARNATAKA");
}
else
{
    System.out.println("WELCOME TO BANKING :Choose your Bank");
    System.out.println("Enrer: values x:4 y:5 z:7 g:8 for SBI");
    System.out.println("Enrer: values x:8 y:5 z:7 g:6 for BOB");
    System.out.println("Enrer: values x:3 y:5 z:7 g:4 for HDFC");
    System.out.println("Enrer: values x:7 y:6 z:7 g:5 for UNION");
}
}
   void show()
   {
       int i=10;
       int h=1000;
       if(h<10000)
       {
       while(i<=10)
       {
           System.out.println("name:");
           System.out.println("work type:");
           System.out.println("eligible: status:");
           i++;
           }
           }
           else
         {
    System.out.println("Not eligible:");
       }
   }
   void clr()
   {
       int i=4;
       do
      {
          System.out.println("Welcome to net Banking 🏧");
          System.out.println("Enrer= values x:4 y:5 z:7 g:8 for SBI");
    System.out.println("Enrer= values x:8 y:5 z:7 g:6 for BOB");
    System.out.println("Enrer=values x:3 y:5 z:7 g:4 for HDFC");
    System.out.println("Enrer= values x:7 y:6 z:7 g:5 for UNION");
    
       i++;
      }while(i<=4);
   }
}
public class Aaccount
{
    public static void main(String args[]){
        Accounts a=new Accounts();
        a.display();
        a.show();
        a.clr();
    }
}
