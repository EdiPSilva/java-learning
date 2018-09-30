package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {
	}

	public UsedProduct(String name, double price, String manufactureDate) throws ParseException {
		super(name, price);
		this.manufactureDate = sdf.parse(manufactureDate);
	}

	public String getManufactureDate() {
		return sdf.format(manufactureDate);
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName()+" (used) $"+super.getPrice()+" (Manufacture date: "+getManufactureDate()+")");
		return sb.toString();
	}
}
