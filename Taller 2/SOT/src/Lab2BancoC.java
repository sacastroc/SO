
public class Lab2BancoC implements Runnable{
	int[] nums;
	static int sum;
	static int cuenta;
	static int temp;
	
	public Lab2BancoC(int[] nums, int sum) {
		this.nums = nums;
		this.sum = sum;
	}
	
	public static synchronized void add (int[] nums){
		cuenta = 0;
		temp = 0;
		sum = 0;
		for (int i : nums) {
			temp = i;
			cuenta = temp + sum;
			sum = cuenta;
		}
		System.out.println(sum);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		add(nums);
	}
	
}
