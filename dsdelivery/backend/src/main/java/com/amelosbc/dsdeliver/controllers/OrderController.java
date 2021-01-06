package com.amelosbc.dsdeliver.controllers;

import java.net.URI;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.amelosbc.dsdeliver.entities.Order;
import com.amelosbc.dsdeliver.entities.OrderStatus;
import com.amelosbc.dsdeliver.entities.dto.OrderDTO;
import com.amelosbc.dsdeliver.services.OrderService;

@RestController
@RequestMapping (value = "/orders")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll(){
		List <OrderDTO> list = service.findOrderWithProducts();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<OrderDTO> insert (@RequestBody OrderDTO dto) {
		dto = service.insert (dto);
		URI  uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping("/{id}/delivered")
	public ResponseEntity <OrderDTO> setDelivered(@PathVariable Long id) {
		OrderDTO dto = service.setDelivered(id);
		return ResponseEntity.ok().body(dto);
	}
}
