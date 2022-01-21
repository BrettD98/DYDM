package com.revature.DYDM.repository;

import com.revature.DYDM.model.Armor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmorRepo extends JpaRepository<Armor, Long> {
    public List<Armor> findByPrice(int price);
    public List<Armor> findByDefense(int defense);
    public List<Armor> findBySpeedMod(int speedMod);
    public List<Armor> findByLvl(int lvl);
}
