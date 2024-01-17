package org.pack1;

public class Test2 implements Test {

	@Override
	public void deposit() {
		System.out.println("Deposit is 20%");
	}

	@Override
	public void company() {
	     System.out.println("Company name is HCL");
	}

	@Override
	public void employee() {
		System.out.println("Employee name is Nivedha");
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		
	}
	}



