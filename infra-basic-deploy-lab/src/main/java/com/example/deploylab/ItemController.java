// src/main/java/com/example/deploylab/controller/ItemController.java

package com.example.deploylab;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    // 전체 조회
    @GetMapping
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    // 등록
    @PostMapping
    public Item save(@RequestParam String name) {
        return itemRepository.save(new Item(name));
    }
}