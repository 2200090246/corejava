//Task: Write a program to count the number of objects created using loops and check how many objects are eligible for garbage collector;
public class CountOfObjects {
	static int count = 0; // As we want to increase count when new object created we are using static variable
	
	static{
		System.out.println("Counting number of objects created");
	}
	{
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			CountOfObjects c = new CountOfObjects();
		}
		System.out.println("No of objects created : "+count);
		System.gc();

	}
	@Override
	protected void finalize() {
		// TODO Auto-generated method stub
		System.out.println("object is eligible for gc");
	}

}
