//Task: write a program and check how garbage collector works
package com.mahesh;

public class Nullify {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nullify n = new Nullify();//when i create object named n it will referenced to one object like n -> object1
	    Nullify n2 = new Nullify();//when i create object named n2 it will referenced another object like n2 -> onject2
	    n = n2;//here we are saying that now hey n from now you don't have to refer object1 you have to refer object 2 like n -> object 2 and n2 -> object 2
	    n2= null;//here when we null the n2 then it will be unreachable 
	    n = null;//here when we null the n then it will be unreachable
		System.gc();// when we call this system.gc() it will automatically collect the unreferenced objects 

	}
	//to confirm that garabage collector called we will use finalize method actually JVM automatically calls garbage collector and at that time it will call finalize method as we want to print something that we want so we are overriding it from object class
	 public void finalize() {
        System.out.println("Object is garbage collected");
    }

}
