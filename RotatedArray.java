
public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		int j=0;
		int[] temp=new int[nums.length];
		for(int i=nums.length-k;i<nums.length;i++) {
			temp[j]=nums[i];
			j++;
		}
		for(int i=0;i<nums.length-k;i++) {
			temp[j]=nums[i];
			j++;
		}
		for(int e:temp) {
			System.out.print(e+" ");
		}

	}

}
