package co.za.altron.service;

import org.springframework.stereotype.Component;

import co.za.altron.entity.Item;

@Component
public interface ItemService {

	Item saveItem(Item item);
}
