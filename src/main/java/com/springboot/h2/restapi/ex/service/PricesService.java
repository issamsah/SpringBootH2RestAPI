package com.springboot.h2.restapi.ex.service;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.h2.restapi.ex.model.Prices;
import com.springboot.h2.restapi.ex.repository.PricesRepository;

/**
 * @author isahmoudi
 *
 */
@Service
public class PricesService implements IPricesService {

	@Autowired
	PricesRepository pricesRepository;

	/**
	 * @see IPricesService.getSelectProduct
	 *
	 */
	@Override
	public Map<String, Object> getSelectProduct(Date date, int productId, int brandId) {
		List<Prices> listRes = pricesRepository.findSelectProduct(date, productId, brandId).stream()
				.sorted(Comparator.comparingInt(Prices::getPriority).reversed()).collect(Collectors.toList());
		if (!listRes.isEmpty()) {
			Map<String, Object> res = new HashMap<String, Object>();
			res.put("PRODUCT_ID", listRes.get(0).getProductID());
			res.put("BRAND_ID", listRes.get(0).getBrandId());
			res.put("PRICE_LIST", listRes.get(0).getPriceList());
			res.put("START_DATE", new DateTime(listRes.get(0).getStartDate(), DateTimeZone.forID("CET"))
					.toString(DateTimeFormat.forPattern("yyyy-MM-dd-HH.mm.ss")));
			res.put("END_DATE", new DateTime(listRes.get(0).getEndDate(), DateTimeZone.forID("CET"))
					.toString(DateTimeFormat.forPattern("yyyy-MM-dd-HH.mm.ss")));
			res.put("PRICE", listRes.get(0).getPrice());
			res.put("CURR", listRes.get(0).getCurr());
			return res;

		}
		return null;
	}

}