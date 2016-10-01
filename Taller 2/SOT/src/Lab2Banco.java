import java.util.*;

public class Lab2Banco {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int a = Integer.valueOf(sc.nextLine());
		int b = Integer.valueOf(sc.nextLine());
		int[] va = new int[a];
		int[] vb = new int[b];
		for (int j = 0; j < va.length; j++) {
			va[j] = Integer.valueOf(sc.nextLine());
		}
		for (int j = 0; j < vb.length; j++) {
			vb[j] = Integer.valueOf(sc.nextLine());
		}
		Thread t1 = new Thread(new Lab2BancoA(va, a, 0, 0));
		Thread t2 = new Thread(new Lab2BancoA(vb, b, 0, 0));
		System.out.println("Sin sincronización:");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
//		for (int i = 0; i < 60; i++) {
//			System.out.println("Intento " + i);
//			t1 = new Thread(new Lab2BancoA(va, a, 0, 0));
//			t2 = new Thread(new Lab2BancoA(vb, b, 0, 0));
//			t1.start();
//			t2.start();
//			
//			try {
//				t1.join();
//				t2.join();
//			} catch (Exception e) {
//				System.out.println("Ups.");
//			}
//			
//		}
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		System.out.println("Usando semaforos:");
		t1 = new Thread(new Lab2BancoB(va, a));
		t2 = new Thread(new Lab2BancoB(vb, b));
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Usando monitores:");
		t1 = new Thread(new Lab2BancoC(va, a));
		t2 = new Thread(new Lab2BancoC(vb, b));
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
//		for (int i = 0; i < a; i++) {
//			pa += Integer.valueOf(sc.nextLine());
//		}
//		for (int i = 0; i < b; i++) {
//			pb += Integer.valueOf(sc.nextLine());
//		}
//		System.out.println(pa+pb);
	}
	
}

