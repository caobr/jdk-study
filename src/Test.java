import java.util.Random;

public class Test{
	public static void main(String[] args){
		int[] nums = new int[15];
		int len = nums.length;
		Random random = new Random();
		
		System.out.println("�������100����������");
		for(int i = 0; i< len; i++){
			//����100��������
			nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		//ð�ݶ������������nums��С������������
		for(int i=0; i< len-1; i++){
			for(int j=0; j< len-1-i; j++){
				if(nums[j]>nums[j+1]){
					//����λ��
					nums[j+1] = nums[j]+nums[j+1];
					nums[j] = nums[j+1]-nums[j];
					nums[j+1] = nums[j+1]-nums[j];
				}
			}
		}
		System.out.println("���������:");
		for(int i = 0; i< nums.length; i++){
			//nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		//ð�ݶ������������nums�Ӵ�С��������
		for(int i=0; i< len-1; i++){
			for(int j=0; j< len-1-i; j++){
				if(nums[j]<nums[j+1]){
					//����λ��
					nums[j+1] = nums[j]+nums[j+1];
					nums[j] = nums[j+1]-nums[j];
					nums[j+1] = nums[j+1]-nums[j];
				}
			}
		}
		
		
		System.out.println("���������:");
		for(int i = 0; i< nums.length; i++){
			//nums[i] = random.nextInt(100);
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
}