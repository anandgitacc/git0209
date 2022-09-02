package org.employee;

//            class
public class EmployeeDetails {
	
	//           method 1
	private void employeeName() {
		
		System.out.println("Employee Name : Anand");
	}
	
	//            method 2
	private void employeeMobile() {
		
		System.out.println("Employee Mobile : 8939278836");
	}
	private void empAdd() {
		System.out.println("Chennai-Omr");
	}
	private void empId() {
		System.out.println("employee id : 1234");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> 73456a789d4a2a1a5e0dddaf8ae20b3e576b1673
	
	//               main method
	public static void main(String[] args) {
		
		//             obj
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.employeeName();
		e.employeeMobile();
		
	}

}
