package BasicJava;

class AddAndEven {

	public static void main(String[] args) {
		int a= 10;
		int even=0 ,odd=0;
		System.out.println("even"+ "     "  + "odd");
		for(int i=0; i<=a; i++) {
			if(i%2==0) {
				even++;
				System.out.println(i);
			}
			else {
				odd++;
				System.out.print(i+"        ");
			}
			
		}
	}
}
 