package com.example.wishlist.restaurant.dto;

import com.example.wishlist.db.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListDto extends MemoryDbEntity {
    private int index;
    private String title;                   //음식명
    private String category;                //카테고리
    private String address;                 //주소
    private String roadAddress;             //도로명
    private String homePageLink;            //홈페이지 주소
    private String imageLink;               //음식, 가게 이미지 주소
    private boolean isVisit;                //방문여부
    private int visitCount;                 //방문 카운트
    private LocalDate lastVisitDate;        //마지막 방문일지
}
