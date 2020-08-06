class InvalidMobileException extends Exception{
 public InvalidMobileException(String msg){
  System.out.println(msg);
 }
}

public class UserExc{
 public static void main(String[] args){
  String mobile ="12345678901";
try{
  if(mobile.length()!=10){
   throw new InvalidMobileException("Please Enter 10 digit mobile number");
  }else{
   System.out.println("Valid Mobile");
  }
 }catch(InvalidMobileException e){
  System.out.println(e);
 }
 
 }
}

