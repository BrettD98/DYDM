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
public class Modifier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "modifier_id")
    private long modifierId;
    private int price;

    private String modifierName;
    private String modifierDesc;
}
