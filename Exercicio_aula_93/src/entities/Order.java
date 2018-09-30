package entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public String getMoment() {
		return sdf.format(moment);
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment :"+getMoment()+"\n");
		sb.append("Order status :"+getStatus()+"\n");
		sb.append("Client: "+client.getName()+" ("+client.getBirthDate()+") - "+client.getEmail()+"\n");
		sb.append("Order items:\n");
		double total = 0;
		for (OrderItem i : items) {
			sb.append(i.getProduct().getName()+", $"+i.getPrice()+", Quantity: "+i.getQuantity()+", Subtotal: "+i.subTotal()+"\n");
			total += i.subTotal();
		}
		sb.append("Total price: $"+total);
		return sb.toString();
	}
}