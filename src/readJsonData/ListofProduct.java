package readJsonData;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListofProduct {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		// Count of in Category How many products
		ObjectMapper objectMapper = new ObjectMapper();                // ObjectMapper is convert java objects to json_data
		File file = new File("G:\\json_data/allproducts.json");        // json_data location
		List<Product> products = Arrays.asList(objectMapper.readValue(file, Product[].class));
		System.out.println(products);
		
		HashMap<String,Integer> categories = new HashMap<String,Integer>();
		for(int i=0 ; i<products.size(); i++)
		{
			String key = (products.get(i).getCategory());
			if(categories.containsKey(key))
			{
				categories.put(key, categories.get(key)+1);
			}
			else {
				categories.put(key, 1);
			}
		}
		System.out.println(categories);
		
	}

}
