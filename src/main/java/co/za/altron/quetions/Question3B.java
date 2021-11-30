package co.za.altron.quetions;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import co.za.altron.entity.Item;
import co.za.altron.service.ItemService;

public class Question3B {

	@Autowired
	private static ItemService itemService;

	public static void main(String[] dcdc) {

		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter value: ");
			
			int input = scanner.nextInt();
			
			if(input% 2==0) {
				
				System.out.println("Rolling back...");
				scanner.close();
			}
			else
			{
				saveJpa(input);
				scanner.close();
			}
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void saveJpa(int value) {
		Item item = new Item();
		item.setValue(value);
		itemService.saveItem(item);
	}
}
