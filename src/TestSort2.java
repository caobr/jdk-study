import java.util.Random;

public class TestSort2{
	public static void main(String[] args){
		int[] nums = new int[25];
		int len = nums.length;
		Random random = new Random();
		
		System.out.println("随机生成100以内整数：");
		for(int i = 0; i< len; i++){
			//生成100以内随机整数
			nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		int temp;
		for(int i=0; i< len-1; i++){
			for(int j=i+1; j< len; j++){
				if(nums[i] > nums[j]){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("升序排序后:");
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		
		//选择排序法 从小到大升序排序
		for(int i=0; i< len-1; i++){
			for(int j=i+1; j< len; j++){
				if(nums[i] < nums[j]){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("降序排序后:");
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
}