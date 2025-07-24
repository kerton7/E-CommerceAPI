package com.alituran.test;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TestApp {


	   @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	   
	   @Bean
	   public ApplicationRunner runOnStartup(RestTemplate restTemplate) {
	       return args -> {
	           String baseUrl = "http://localhost:8080/rest/api";

	           try {
	               String orderProductResponse = restTemplate.getForObject(baseUrl + "/orderproduct/userid/1/productid/2/quantity/10", String.class);
	               System.out.println("\norderProduct method worked successfully: " + orderProductResponse);

	               String addFavouriteResponse = restTemplate.getForObject(baseUrl + "/addfavorite/userid/2/productid/1", String.class);
	               System.out.println("AddFavourite method worked successfully: " + addFavouriteResponse);

	               String buyProductResponse = restTemplate.getForObject(baseUrl + "/buyproduct/1/productnumbers/4", String.class);
	               System.out.println("buyProduct method worked successfully: " + buyProductResponse);
	               
	               String stockInformationResponse = restTemplate.getForObject(baseUrl + "/stockinformation/1/quantity/1", String.class);
	               System.out.println("stockInformation method worked successfully: "+ stockInformationResponse);
	           } catch (Exception e) {
	               System.out.println("An error occurred while calling services: " + e.getMessage());
	           }
	       };
	   }


}
