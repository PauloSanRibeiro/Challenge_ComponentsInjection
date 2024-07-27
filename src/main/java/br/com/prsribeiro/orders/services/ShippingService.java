package br.com.prsribeiro.orders.services;

import org.springframework.stereotype.Service;

import br.com.prsribeiro.orders.entites.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {

		double shipmentValue = 0.00;
		double basic = order.getBasic();

		if (basic < 100.00) {

			shipmentValue = 20.00;

		} else if (basic > 100.00 && basic < 200.00) {

			shipmentValue = 12.00;

		} else if (basic > 200.00) {

			shipmentValue = 0;

		}
		return shipmentValue;
	}

}
