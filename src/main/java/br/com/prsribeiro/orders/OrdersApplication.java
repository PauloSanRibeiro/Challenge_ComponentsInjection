package br.com.prsribeiro.orders;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.prsribeiro.orders.entites.Order;
import br.com.prsribeiro.orders.services.OrderService;

@SpringBootApplication
public class OrdersApplication implements CommandLineRunner {

	private OrderService orderService;

	public OrdersApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int code = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.printf(" \n [Output] \n Request Code: %d \n Amount: R$ %.2f%n ", order.getCode(),
				orderService.total(order));

	}

}
