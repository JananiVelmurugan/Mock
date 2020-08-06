public class Employee{
 private int id;
 private String name;
 // private static String company;
 
 public Employee(){
  System.out.println("Default Constructor");
 }
 
 public Employee(int id, String name){
  //System.out.println("Parameterised Constructor");
  this.id = id;
  this.name = name;
 }
 
 public int getId(){
  return id;
 }
 public void setId(int id){
  this.id = id;
 }
 
 public String getName(){
  return name;
 }
 public void setName(String name){
  this.name = name;
 }
 public String toString(){
  return "id: " + id + " name: "+ name;
 }
}
