package com.revature.DYDM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Attacks {
    @Id
    private long attackId;

    private String attackName;
    private String attackDesc;
}
