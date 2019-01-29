package lk.ijse.Services.Impl;

import lk.ijse.DTO.ItemDTO;
import lk.ijse.Models.Item;
import lk.ijse.Repo.ItemRepo;
import lk.ijse.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Override
    public List<ItemDTO> getAll() {
        List<Item> allItems=itemRepo.findAll();
        ArrayList<ItemDTO> items=new ArrayList<>();
        for(Item item:allItems){
            items.add(new ItemDTO(item.getId(),item.getName(),item.getPrice(),item.getQty()));
        }
        return items;
    }

    @Override
    public String saveItem(ItemDTO itemDTO) {
        itemRepo.save(new Item(itemDTO.getId(),itemDTO.getName(),itemDTO.getPrice(),itemDTO.getQty()));
        return "Data Saved";
    }

    @Override
    public String updateItem(ItemDTO itemDTO) {
        String m=null;
        if(itemDTO.getId()!=null){
            itemRepo.save(new Item(itemDTO.getId(),itemDTO.getName(),itemDTO.getPrice(),itemDTO.getQty()));
            m="Update Complete";
        }else {
            m="Fail";
        }
        return m;
    }

    @Override
    public Item searchItem(Integer id) {
        Optional<Item> item=this.itemRepo.findById(id);
        if(item.isPresent()){
            return item.get();
        }else{
            return null;
        }
    }

    @Override
    public void deleteItem(Integer id) {
        itemRepo.deleteById(id);
    }
}
