import java.util.ArrayList;
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
			
			for (int i = 0; i < child; i++) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
					}
				}).setName("child("+i+")");
			}
			
			for (int i = 0; i < adult; i++) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
					}
				}).setName("adult("+i+")");;
			}
			
		}
	
		
		
	}
	
}
