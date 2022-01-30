package com.example.wishlist.restaurant.repository;

import com.example.wishlist.db.MemoryDbRepositoryAbstract;
import com.example.wishlist.restaurant.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
