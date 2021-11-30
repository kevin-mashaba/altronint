package co.za.altron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.za.altron.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
