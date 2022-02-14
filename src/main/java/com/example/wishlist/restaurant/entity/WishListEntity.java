package com.example.wishlist.restaurant.entity;

import com.example.wishlist.db.MemoryDbEntity;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class WishListEntity extends MemoryDbEntity {

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
