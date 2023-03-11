package org.starking.controllers;

import javax.inject.Inject;
import javax.ws.rs.Path;

import org.starking.repositories.OrderRepository;

@Path(value = "/order")
public class OrderController {
	
	@Inject
	private OrderRepository orderRepository;

}
