import java.util.Scanner;


import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class Lab2Akka {
	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
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
		ActorSystem system=ActorSystem.create("Hola");
		ActorRef helloActor = system.actorOf(new Props(Lab2BancoA.class), "C1");
		helloActor.tell(va,null);
		ActorRef helloActor2 = system.actorOf(new Props(Lab2BancoA.class), "C2");
		helloActor2.tell(vb,null);
		system.shutdown();
		system.awaitTermination();
	}
}
class Lab2BancoA extends UntypeActor{
	int [] numbers;
	int sum;
	int cuenta;
	int temp;
	
	public Lab2BancoA(int[] numbers, int sum, int cuenta, int temp) {
	this.numbers = numbers;
	this.sum = sum;
	this.cuenta = cuenta;
	this.temp = temp;
	
}
public void run(int[] numbers) {
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

