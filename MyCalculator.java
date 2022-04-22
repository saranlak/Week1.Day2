package Week1.Day2;

public class MyCalculator {

	
	public static void main(String[] args) {	
		
		Calculator calobj=new Calculator();
		
		System.out.println(calobj.addition(10,20,30));
		System.out.println(calobj.substraction(10,20));
		System.out.println(calobj.multiplication(10,20));
		System.out.println(calobj.division(25,5));
	}
}
