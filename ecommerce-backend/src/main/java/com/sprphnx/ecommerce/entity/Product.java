package com.sprphnx.ecommerce.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private byte active;

	@CreationTimestamp
	private LocalDateTime  dateCreated;

	private String description;

	@Column(name="image_url")
	private String imageUrl;

	@UpdateTimestamp
	private LocalDateTime lastUpdated;

	private String name;

	private String sku;

	@Column(name="unit_price")
	private BigDecimal unitPrice;

	@Column(name="units_in_stock")
	private int unitsInStock;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private ProductCategory productCategory;
	
}