package co.za.altron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.za.altron.entity.Item;
import co.za.altron.service.ItemService;

@RestController
public class Question5 {

	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping(path = "/item", method = RequestMethod.POST,produces = "application/json")
	public void saveItem() {
		Item item = new Item();
	
				itemService.saveItem(item);		
			
		}
	
}
