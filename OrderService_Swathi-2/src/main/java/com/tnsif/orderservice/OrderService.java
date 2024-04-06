package com.tnsif.orderservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
@Entity
public class OrderService {
	
		    @Id
		    @Column(name="Oid")
		    private Long id;
		    @Column(name="Oname")
		    private String name;
		    @Column(name="Oemail")
		    private String email;
		    @Column(name="Ophonenumber")
		    private String phonenumber;
			public OrderService(Long id, String name, String email, String phonenumber) {
				super();
				this.id = id;
				this.name = name;
				this.email = email;
				this.phonenumber = phonenumber;
			}
			public OrderService() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPhonenumber() {
				return phonenumber;
			}
			public void setPhonenumber(String phonenumber) {
				this.phonenumber = phonenumber;
			}
			@Override
			public String toString() {
				return "OrderService [id=" + id + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + "]";
			}
			
				
		    
	}

