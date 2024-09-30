package readJsonData;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductDriverApp {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
//		Single Product Read
//		ObjectMapper objectMapper = new ObjectMapper();                // ObjectMapper is convert java objects to json_data
//		File file = new File("G:\\json_data/product.json");            // json_data location
//		Product product = objectMapper.readValue(file, Product.class); // Read data from File object (file) from Product Class.
//		System.out.println(product);
		
//      Multiple Product Read		
		ObjectMapper objectMapper1 = new ObjectMapper();                // ObjectMapper is convert java objects to json_data
		File file1 = new File("G://json_data/allproducts.json");        // json_data location
		List<Product> products = Arrays.asList(objectMapper1.readValue(file1, Product[].class)); // Read data from File object (file) from Product Class.
		System.out.println(products + "\n");
		
		
		System.out.println("\nTitle of Products:\n");     
		for(int i=0; i<products.size(); i++)                             // Using for loop
		{
			System.out.println(products.get(i).getTitle());              // In all Products find Title of each Product
		}
		
		System.out.println("\nCount of Products:\n");
		int totalRating = 0;
		for(Product p : products)                                        // Using For each loop
		{
			System.out.println(p.getRating().getCount());                // In all Products find Count of each Product
			totalRating+=p.getRating().getCount();                       // Total Count of Rating
		}
		System.out.println("Total Count of Rating is: " + totalRating);
		System.out.println("Average Count of Rate is: " + totalRating/products.size()); // Average Count Rate of 1 Product
		
		
		System.out.println("\nCategory of Products:\n");
		for(int i=0; i<products.size();i++)
		{
			System.out.println(products.get(i).getCategory());           // Display Each Product of Category
		}

	}

}
