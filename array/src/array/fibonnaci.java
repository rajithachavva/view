package array;

public class fibonnaci {

	public static void main(String[] args) {
		int num1 =0;
		int num2 =1;
		int num3 ;
		int k =10;
		for(int i =0;i<k;i++) {
			System.out.println(num1);
			num3 =num1+num2;
			num1=num2;
			num2=num3;
			
		}

	}

}
