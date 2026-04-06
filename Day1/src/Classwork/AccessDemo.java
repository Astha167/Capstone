package Classwork;

public class AccessDemo {

	
		// TODO Auto-generated method stub
         int age=36;//Default
         public String name="demo";//public
         private float percentage=76.65f;//private
         protected char grade='b';//protected
         
         public static void main(String[] args) {
        	 System.out.println("Welcome to access demo class");
        	 AccessDemo aa= new AccessDemo();
        	 System.out.println("my age: "+aa.age);
        	 System.out.println("I scored:"+aa.percentage);
        	 System.out.println("My grade is: "+ aa.grade);
        	 System.out.println("My name is :"+ aa.name);
        	 
         }

}
