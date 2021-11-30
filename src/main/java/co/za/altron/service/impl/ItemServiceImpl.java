package co.za.altron.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.za.altron.entity.Item;
import co.za.altron.repository.ItemRepository;
import co.za.altron.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Item saveItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

}
