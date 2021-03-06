package org.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_details")
public class Item {
	@Id
	@Column(name = "item_id")
	private int id;
	@Column(name = "item_name")
	private String name;
	@Column(name = "item_qty")
	private int qty;
	@Column(name = "item_price")
	private double price;

	static int productCount;
	static {
		Item.productCount = 0;
	}

	public Item(int id, String name, int qty,double price) {
		super();
		Item.productCount++;
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public Item(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double getPrice(double price){
		this.price = price;
	}
	
	public void setPrice(){
		return price;
	}
}
