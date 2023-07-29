package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(10, new Date(), OrderStatus.DELIVERED);
		System.out.println(order.toString());
		OrderStatus os1 = new OrderStatus.valueOf("Qualquercoisa");
		System.out.println(os1);
	}

}
