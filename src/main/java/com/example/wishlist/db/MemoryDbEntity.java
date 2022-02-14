package com.example.wishlist.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public class MemoryDbEntity {
    @Id
    @GeneratedValue
    private Long id;
}
