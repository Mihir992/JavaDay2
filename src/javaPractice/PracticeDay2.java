package javaPractice;

public class PracticeDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Virat Kohli";
		System.out.println(name);
		name="MSD";
		System.out.println(name);
		
		//final is a keyword in which we cannot change the value//
		final String name1 = "Virat Kohli";
		System.out.println(name1);
		
		//WHILE LOOP
		int a =5;
		while(a>0){
			System.out.println(a);
			a--; // decrement (a=a-1)
		}
		System.out.println("Loop ended when value of a was " + a);
		
		//Do while loop
		do {
			System.out.println(a);
			a--;
		}while(a > 5);
		System.out.println("Loop ended when value of a was " + a);
		
		//for loop
		for(int b=5;b>0;b--) {
			System.out.println(b);
			if(b==3)
				break; //abruptly stop the loop
			continue; //skipped the loop once and it will go ahead
		}
	
		//System.out.println("Loop ended when value of b was " + b);
	}
}
