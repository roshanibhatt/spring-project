package com.bway.springmvcproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="usertbl")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int id;
public String fname;
public String lname;
@Column(unique=true)
public String username;
public String password;
public String address;
}
