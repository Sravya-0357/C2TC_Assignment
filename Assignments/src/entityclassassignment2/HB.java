package entityclassassignment2;

public class HB {
	private int count;
	private String name;
	private String Product;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	@Override
	public String toString() {
		return "HB count=" + count + ", name=" + name + ", Product=" + Product;
	}
	
}
