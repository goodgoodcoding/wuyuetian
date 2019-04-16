package com.xnt.dhq.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseQueryParam {
    private Integer id;

    private String name;

    private String description;

    private String picture;

    private Integer timesOfClass;

    private Integer price;

    private String courseContent;

    private Boolean online;

    private Boolean status;

    private CourseType courseType;
}
