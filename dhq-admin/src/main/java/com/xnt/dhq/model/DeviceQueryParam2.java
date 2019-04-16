package com.xnt.dhq.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by afu on 2019-03-19.
 */
@Getter
@Setter
public class DeviceQueryParam2 {
    private Integer id;

    private String name;

    private Integer typeId;

    private Integer price;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date produceDate;

    private Integer useYear;

    private String describtion;

    private String firstCategory;

    private String secondCategory;

    private String thirdCategory;

    @Override
    public String toString() {
        return "DeviceQueryParam2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", produceDate=" + produceDate +
                ", useYear=" + useYear +
                ", describtion='" + describtion + '\'' +
                ", firstCategory='" + firstCategory + '\'' +
                ", secondCategory='" + secondCategory + '\'' +
                ", thirdCategory='" + thirdCategory + '\'' +
                '}';
    }
}





