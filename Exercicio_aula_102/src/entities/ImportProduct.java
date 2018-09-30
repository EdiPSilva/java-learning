package entities;

public class ImportProduct extends Product {
	
	private double customsFee;

	public ImportProduct() {
	}

	public ImportProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return super.getPrice() + getCustomsFee();
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName()+" $"+totalPrice()+" (Customs fee: $"+getCustomsFee()+")");
		return sb.toString();
	}
}