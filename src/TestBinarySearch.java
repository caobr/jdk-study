import java.util.Random;
import java.util.Arrays;
/**
���ֲ���  �������ź��������
*/
public class TestBinarySearch{
	public static void main(String[] args){
		int[] nums = new int[15];
		int len = nums.length;
		Random random = new Random();
		
		System.out.println("�������100����������");
		for(int i = 0; i< len; i++){
			//����100�����������
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
		//ѡ������ ��С������������
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
		System.out.println("�����:");
		//Arrays����
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
 
}