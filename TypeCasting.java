package asg;

public class TypeCasting {

	public static void main(String[] args) {
		//Implicit TypeCasting
		int x=5; //4byte
		double y=x; //8byte
		System.out.println(y);
		
		//Explicit TypeCasting
		double a=20.2;
		int b=(int)a;
		System.out.println(b);

	}

}
