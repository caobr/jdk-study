import java.util.Random;
import java.util.Arrays;
/**
*/
public class TestArrays{
	public static void main(String[] args){
		int[] nums = new int[15];
		int len = nums.length;
		Random random = new Random();
		
		System.out.println("随机生成100以内整数：");
		for(int i = 0; i< len; i++){
			//生成100以内随机整数
			nums[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(nums));
		
		//Arrays工具类中的复制方法
		int[] numsNew = Arrays.copyOf(nums, nums.length);
		Arrays.sort(numsNew);
		System.out.println(Arrays.toString(numsNew));
		
		int[] numsNew1=new int[numsNew.length+5];
		//System类中的复制方法
		System.arraycopy(numsNew, 0, numsNew1, 2, numsNew.length);
		System.out.println(Arrays.toString(numsNew1));
		
		//数组填充值
		Arrays.fill(numsNew1, 188);
		System.out.println(Arrays.toString(numsNew1));
	}
	
	
 
}