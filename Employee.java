 public class Employee{
String name;
int age;
String city;
public void display()
                  {
System.out.println("the name is:"+name);
System.out.println("the age is "+age);
System.out.println("the city is "+city);
                  }
public static void main(String args[])
{
Employee  e1=new Employee();
e1.name="Harshitha";
e1.age=20;
e1.city="chennai";
e1.display();

Employee  e2=new Employee();
e2.name="Harshitha";
e2.age=20;
e2.city="banglore";
e2.display();
}
}