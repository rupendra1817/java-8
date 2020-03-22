package com.interview.test;

public class TestMemberOuter1 {
	 private int data= 30;
	 static int b= 5;
	 
	 class Inner{
		 private int a = 10;
		 void msg(){
			 System.out.println("Data: "+ data);
			 System.out.println("Static data: "+ b);
		 }
	 }
	 
	 public static void main(String[] args) {
		TestMemberOuter1 outerClass=new TestMemberOuter1();
		Inner inner=outerClass.new Inner();
		inner.msg();
		System.out.println(inner.a);
		
	}
}
