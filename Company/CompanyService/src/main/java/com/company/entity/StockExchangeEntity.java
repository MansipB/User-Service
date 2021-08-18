package com.company.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "stock_exchange")
public class StockExchangeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String stockExchangeName;

	@Column(length = 1000)
	private String brief;
	@Column(nullable = false)
	private String contactAddress;

	@ManyToMany(mappedBy = "stockExchanges")
	@JsonIgnore
	private List<CompanyEntity> companies;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public StockExchangeEntity() {
		super();
	}

	public List<CompanyEntity> getCompanies() {
		return companies;
	}

	public void setCompanies(List<CompanyEntity> companies) {
		this.companies = companies;
	}

}
