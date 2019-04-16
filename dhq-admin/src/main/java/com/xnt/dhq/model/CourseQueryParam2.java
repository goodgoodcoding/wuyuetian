package com.xnt.dhq.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseQueryParam2 {
    private Integer id;

    private String name;

    private Integer typeId;

    private String description;

    private String picture;

    private Integer timesOfClass;

    private Integer price;

    private String courseContent;

    private Boolean online;

    private Boolean status;

    private String firstType;

    private String secondType;

    private String thirdType;
}
