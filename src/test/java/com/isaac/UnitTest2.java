package com.isaac;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class UnitTest2 {
	 @Test
	  public void testCalculateTotalPrice_EmptyList() {
	    // Arrange
	    List<Product> productList = new ArrayList<>(); // Empty list
	    
	    // Act
	    int totalPrice = Product.calculateTotalPrice(productList);
	    
	    // Assert
	    Assert.assertEquals(0, totalPrice, 0.01); // Adjust the delta value based on your price comparison tolerance
	  }
	  
	  @Test
	  public void testCalculateTotalPrice_SingleProduct() {
	    // Arrange
	    List<Product> productList = new ArrayList<>();
	    Product product = new Product();
	    product.setName("Product 1");
	    product.setPrice(10);
	    productList.add(product); // Single product
	    
	    // Act
	    int totalPrice = Product.calculateTotalPrice(productList);
	    
	    // Assert
	    Assert.assertEquals(0.01, totalPrice, 10); // Adjust the delta value based on your price comparison tolerance
	  }
	  
	  @Test
	  public void testCalculateTotalPrice_MultipleProducts() {
	    // Arrange
	    List<Product> productList = new ArrayList<>();
	    Product product1 = new Product();
	    product1.setName("Product 1");
	    product1.setPrice(10);
	    productList.add(product1);
	    
	    Product product2 = new Product();
	    product2.setName("Product 2");
	    product2.setPrice(5);
	    productList.add(product2);
	    
	    // Act
	    int totalPrice = Product.calculateTotalPrice(productList);
	    
	    // Assert
	    Assert.assertEquals(0.01, totalPrice, 15); // Adjust the delta value based on your price comparison tolerance
	  }

}
