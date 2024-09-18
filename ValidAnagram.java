import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cat";
		String t="act";
		s.toLowerCase();
		t.toLowerCase();
		if(s.length()==t.length()) {
			char[] charArray1=s.toCharArray();
			char[] charArray2=t.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result=Arrays.equals(charArray1,charArray2);
			if(result) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		else {
			System.out.println(false);
		}
	}
}
