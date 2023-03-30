package BasicJava;
 // if a subclass or child class  has the same name methods as declared in the parent class, 
//its the methods overriding method
class Smdad{
	void singar() {
		System.out.println(" kcs is  a pro singar");
	}
}
class Child extends Smdad{
	void singar () {
		super.singar();
		System.out.println("hema papa is a pro pro singar");
		System.out.println(" vishalini papa same pro pro singer");
	}
}
class Child1 extends Smdad{
	void singar() {
		System.out.println("sm is pro singer");
		System.out.println("kcs is a pro pro singer");
	}
}

public class Overridingdemo {

	public static void main(String[] args) {
		Child c = new Child ();
	     c.singar();
		Child1 c1 = new Child1();
		c1.singar();
		

	}

}
