
public class ConditionalJava{

    public static void main(String args[]){
int x=10;
 int y=20;
  int a=30;
  String lname="java";
  String iname="programming";
   if(x<y && y<x || x<a && x<y && a<y || y>a) 
   { 
   System.out.println("y grater than x ,y value is" + y); 
   
   } 
   else if(!(x>a) && !(a>x) || x<a && a>y && y>a) 
   {
       System.out.println(y);
   }
   else if(x<a ^ (x>a) && (y>a) | (a<x))
   {
        System.out.println("a is grater than x"+a);
         } 
         else if(lname=="c" | iname=="programming" && (x<a) & (a>y))
         {
             System.out.println("Java Programming");
         }
         else
{ 
System.out.println("x grater than y ,x value is" +x); 

}

}

}


