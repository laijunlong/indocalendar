package com.indocalendar.webapp.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Girl {
    @Id
    @GeneratedValue
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String cupSize;
    @Getter @Setter
    private Integer age;

}
