import java.util.Scanner;

class Lab2BancoA implements Runnable{
	
	static int[] numbers;
	static int sum;
	static int cuenta;
	static int temp;
	
	public Lab2BancoA(int[] numbers, int sum, int cuenta, int temp) {
		this.numbers = numbers;
		this.sum = sum;
		this.cuenta = cuenta;
		this.temp = temp;
	}
	
	@Override
	public void run() { //Esto esta re mal deberia darle verguenza escribir un código así, Shame.... shaaame
		// TODO Auto-generated method stub
		sum = 0;
		cuenta = 0;
		temp = 0;
		for (int i : numbers) {
			temp = i;
			cuenta = temp + sum;
			sum = cuenta;
		}
		System.out.println(sum);
	}
	
	
}
