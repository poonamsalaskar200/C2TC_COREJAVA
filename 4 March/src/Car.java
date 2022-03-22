// About Class

public class Car {
	//member variables
   //member functions/methods
 int noofcars;
 String Model;
 void display()
 {
	 System.out.println("Welcome to Kia-Motors");
 }
 void display2()
 {
	 System.out.println("Welcome to Benz");
 }
 void display3()
 {
	 System.out.println("Welcome to Audi");
 }

 public static void main(String[] args)
 {
	//object creation
	 Car obj=new Car();
	 obj.display();
	 obj.display2();
	 obj.display3();
 }
}
