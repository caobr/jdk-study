import java.util.Random;

/**
选择排序法
*/
public class TestSort3{
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
		
		
		int minIndex;
		//选择排序法 从小到大升序排序
		for(int i=0; i< len-1; i++){
			minIndex =i;
			int temp = nums[i];
			for(int j=i+1; j< len; j++){
				if(temp > nums[j]){
					minIndex = j; 
					temp = nums[j];
				}
			}
			if(minIndex != i){
				nums[minIndex] = nums[i]+nums[minIndex];
				nums[i] = nums[minIndex]-nums[i];
				nums[minIndex] = nums[minIndex]-nums[i];
			}
		}
		System.out.println("排序后:");
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		//降序排序
		sortDesc( nums, len);
	}
	
	
	
	private static void sortDesc(int[] nums, int len){
		int maxIndex;
		//选择排序法 从小到大升序排序
		for(int i=0; i< len-1; i++){
			maxIndex =i;
			int temp = nums[i];
			for(int j=i+1; j< len; j++){
				if(temp < nums[j]){
					maxIndex = j; 
					temp = nums[j];
				}
			}
			if(maxIndex != i){
				nums[maxIndex] = nums[i]+nums[maxIndex];
				nums[i] = nums[maxIndex]-nums[i];
				nums[maxIndex] = nums[maxIndex]-nums[i];
			}
		}
		System.out.println("排序后:");
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
}