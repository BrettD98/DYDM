package com.revature.DYDM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//ex. ChainMail, Plate, Leather
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Armor implements Item{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long armorId;

    private String name;
    private int defense;
    private int speedMod;
    private int lvl;
}
