package com.revature.DYDM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Enemy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long enemyId;

    private int coin;
    private int health;
    private int lvl;
    private int baseDef;
    private int baseAttack;

    @OneToOne
    private Weapon rhEquipped;
    @OneToOne
    private Weapon lhEquipped;
    @OneToOne
    private Armor armor;
}
