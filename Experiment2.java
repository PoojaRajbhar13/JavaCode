

//CONSTRUCTOR OVER LOADINHG



class Student1
{
    private String  name;
    private int age;
    public Student1()
 {
    this("Rohit",19);       //USING THIS MATHODE
    System.out.println("Default Constructor is called");
     name="Rohan";
    age=18;

 } 
     public Student1(String name)
 {  
    this.name=name;
    age = 18;

 }
 public Student1(String name,int age)
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

public class Experiment2 {

    public static void main(String[] args){

   
        Student1 st1=new Student1();
        st1.disp();
     
        Student1 st2=new Student1("Rohit");
        st2.disp();
     
        Student1 st3=new Student1("Rohit",19);
        st3.disp(); 
    }
}  
    

