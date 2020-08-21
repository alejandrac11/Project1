package Payments;

public class Payment {	
	
	float payment =0;
	
	void getPayment (Student[] students) {
		
		float totalPayments = sumPayments( students[0].payment);
		float greatestPayment = students[0].payment;
		
		for (int i = 1; i<students.length; i++) {
			if (greatestPayment>students[i].payment) {
				greatestPayment = students[i].payment;
			} 
			 totalPayments = sumPayments(students[i].payment); 
		}	
		 getDiffAvg(totalPayments, students.length, greatestPayment);
		
	}
	
	float sumPayments (float pay) {
		payment += pay;
		return payment;
	}
	
	void  getDiffAvg(float totalPayments, int quantity, float greatestPayment ) {
		float average = totalPayments/quantity;
		float diff = greatestPayment - average;
		System.out.println("Difference between payment average and student with the greatest payment is:" + diff);
			
	}
	
}
