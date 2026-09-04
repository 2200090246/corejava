//TASK: Write a java program to get the count of objects created for a class

package com.tasks;

public class Test {
	static int count = 0; // here i have given static because it will not change when new object get created like instance variable
	
	//below i am creating a instance block which will get executed when a new object is created so here i am increasing count to get how many objects are created
	{
		count++; // here for increasing count i used increment operation i used post increment operator
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t= new Test();
		Test t2 = new Test();
		System.out.println(count+" objects were created in this program");
	}

}
