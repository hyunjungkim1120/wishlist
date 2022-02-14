package com.example.wishlist.controller;

import com.example.wishlist.restaurant.dto.WishListDto;
import com.example.wishlist.restaurant.repository.WishListRepository;
import com.example.wishlist.restaurant.service.WishListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/food")
@RequiredArgsConstructor
public class ApiController {

    private final WishListService wishListService;

    @GetMapping("/search")
    public WishListDto search(@RequestParam String query) {
        return wishListService.search(query);
    }

    @PostMapping("")
    public WishListDto add(@RequestBody WishListDto wishListDto) {
        log.info("{}", wishListDto);

        return wishListService.add(wishListDto);
    }

    @GetMapping("/wish-list")
    public List<WishListDto> findAll() {
        return wishListService.findAll();
    }

    @DeleteMapping("/{index}")
    public void delete(@PathVariable long index) {
        wishListService.delete(index);
    }

    @PostMapping("/{index}")
    public void addVisit(@PathVariable long index) {
        wishListService.addVisit(index);
    }
}
