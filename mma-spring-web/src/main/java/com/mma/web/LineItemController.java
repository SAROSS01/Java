package com.mma.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mma.business.JsonResponse;
import com.mma.business.LineItem;

import com.mma.db.LineItemRepository;



@RestController
@RequestMapping("/lineitem")
public class LineItemController {
	
	@Autowired
	private LineItemRepository lineItemRepo;
	
	// http://localhost:8080/products/
	@GetMapping("/")
	public @ResponseBody JsonResponse getAll() {
		JsonResponse jr = null;
		try {
		 jr = JsonResponse.getInstance(lineItemRepo.findAll());
		}
		catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	// http://localhost:8080/products/
		@GetMapping("/{id}")
		public @ResponseBody JsonResponse get(@PathVariable int id) {
			JsonResponse jr = null;
			try {
				Optional<LineItem> l = lineItemRepo.findById(id);
				if(l.isPresent()) {
					jr = JsonResponse.getInstance(l);
				} else {
					jr = JsonResponse.getInstance("No lineitem found for id: "+ id);
				}
			}
			catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
		@PostMapping("/")
		public JsonResponse add(@RequestBody LineItem l) {
			JsonResponse jr = null;
			// NOTE: May need to enhance exception handling if more than
			// one exception type needs to be caught 
			try {
			 jr = JsonResponse.getInstance(lineItemRepo.save(l));
			}
			catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
		
		@PutMapping("/")
		public JsonResponse update(@RequestBody LineItem l) {
			JsonResponse jr = null;
			// NOTE: May need to enhance exception handling if more than
			// one exception type needs to be caught 
			try {
				if(lineItemRepo.existsById(l.getId())) {
					jr = JsonResponse.getInstance(lineItemRepo.save(l));	
				}
				else {
					jr= JsonResponse.getInstance("Lineitem id: " +l.getId()+" does not exist and you are"
													+ "attempting to save");
				}
			}
			catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
		
		@DeleteMapping("/")
		public JsonResponse delete(@RequestBody LineItem l) {
			JsonResponse jr = null;
			try {
				if(lineItemRepo.existsById(l.getId())) {
					lineItemRepo.delete(l);
					jr = JsonResponse.getInstance("Lineitem deleted.");	
				}
				else {
					jr= JsonResponse.getInstance("Lineitem id: " +l.getId()+" does not exist and you are"
													+ "attempting to delete it");
				}
			}
			catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
		
		
		
		
		
	
	

}
