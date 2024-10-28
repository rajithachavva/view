package array;

public class palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String r ="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
System.out.println(r);
System.out.println(s.equals(r));
	}

}
