package Payments;

public class Program {
	public static void main (String [] args) {
	
		Student [] students = new Student[3];
		
		
		Payment pay1 = new Payment();
		students[0] = new Student();
		students[0].name = "Brenda";
		students[0].payment = 10000;
		
		Payment pay2 = new Payment();
		students[1] = new Student(); 
		students[1].name = "Juan";
		students[1].payment = 30000;
		
		Payment pay3 = new Payment();
		students[2] = new Student();
		students[2].name = "Rob";
		students[2].payment = 25000;
		
		pay1.getPayment(students);
 }
}
