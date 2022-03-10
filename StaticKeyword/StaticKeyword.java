// Demonstrate use of static var, static method,and static 
// block in a single prog.

class Student{  
    String name;  
    static String college ="Maharaja Surajmal";//static variable 
 
    //constructor  
    Student(String name){  
      this.name = name;  
    }  
   
     void displayName(){
        System.out.print("\nName of the student :: " + name);
     }  
 
     // static method
     static void displayClg() {
       System.out.print("\nCollege name :: " + college);
     }
 
   //static block 
   static {
     System.out.print("\n" + college + " is listed under top 5 colleges ");
   }
 }  
 
class StaticKeyword{  
    public static void main(String... args) {  
      Student s = new Student("Ayush Pun");  
      s.displayName();  
      Student.displayClg();  
    }  
 }