import java.util.Random;
import java.util.Arrays;
/**
二分查找  必须是排好序的数组
*/
public class TestBinarySearch{
	public static void main(String[] args){
		int[] nums = new int[15];
		int len = nums.length;
		Random random = new Random();
		
		System.out.println("随机生成100以内整数：");
		for(int i = 0; i< len; i++){
			//生成100以内随机整数
			nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		sortAsc(nums,len);
		int index = Arrays.binarySearch(nums, 5);
		System.out.println(index);
		
	}
	
	private static void sortAsc(int[] nums, int len){
		
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
		//Arrays方法
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
 
}