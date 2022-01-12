package com.revature.DYDM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
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
    @Column(name = "weapon_id")
    private long weaponId;

    private String name;
    private float damage;
    private int lvl;
    private int price;

    @ManyToMany
    @JoinTable(
            name = "weapon_attacks",
            joinColumns = @JoinColumn(name = "weapon_id"),
            inverseJoinColumns = @JoinColumn(name = "attack_id")
    )
    private List<Attacks> attackTypes;

    @ManyToMany
    @JoinTable(
            name = "weapon_modifier",
            joinColumns = @JoinColumn(name = "weapon_id"),
            inverseJoinColumns = @JoinColumn(name = "modifier_id")
    )
    private List<Modifier> modifiers;
}
