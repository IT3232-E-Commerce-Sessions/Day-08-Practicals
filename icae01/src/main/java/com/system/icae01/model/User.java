package com.system.icae01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private String id;
	private String name;
	private int age;
	private String gender;
	
	
}
