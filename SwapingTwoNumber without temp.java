package Java_task1;

public class SwapingTwoNumber {

	public static void main(String[] args) {
				int mysalary=40;
				int frdsalary=70;
				int first=120;
				int second=150;
				System.out.println("before swaping"+"mySalary:"+mysalary+"frdsalary:"+frdsalary);
				System.out.println("before swaping"+"first:"+first+"second:"+second);	
				int temp=mysalary;
				frdsalary=mysalary;
				frdsalary=temp;
			//System.out.println("--------------------------------");
				//without using third person
				first=first-second;
				second=second+first;
				first=second-first;
				System.out.println("after swaping"+"mySalary:"+mysalary+"frdsalary:"+frdsalary);
				System.out.println("after swaping"+"first:"+first+"second:"+second);	
	}

}
