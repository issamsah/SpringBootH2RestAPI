package com.springboot.h2.restapi.ex.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.h2.restapi.ex.service.PricesService;

/**
 * @author isahmoudi
 *
 */
@RestController
public class PricesController {

	@Autowired
	PricesService pricesService;

	/**
	 * Example of web Service using POST method
	 * 
	 * @param date
	 * @param productId
	 * @param brandId
	 * @return
	 * 
	 */
	@PostMapping(value = "/api/product", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	private Map<String, Object> selectProduct(
			@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss") Date date,
			@RequestParam("productId") int productId, @RequestParam("brandId") int brandId) {
		Map<String, Object> res = pricesService.getSelectProduct(date, productId, brandId);
		return res;
	}
}