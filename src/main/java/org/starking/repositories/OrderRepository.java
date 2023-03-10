package org.starking.repositories;

import javax.enterprise.context.ApplicationScoped;

import org.starking.entities.OrderEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class OrderRepository implements PanacheRepository<OrderEntity>{

}
