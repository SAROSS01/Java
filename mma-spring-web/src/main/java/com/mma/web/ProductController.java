package com.mma.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mma.business.JsonResponse;
import com.mma.business.Product;
import com.mma.db.ProductRepository;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	// http://localhost:8080/products/
	@GetMapping("/")
	public @ResponseBody JsonResponse getAll() {
		JsonResponse jr = null;
		try {
		 jr = JsonResponse.getInstance(productRepo.findAll());
		}
		catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	// http://localhost:8080/products?code
		@GetMapping("")
		public JsonResponse getByCode(@RequestParam String code) {
			JsonResponse jr = null;
			try {
				Optional<Product> p = productRepo.findByCode(code);
				if(p.isPresent()) {
					jr = JsonResponse.getInstance(p);
				} else {
					jr = JsonResponse.getInstance("No product found for code: "+ code);
				}
			}
			catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
		@PostMapping("/")
		public JsonResponse add(@RequestBody Product p) {
			JsonResponse jr = null;
			// NOTE: May need to enhance exception handling if more than
			// one exception type needs to be caught 
			try {
			 jr = JsonResponse.getInstance(productRepo.save(p));
			}
			catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
		
		@PutMapping("/")
		public JsonResponse update(@RequestBody Product p) {
			JsonResponse jr = null;
			// NOTE: May need to enhance exception handling if more than
			// one exception type needs to be caught 
			try {
				if(productRepo.existsById(p.getId())) {
					jr = JsonResponse.getInstance(productRepo.save(p));	
				}
				else {
					jr= JsonResponse.getInstance("Product id: " +p.getId()+" does not exist and you are"
													+ "attempting to save");
				}
			}
			catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
		
		@DeleteMapping("/")
		public JsonResponse delete(@RequestBody Product p) {
			JsonResponse jr = null;
			try {
				if(productRepo.existsById(p.getId())) {
					productRepo.delete(p);
					jr = JsonResponse.getInstance("Product deleted.");	
				}
				else {
					jr= JsonResponse.getInstance("Product id: " +p.getId()+" does not exist and you are"
													+ "attempting to delete it");
				}
			}
			catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
		
		
		
		
		
	
	

}
