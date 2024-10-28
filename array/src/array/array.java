package array;

public class array {
	public static void main(String[] args) {
		int[]arr = {10,20,30,40,50};
		int sum = 0 ;
		int avg =0;
		for(int i =0;i<arr.length;i++) {
			sum =sum+i;
		
		}
avg =sum/arr.length;
if(avg>90) {
	System.out.println("grade A");
	
}
else if(avg>80) {
	System.out.println("grade B");
	
	}
else if(avg>70) {
	System.out.println("grade C");
}
else if(avg>60) {
	System.out.println("grade D");
}
else {
	System.out.println("Fail");
}}}
	
