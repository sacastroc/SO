import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class AkkaTutorial {
	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
		ActorSystem system=ActorSystem.create("Hola");
		ActorRef helloActor = system.actorOf(new Props(HelloActor.class), "hola");
		helloActor.tell("hello",null);
		ActorRef helloActor2 = null;
		helloActor2.tell("hello",null);
		system.shutdown();
		system.awaitTermination();//JOIN
	}
}
class HelloActor extends UntypedActor{
	@Override
	public void onReceive(Object message) throws Exception {
		if(message instanceof String ) {
			String s=(String)message;
			switch (s){
				case "hello":{
					System.out.println("hello you");
					break;
				}default:
					System.out.println("huu?");
			}
		}else{
		unhandled(message);
		
		}
	}
}