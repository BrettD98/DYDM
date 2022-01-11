package com.revature.DYDM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

//ex. Sword, Shield, Dagger
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Weapon implements Item{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long weaponId;

    private String name;
    private float damage;
    private int lvl;

    private List<String> attackTypes;
    private List<String> modifiers;
}
