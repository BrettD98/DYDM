package com.revature.DYDM.repository;

import com.revature.DYDM.model.Modifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModifierRepo extends JpaRepository<Modifier, Long> {
    public List<Modifier> findByPrice(int price);
}
