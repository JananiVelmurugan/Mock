public class ExcDemo{
 public static void main(String[] args) {
 try{
   System.out.println(4/2);
   System.out.println("Janani".charAt(5));
 }catch(ArithmeticException e){
  System.out.println(e);
  System.out.println(e.getMessage());
 }  
catch(StringIndexOutOfBoundsException e){
  System.out.println(e);
  System.out.println(e.getMessage());
 }  
 }
}
