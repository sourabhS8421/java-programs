//import java.util.scanner;
class Num1{
	Num1(){
	System.out.println("Hello I am in constructor of parent class");
	}

	public void subnum(){
	System.out.println("Hello I am in method of parent class");
	}
}
class Num2 extends Num1{

	Num2(){
	System.out.println("Hi");
	}
	public void subnum2(){
	System.out.println("I am in method of derived class");
	}
}
public class java_pro1{
	public static void main(String[] args){
	
	/*num1 obj = new num1();
	obj.num1();
	obj.subnum();*/
	
	Num2 obj1 = new Num2();
	/*obj1.subnum2();
	obj1.subnum();*/
}
}