import java.util.Random;

/**
ѡ������
*/
public class TestSort3{
	public static void main(String[] args){
		int[] nums = new int[25];
		int len = nums.length;
		Random random = new Random();
		
		System.out.println("�������100����������");
		for(int i = 0; i< len; i++){
			//����100�����������
			nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		
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
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		//��������
		sortDesc( nums, len);
	}
	
	
	
	private static void sortDesc(int[] nums, int len){
		int maxIndex;
		//ѡ������ ��С������������
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
		System.out.println("�����:");
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
}