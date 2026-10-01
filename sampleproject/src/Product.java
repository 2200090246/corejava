
public class Product {
	int product_id;
	String product_name;
	int price;
	int quantity;
	public Product(int product_id, String product_name, int price, int quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(Product p,int quantity) {
		this.product_id=p.product_id;
		this.product_name=p.product_name;
		this.price=p.price;
		this.quantity=quantity;
		
	}
	public void calculateTital() {
		int total = price*quantity;
		System.out.println("Total price of product "+product_name+" each "+product_name+" Costs: "+price+" for "+quantity+" "+product_name+" cost is "+total);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product(1,"laptop",60000,1);
		p.calculateTital();
		Product p1 = new Product(p,2);
		p1.calculateTital();
		

	}

}
