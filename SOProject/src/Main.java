import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Holass");
	}
	
	static class Boat{
		
		private static Semaphore boat = new Semaphore(0);
		private static int childrenWaitBoat;
		private static int oahuChildren;
		private static int oahuAdults;
		private static int molokaiChildren;
		private static int molokaiAdults;
		private static int messenger;
		private static boolean boatOnOahu;
		private static Lock Oahu;
		private static Lock Molokai;
		
		
		public static void begin(int adult, int child){
			oahuChildren = child;
			oahuAdults = adult;
			molokaiChildren = 0;
			molokaiAdults = 0;
			childrenWaitBoat = 0;
			boatOnOahu = true;
			
			Random r = new Random();
			int numChild = r.nextInt(50);
			int numAdult = r.nextInt(50);
			
			for (int i = 0; i < numChild; i++) {
				new Children(0,i);
			}
			
			for (int i = 0; i < numAdult; i++) {
				new Adult(0,i);
			}
			
			
		}
	
		
		
	}
	
}
