package com.revature.DYDM.repository;

import com.revature.DYDM.model.Attacks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttacksRepo extends JpaRepository<Attacks,Long> {
    public List<Attacks> findByPrice(int price);
}
