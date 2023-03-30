package BasicJava;
class  Parent {
	public void info(int a , int b){
		System.out.println("integer vaules are: "+a+ " " + b );
	}
	public void info (String a , String b) {
		System.out.println("string vaules are :"+a+ " "+ b );
}
	public void info (int a, char b) {
		System.out.println("integer vaule are:"+ a+" char vaule are:"+b );
	}
	
}
public class Overloding_demo extends Parent {

	public static void main(String[] args) {
		Overloding_demo o= new Overloding_demo();
		o.info(120, 71);
		o.info("kcs","kcr");
		o.info(90, 'k');
		

	}

}
