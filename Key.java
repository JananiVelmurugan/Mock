class Base{
 int a;
 Base(){}
 Base(int a){
  this();
  this.a = a;
 }
}

class Derived extends Base{
 Derived(){super(10) super.a =10}
}

public class Key{
}
