package com.revature.DYDM.repository;

import com.revature.DYDM.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnemyRepo extends JpaRepository<Enemy, Long> {
    public List<Enemy> findByLvl(int lvl);
    public List<Enemy> findByHealth(int health);
    public List<Enemy> findByBaseAttack(int baseAttack);
}
