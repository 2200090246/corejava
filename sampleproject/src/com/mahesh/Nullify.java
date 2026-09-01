package com.mahesh;

public class Nullify {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nullify n = new Nullify();
	    Nullify n2 = new Nullify();
	    n = n2;
	    n2= null;
	    n = null;
		System.gc();

	}
	 public void finalize() {
        System.out.println("Object is garbage collected");
    }

}
