package com.sicnu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Order {
    private int Id;
    private int GoodId;
    private int Mount;
    public Order(){

    }
    public Order(int good_id,int mount){
        this.GoodId=good_id;
        this.Mount=mount;
    }
}
