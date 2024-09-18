
public class Maxconsecutiveones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] arr= {1,1,0,1,1,1};
				int count=0;
				int max=0;
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==1) {
						count++;
						max=Math.max(max, count);
					}  else {
						count=0;
					}
				}
				System.out.println(max);
			}
}
