package com.springboot.h2.restapi.ex.service;

import java.util.Date;
import java.util.Map;

/**
 * @author isahmoudi
 *
 */
public interface IPricesService {
	/**
	 * Select Product using 
	 * @param date
	 * @param productId
	 * @param brandId
	 * @return
	 */
	public Map<String, Object> getSelectProduct(Date date, int productId, int brandId);
}
