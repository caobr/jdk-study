import java.util.Random;

public class TestSort2{
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
		System.out.println("���������:");
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		
		//ѡ������ ��С������������
		for(int i=0; i< len-1; i++){
			for(int j=i+1; j< len; j++){
				if(nums[i] < nums[j]){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("���������:");
		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
}