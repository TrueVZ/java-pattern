package ru.mirea.task14.controllers;


import org.springframework.web.bind.annotation.*;
import ru.mirea.task14.models.Item;

import java.util.ArrayList;

@RestController
public class ItemController {
    ArrayList<Item> items = new ArrayList<>();
    @PostMapping("/items/create")
    public String createItem(@RequestBody Item item){
        items.add(item);
        item.setId(items.size());
        return items.toString();
    }

    @GetMapping("/items")
    public String allItems(){
        return items.toString();
    }

    @DeleteMapping("/items/{item_id}")
    public String deleteItem(@PathVariable("item_id") int item_id){
        items.removeIf(o -> o.getId() == item_id);
        return items.toString();
    }
}
