package com.reviews.Reviews;


	import javax.annotation.Resource;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class ReviewsController {

		@Resource
		ReviewRepository repository = new ReviewRepository();
		
		@RequestMapping("/reviews")
		public String getReviews(Model model) {
			model.addAttribute("reviews",repository.findAll());
			return "reviews";
		}
		@RequestMapping("/review")
		public String getOneReview(@RequestParam(value="id")long id, Model model) {
			model.addAttribute("review",repository.findOne(id));
			return "review";
		}
	}


