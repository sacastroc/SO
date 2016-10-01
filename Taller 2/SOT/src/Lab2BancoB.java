import java.util.concurrent.Semaphore;

public class Lab2BancoB implements Runnable {
	
	private final static Semaphore semap = new Semaphore(1);
	
	int[] nums;
	static int sum;
	static int cuenta;
	static int temp;
	
	public static int add(int[] nums) {
		try {
			semap.acquire();
		} catch (Exception e) {
			System.out.println("Error!!!");
		}
		cuenta = 0;
		temp = 0;
		sum = 0;
		for (int i : nums) {
			temp = i;
			cuenta = temp + sum;
			sum = cuenta;
		}
	    semap.release();
	    return sum;
	}
	
	public Lab2BancoB(int[] nums, int sum) {
		this.nums = nums;
		this.sum = sum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		add(nums);
		System.out.println(sum);
	}
	
	
	
}
