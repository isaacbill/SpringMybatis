package com.isaac;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ProductServiceTest {
	@Test
	 public void testGetAllProducts() {
      // Create a ProductService instance
      ProductService productService = Mockito.mock(ProductService.class);

      // Create a list of sample products
      List<Product> expectedProducts = Arrays.asList(
      		//new Product(1, "unga","maize" ,230,"5"),
          // new Product(2, "rice","pishori" ,500,"3")
      );

   
      // Mock the behavior of the getAllProducts method
      Mockito.when(productService.allProducts()).thenReturn(expectedProducts);

      // Call the getAllProducts method
      List<Product> actualProducts = productService.allProducts();


      // Verify the results
      assertNotNull(actualProducts);  // Verify that the returned list is not null
      assertEquals(expectedProducts.size(), actualProducts.size());  // Verify the expected size of the list

      // Verify that the returned list contains the correct product details
      for (int i = 0; i < expectedProducts.size(); i++) {
          Product expectedProduct = expectedProducts.get(i);
          Product actualProduct = actualProducts.get(i);

          assertEquals(expectedProduct.getId(), actualProduct.getId());
          assertEquals(expectedProduct.getName(), actualProduct.getName());
          assertEquals(expectedProduct.getShort_description(), actualProduct.getShort_description());
          assertEquals(expectedProduct.getPrice(), actualProduct.getPrice());
          assertEquals(expectedProduct.getQuantity(), actualProduct.getQuantity());
      }
      }
}
