package programPractice;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		//1st approach:
		int a=10,b=30;
		System.out.println("Before Swapping numbers:"+"a=" +a+" " +"b=" +b);
		
		//here will perform swapping opration
		int t=a;
			a=b;
			b=t;
			System.out.println("After swapping:"+ "a="+a +" "+"b="+b);
			
		
	}

}
