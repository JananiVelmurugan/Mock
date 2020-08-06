public class VarDemo{
 static int staticVar;
 int instanceVar;
 public static void main(String[] args){
  int localVar = 10;
  System.out.println(staticVar);
  VarDemo demo = new VarDemo();
  System.out.println(demo.instanceVar);
  System.out.println(localVar);
 }
} 
