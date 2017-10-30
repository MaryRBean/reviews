package com.reviews.Reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	protected Map<Long, Review> reviews = new HashMap<Long, Review>();
	//long id, String title, String img, String reviewCategory, String reviewContent
	public ReviewRepository() {
		Review england = new Review(1993,"England", "/images/england.jpg", "Europe", "Temperate weather, rains every three days. Food can be bland, so use curry.");
		Review cambodia = new Review(2015,"Cambodia", "/images/cambodia.jpg", "Asia", "Hot and humid. Lots of cute kids running the streets, the occasional monkey and horse.");
		Review malaysia = new Review(2014,"Malaysia", "/images/malaysia.jpg", "Asia", "Hot and humid, constant sweating, amazing mix of Indian, Chinese and Thai influence on the food.");
		Review mexico = new Review(2012, "Mexico", "/images/mexico.jpg", "N.America", "Hot weather, amazing spicy food, watch out for cow tongue tacos. 10/10 recommend this country." );
	
		reviews.put(england.getId(), england);
		reviews.put(cambodia.getId(), cambodia);
		reviews.put(malaysia.getId(), malaysia);
		reviews.put(mexico.getId(), mexico);
	}
	
	public Collection<Review> findAll(){
		return reviews.values();
	}
	
	public Review findOne(long id) {
		return reviews.get(id);
	}
	
}
