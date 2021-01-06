package com.amelosbc.dsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amelosbc.dsdeliver.entities.Order;
import com.amelosbc.dsdeliver.entities.OrderStatus;
import com.amelosbc.dsdeliver.entities.Product;
import com.amelosbc.dsdeliver.entities.dto.OrderDTO;
import com.amelosbc.dsdeliver.repositories.OrderRepository;
import com.amelosbc.dsdeliver.repositories.ProductRepository;

@Service
public class OrderService {

	@Autowired   // injeção de dependencia via framework spring
	private OrderRepository repository;
	
	@Autowired   // injeção de dependencia via framework spring
	private ProductRepository productRepository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findOrderWithProducts() {
		List<Order> list = repository.findAll();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public OrderDTO insert (OrderDTO dto) {
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(),
				Instant.now(), OrderStatus.PENDING);
		for (com.amelosbc.dsdeliver.entities.dto.ProductDTO p: dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		order = repository.save(order);
		return new OrderDTO(order);
	}

}
