import java.util.Random;
import java.util.Arrays;
/**
*/
public class TestArrays{
	public static void main(String[] args){
		int[] nums = new int[15];
		int len = nums.length;
		Random random = new Random();
		
		System.out.println("�������100����������");
		for(int i = 0; i< len; i++){
			//����100�����������
			nums[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(nums));
		
		//Arrays�������еĸ��Ʒ���
		int[] numsNew = Arrays.copyOf(nums, nums.length);
		Arrays.sort(numsNew);
		System.out.println(Arrays.toString(numsNew));
		
		int[] numsNew1=new int[numsNew.length+5];
		//System���еĸ��Ʒ���
		System.arraycopy(numsNew, 0, numsNew1, 2, numsNew.length);
		System.out.println(Arrays.toString(numsNew1));
		
		//�������ֵ
		Arrays.fill(numsNew1, 188);
		System.out.println(Arrays.toString(numsNew1));
	}
	
	
 
}