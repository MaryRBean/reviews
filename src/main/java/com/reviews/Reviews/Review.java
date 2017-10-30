package com.reviews.Reviews;
//for content of reviews

//string instance variable for reviews

public class Review {
	private long id;
	private String title;
	private String img;
	private String reviewCategory;
	private String reviewContent;

	public Review(long id, String title, String img, String reviewCategory, String reviewContent) {
		this.id = id;
		this.title = title;
		this.img = img;
		this.reviewCategory = reviewCategory;
		this.reviewContent = reviewContent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public void setReviewCategory(String reviewCategory) {
		this.reviewCategory = reviewCategory;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
}
