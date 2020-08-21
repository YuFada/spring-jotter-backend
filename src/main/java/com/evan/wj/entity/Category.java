package com.evan.wj.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * @author fada.yu
 * @date 2020/8/21 14:14
 * @Description：
 */

@Entity
@Table(name = "category")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
