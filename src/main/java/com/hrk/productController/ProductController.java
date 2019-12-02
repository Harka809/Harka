package com.hrk.productController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hrk.dtoproject.DtoProject;
import com.hrk.productservice.ProductdService;

@Controller
public class ProductController {

	
	@RequestMapping (value ="form", method=RequestMethod.GET)
	public ModelAndView showdata() {
		ModelAndView mav = new ModelAndView("form");
		DtoProject dp = new DtoProject();
		mav.addObject("mv1", dp);
		return mav;
		
	}
	
	
	@RequestMapping (value ="confirm", method=RequestMethod.POST)
	public ModelAndView showConfirm(DtoProject dp) {
		ModelAndView mav = new ModelAndView("confirm");
		mav.addObject("mv2", dp);
		return mav;
		
	}
	

}
