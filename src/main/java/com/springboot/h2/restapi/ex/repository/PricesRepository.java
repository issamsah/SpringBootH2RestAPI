package com.springboot.h2.restapi.ex.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.h2.restapi.ex.model.Prices;

/**
 * @author isahmoudi
 *
 */
public interface PricesRepository extends CrudRepository<Prices, Integer> {
	@Query("SELECT p FROM Prices p WHERE p.productId = :productId AND p.brandId= :brandId And :date BETWEEN p.startDate AND p.endDate")
	List<Prices> findSelectProduct(@Param("date") Date date, @Param("productId") int productId,
			@Param("brandId") int brandId);
}