package org.starking.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.starking.repositories.OrderRepository;

@ApplicationScoped
public class OrderService {
	
	@Inject
	private OrderRepository orderRepository;

}
