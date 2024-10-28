package array;

public class split {

	public static void main(String[] args) {
		String s= "hello world this is anu";
          String[]arr=s.split(" ");
          for(int i =0;i<arr.length;i++) {
        	  if(arr[i].length()%2==0) {
        		  System.out.println(arr[i]);
        	  }
          }
	}

}
