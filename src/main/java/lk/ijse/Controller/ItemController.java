package lk.ijse.Controller;

import lk.ijse.DTO.ItemDTO;
import lk.ijse.Models.Item;
import lk.ijse.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public String addItem(@RequestBody ItemDTO itemDTO){
        return itemService.saveItem(itemDTO);
    }

    @GetMapping("/all")
    public List<ItemDTO> getAll(){
        return itemService.getAll();
    }

    @PutMapping("/update")
    public String updateItem(@RequestBody ItemDTO itemDTO){
        return itemService.updateItem(itemDTO);
    }

    @GetMapping("/search/{id}")
    public Item searchItem(@PathVariable Integer id){
        return itemService.searchItem(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable Integer id){
        itemService.deleteItem(id);
    }
}
