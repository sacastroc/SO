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
		ActorRef helloActor = system.actorOf(new Props(HelloActor.class), "hola");
		helloActor.tell("hello",null);
		ActorRef helloActor2 = null;
		helloActor2.tell("hello",null);
		system.shutdown();
		system.awaitTermination();//JOIN
	}
}
//class HelloActor extends UntypedActor{
//	@Override
//	public void onReceive(Object message) throws Exception {
//		if(message instanceof String ) {
//			String s=(String)message;
//			switch (s){
//				case "hello":{
//					System.out.println("hello you");
//					break;
//				}default:
//					System.out.println("huu?");
//			}
//		}else{
//		unhandled(message);
//		
//		}
//	}
//}