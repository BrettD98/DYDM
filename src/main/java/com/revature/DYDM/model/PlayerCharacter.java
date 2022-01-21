package com.revature.DYDM.model;

import com.revature.DYDM.util.PlayableCharacters;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class PlayerCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long characterId;
    private String name;

    private int coins = 20;
    private int health = 20;
    private int lvl = 1;
    private PlayableCharacters pc;
    @OneToOne
    private Weapon rhEquipped;
    @OneToOne
    private Weapon lhEquipped;
    @OneToOne
    private Armor armor;

    @ManyToMany
    @JoinTable(
            name = "character_weapon",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "weapon_id")
    )
    private List<Weapon> weapons;

    @ManyToMany
    @JoinTable(
            name = "character_armor",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "armor_id")
    )
    private List<Armor> armors;

    @ManyToMany
    private List<PlayerCharacter> inParty;
    @ManyToMany(mappedBy = "inParty")
    private List<PlayerCharacter> hasParty;


}
