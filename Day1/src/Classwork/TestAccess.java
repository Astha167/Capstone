package Classwork;

public class TestAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessDemo x= new AccessDemo();
		System.out.println("This is Test Access");
		System.out.println(x.age);
		System.out.println(x.name);
		System.out.println(x.grade);
		//System.out.println(x.percentage);//Error says that percentage is not visible as this is the private keyword.

	}

}
