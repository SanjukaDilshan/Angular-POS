package lk.ijse.Services;

import lk.ijse.DTO.ItemDTO;
import lk.ijse.Models.Item;

import java.util.List;

public interface ItemService {

    List<ItemDTO> getAll();
    String saveItem(ItemDTO itemDTO);

    String updateItem(ItemDTO itemDTO);

    Item searchItem(Integer id);

    void deleteItem(Integer id);
}
