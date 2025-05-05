package com.system.icae01.model;

import jakarta.persistence.*;

@Entity
public class OrderLine {
	@Id
	private String id;
	private String quantity;
	
	 @ManyToOne
	 @JoinColumn(name = "order_id")
	 private FoodOrder foodOrder;

	 @ManyToOne
	 @JoinColumn(name = "food_item_id")
	 private FoodItem foodItem;
	
}
