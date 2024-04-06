//package com.tnsif.orderservice;
//
//	import java.util.List;
//
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.http.HttpStatus;
//	import org.springframework.http.ResponseEntity;
//	import org.springframework.web.bind.annotation.DeleteMapping;
//	import org.springframework.web.bind.annotation.GetMapping;
//	import org.springframework.web.bind.annotation.PathVariable;
//	import org.springframework.web.bind.annotation.PostMapping;
//	import org.springframework.web.bind.annotation.PutMapping;
//	import org.springframework.web.bind.annotation.RequestBody;
//	import org.springframework.web.bind.annotation.RestController;
//
//	import jakarta.persistence.NoResultException;
//	@RestController
//	public class OrderServiceController {
//
//		@Autowired
//		private OrderService order;
//		@GetMapping("/orderservice")
//		public List<OrderService> list()
//		{
//			return order.listAll();
//		}
//		@PostMapping("/orderservice")
//		public void add(@RequestBody OrderService order1)
//		{
//			order.save(order1);
//		}
//		@GetMapping("/orderservice/{id}")
//		public ResponseEntity<order>get(@PathVariable Integer id)
//		{
//			try {
//			OrderService o=order.get(id);
//			return new ResponseEntity<Orderservice>(o,HttpStatus.OK);
//			}
//			catch(NoResultException e)
//			{
//				return new ResponseEntity<OrderService>(HttpStatus.NOT_FOUND);
//			}
//		}
//		@DeleteMapping("/orderservice/{id}")
//		public void delete(@PathVariable Integer id)
//		{
//			order.delete(id);
//		}
//		
//		@PutMapping("/orderservice/{id}")
//		public ResponseEntity<OrderServicer>update(@PathVariable Integer id,@RequestBody OrderService update_o)
//		{
//			try {
//			OrderService exist_o=order.get(id);
//			exist_o.setName(update_o.getName());
//			exist_o.setEmail(update_o.getEmail());
//			exist_o.setPhonenumber(update_o.getPhonenumber());
//			order.update(exist_s);
//			return new ResponseEntity<OrderService>(exist_o,HttpStatus.OK);
//			}
//			catch(NoResultException e)
//			{
//				return new ResponseEntity<OrderService>(HttpStatus.NOT_FOUND);
//			}
//		}
//	}
//

package com.tnsif.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {
	@Autowired
    private OrderServiceSer service;
    
	@PostMapping("/customerservice")
	public void add(@RequestBody OrderService order) {
		service.insertRecord(order);
	}
	@GetMapping("/orderservice")
	public List<OrderService> ShowAll(){
		return service.getAllRecords();
	}
	@GetMapping("/orderservice/{id}")
	public OrderService getOrderById(@PathVariable Integer id)
	{
		return service.getCustomerById(id);
	}
	
	@DeleteMapping("/orderservice/{id}")
	public void deleteOrder(@PathVariable Integer id)
	{
		service.deleteCustomer(id);
	}
	
	@PutMapping("/customerservice/{id}")
	public ResponseEntity<String> updateOrderService(@PathVariable Integer id,@RequestBody OrderService updatedOrder)
	{
		service.updateOrderService(id,updatedOrder);
		return ResponseEntity.ok("Customer updated Successfully");
	}
		
		
}
