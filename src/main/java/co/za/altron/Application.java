package co.za.altron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.za.altron.entity.Item;
import co.za.altron.service.ItemService;

@SpringBootApplication
public class Application {
	
	@Autowired
	private static ItemService itemService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
