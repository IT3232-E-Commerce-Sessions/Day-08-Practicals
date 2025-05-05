package com.system.icae01.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class FoodItem {
	@Id
	private String id;
	private String name;
	private String price;
	private String weight;
	
	@ManyToMany(mappedBy = "foodItems")
    private List<DailyMenu> dailyMenus;
	
	
}
