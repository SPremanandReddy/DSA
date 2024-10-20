package dsaArrayList;

import java.util.ArrayList;
import java.util.List;

class Order{
	private int orderId;
	private List<String> items;
	private boolean cashOnDelivery;
	Order(int id, List<String> list, boolean cashOnDelivery){
		this.orderId = id;
		this.items = list;
		this.cashOnDelivery = cashOnDelivery;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}
	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
}

public class OrderTester {
	public static List<String> getItems(List<Order> orders) {
		List<String> items = new ArrayList<String>();
		for(Order order: orders) {
			items.addAll(order.getItems());
		}
		return items;
	}
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<Order>();
		List<String> item1 = new ArrayList<String>();
		item1.add("Patsa");
		item1.add("friedrice");
		orders.add(new Order(1,item1,true));
		List<String> item2 = new ArrayList<String>();
		item2.add("chicken");
		item2.add("muton");
		orders.add(new Order(2,item2,false));
		
		List<String> allItems = OrderTester.getItems(orders);
		for(String name:allItems) {
			System.out.print(name+" ");
		}
	}
	
}
