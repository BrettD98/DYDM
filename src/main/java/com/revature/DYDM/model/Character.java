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
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "character_id")
    private long characterId;


    private String name;
    private int coins;
    private int health;
    private int lvl;
    private PlayableCharacters pc;
    private Item rhEquipped;
    private Item lhEquipped;
    private Item armor;

    @ManyToMany
    @JoinTable(
            name = "character_item",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private List<Item> inventory;

    @ManyToMany
    @JoinTable(
            name = "character_party",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private List<Character> party;

}
