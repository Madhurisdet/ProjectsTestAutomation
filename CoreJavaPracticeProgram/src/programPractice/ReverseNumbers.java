package programPractice;

public class ReverseNumbers {

	public static void main(String[] args) {
		//taking input from user
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num= sc.nextInt();
//1st approch
		//logic for reversing number
		/*int rev=0;
		while(num != 0) {
		rev= rev*10 + num%10;
		num= num/10;}*/
		
//2nd approch :using string buffer class
		/*StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println("Reverse number is :"+rev);*/
		
//3rd approch : using string builder class
		/*StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println("reverse number is :"+rev);
	}
	*/
	}
}
