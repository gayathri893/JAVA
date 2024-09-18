
public class Besttimetosellandbuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,6,4,3,1};
		int[] res=new int[prices.length];
		res[0]=prices[0];
		int profit=0;
		for(int i=1;i<prices.length;i++) {
			res[i]=Math.min(res[i-1], prices[i]);
		}
		for(int i=0;i<prices.length;i++) {
			profit=Math.max(profit, prices[i]-res[i]);
		}
		System.out.print("The profit is: "+profit);
		
	}

}
