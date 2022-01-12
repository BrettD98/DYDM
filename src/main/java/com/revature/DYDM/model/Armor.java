package com.revature.DYDM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


//ex. ChainMail, Plate, Leather
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Armor implements Item{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "armor_id")
    private long armorId;

    private String name;
    private int price;
    private int defense;
    private int speedMod;
    private int lvl;
}
