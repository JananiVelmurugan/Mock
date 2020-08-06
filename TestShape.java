interface Shape{
  //Shape s = new Shape(); // cannot create instance for abstract class or an interface
  void draw();// by default all interface methods are public
}

class Square implements Shape{
 public void draw(){
  System.out.println("I am a Square");
 }
}

class Circle implements Shape{
 public void draw(){
  System.out.println("I am a Circle");
 }
}

public class TestShape{
 public static void main(String[] args){
  Shape shape1 = new Square();
  shape1.draw();
  Shape shape2 = new Circle();
  shape2.draw();


 }
}

