package com.jsp.hibernate_uni_directional_mapping.onetoone.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pan {

	@Id
	private String number;
	private String address;
	private LocalDate dob;
}
