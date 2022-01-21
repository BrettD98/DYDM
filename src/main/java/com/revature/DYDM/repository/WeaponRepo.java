package com.revature.DYDM.repository;

import com.revature.DYDM.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeaponRepo extends JpaRepository<Weapon, Long> {
    public List<Weapon> findByDamage(float damage);
    public List<Weapon> findByLvl(int lvl);
    public List<Weapon> findByPrice(int price);
    public List<Weapon> findByName(String name);
}
