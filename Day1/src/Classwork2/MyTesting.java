package Classwork2;

import Classwork.AccessDemo;

public class MyTesting extends AccessDemo{
  public static void main(String[] args) {
	  AccessDemo z= new AccessDemo();//ctrl+shif+o shortcut to import anything
	  System.out.println("This is My Testing class");
	  System.out.println(z.name);
//	  System.out.println(z.age);//age is available inside the package as it is default constructor
	  //We need to find a way to call protected variable
	  MyTesting xyz= new MyTesting();
	 System.out.println(xyz.grade);
  }
}
