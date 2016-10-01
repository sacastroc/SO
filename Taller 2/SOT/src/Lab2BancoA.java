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
	public void run() {
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
	
//	public static void main(String[] args) throws InterruptedException {
//		Scanner sc = new Scanner(System.in);
//		int a = Integer.valueOf(sc.nextLine());
//		int b = Integer.valueOf(sc.nextLine());
//		int[] va = new int[a];
//		int[] vb = new int[b];
//		for (int i : va) {
//			i = Integer.valueOf(sc.nextLine());
//		}
//		for (int i : vb) {
//			i = Integer.valueOf(sc.nextLine());
//		}
//		Thread t1 = new Thread(new Lab2BancoA(va));
//		Thread t2 = new Thread(new Lab2BancoA(vb));
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//		System.out.println(t1);
//		System.out.println(t2);
//	}
	
}
