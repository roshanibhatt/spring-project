package com.bway.springmvcproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="dept_tbl")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public int id;
public String dept_name;
public String dept_head;
public String dept_phone;

}
