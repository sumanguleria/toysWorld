package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;

@Controller
public class ProductControl {

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	   public ModelAndView product() {
	      return new ModelAndView("product", "command", new Product());
	   }
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")Product product, 
	   ModelMap model) {
	      model.addAttribute("name", product.getItemName());
	      model.addAttribute("price", product.getPrice());
	      model.addAttribute("quti",product.getQty());
	      
	      return "result";
	   }

}
