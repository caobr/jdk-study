import java.util.Random;

public class Test{
	public static void main(String[] args){
		int[] nums = new int[15];
		int len = nums.length;
		Random random = new Random();
		
		System.out.println("随机生成100以内整数：");
		for(int i = 0; i< len; i++){
			//生成100以内整数
			nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		//冒泡对这个整数数组nums从小到大升序排序
		for(int i=0; i< len-1; i++){
			for(int j=0; j< len-1-i; j++){
				if(nums[j]>nums[j+1]){
					//交换位置
					nums[j+1] = nums[j]+nums[j+1];
					nums[j] = nums[j+1]-nums[j];
					nums[j+1] = nums[j+1]-nums[j];
				}
			}
		}
		System.out.println("升序排序后:");
		for(int i = 0; i< nums.length; i++){
			//nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		//冒泡对这个整数数组nums从大到小降序排序
		for(int i=0; i< len-1; i++){
			for(int j=0; j< len-1-i; j++){
				if(nums[j]<nums[j+1]){
					//交换位置
					nums[j+1] = nums[j]+nums[j+1];
					nums[j] = nums[j+1]-nums[j];
					nums[j+1] = nums[j+1]-nums[j];
				}
			}
		}
		
		
		System.out.println("降序排序后:");
		for(int i = 0; i< nums.length; i++){
			//nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
}