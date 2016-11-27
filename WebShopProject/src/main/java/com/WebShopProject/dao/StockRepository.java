package com.WebShopProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebShopProject.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{

}
