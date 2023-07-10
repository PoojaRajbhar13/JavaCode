

//CONSTRUCTUR OVER LOADING




class Student
{
    private String  name;
    private int age;
    public Student()
 {
    System.out.println("Default Constructor is called");
     name="Rohan";
    age=18;

 } 
     public Student(String name)
 {  
    this.name=name;
    age = 18;

 }
 public Student(String name,int age)
 {
    this.name=name;
    this.age=age;

 } 
 public void disp()
 {
    System.out.println(name);
    System.out.println(age);
 }
}

public class Experiment {
    public static void main(String[] args){

   
        Student st1=new Student();
        st1.disp();
     
        Student st2=new Student("Rohit");
        st2.disp();
     
        Student st3=new Student("Rohit",19);
        st3.disp(); 
    }
}
