import java.util.*;
public class CollDemo{
 public static void main(String[] args){
  System.out.println("-------LIST-------");
  List<Employee> list = new ArrayList<>();
  
  Employee e1 = new Employee(101,"Namrata");
  Employee e2 = new Employee(102,"Nihal");
  Employee e3 = new Employee(103,"Tanvi");

  list.add(e1);
  list.add(e2);
  list.add(e3);

  for(Employee e: list){
   System.out.println(e.getName());//prints specific property
   System.out.println(e);//prints entire emp obj
  }

  System.out.println("------------------");
  System.out.println("-------SET--------");
  Set<Employee> set = new HashSet<>();

  set.add(e1);
  set.add(e2);
  set.add(e3);

  for(Employee e: set){
   System.out.println(e.getName());//prints specific property
   System.out.println(e);//prints entire emp obj
  }
  System.out.println("------------------");
 
  System.out.println("-------MAP--------");
  Map<Integer,Employee> map = new HashMap<>();

  map.put(1,e1);
  map.put(2,e2);
  map.put(3,e3);

  for(Map.Entry<Integer,Employee> e : map.entrySet()){
   System.out.println(e);
   System.out.println(e.getKey());
   System.out.println(e.getValue());
  }
   System.out.println("------------------");
 } 
}
