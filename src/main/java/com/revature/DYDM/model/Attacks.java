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
public class Attacks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "attack_id")
    private long attackId;

    private int price;
    private String attackName;
    private String attackDesc;
}
