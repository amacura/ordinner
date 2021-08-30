package com.ordinner.backend.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "FoodStatus")
public class FoodStatus {
    @Id @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "time")
    private Date time;
    @Column(name = "modifier")
    private User modifier;

    public FoodStatus(Integer foodStatusId, String name, Date time, User modifier) {
        this.id = foodStatusId;
        this.name = name;
        this.time = time;
        this.modifier = modifier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getModifier() {
        return modifier;
    }

    public void setModifier(User modifier) {
        this.modifier = modifier;
    }
}
