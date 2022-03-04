package com.springboot.h2.restapi.ex.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.h2.restapi.ex.MainApplication;

/**
 * @author isahmoudi
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class PricesControllerTest {
	@LocalServerPort
	private int port;

	/**
	 * Example of Integration Test 
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@Test
	public void test1() throws ClientProtocolException, IOException {

		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost("http://localhost:" + port + "/api/product");
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("date", "2020-06-14-10.00.00"));
		params.add(new BasicNameValuePair("productId", "35455"));
		params.add(new BasicNameValuePair("brandId", "1"));
		httpPost.setEntity(new UrlEncodedFormEntity(params));
		CloseableHttpResponse response = client.execute(httpPost);
		Assertions.assertEquals(200, response.getStatusLine().getStatusCode());
		client.close();

	}

}
