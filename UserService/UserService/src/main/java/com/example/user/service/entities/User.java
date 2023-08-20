package com.example.user.service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {
	
	@Id
	@Column(name="ID")
	private String userId;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="About")
	private String about;
	
	

}
