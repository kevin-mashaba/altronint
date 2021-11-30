package co.za.altron;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.za.altron.entity.Item;
import co.za.altron.service.ItemService;

@SpringBootTest
class ApplicationTests {

	
	@Autowired
	private static ItemService itemService;
	@Test
	void contextLoads() {
	}

	@Test
	void testSave() {
		
Item item = new Item();
		
		item.setValue(2);
		
		System.out.println("saving ");
		itemService.saveItem(item);
		
		System.out.println("saved! ");
	}
}
