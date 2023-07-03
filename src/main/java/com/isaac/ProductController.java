package com.isaac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class ProductController {
	
	  @Autowired ProductService productservice;
	  
	  @RequestMapping(value = "/test", method = RequestMethod.GET)
	  
	  @ResponseBody 
	  public String test() { 
		  return "test";
	  
	  }
	  
	  @RequestMapping(value = "/products", method = RequestMethod.GET)
	 
	  @ResponseBody public List<Product> getallproducts(){
		  List<Product> products = productservice.allProducts();
	  
	  return products;
	  }
	 
	  @RequestMapping( value ="/total-price" ,method=RequestMethod.GET)
	  @ResponseBody
	    public int CalctotalPrice() {
	    	int totalPrice =productservice.calculateTotalPrice();
			return totalPrice;
	    }

}
