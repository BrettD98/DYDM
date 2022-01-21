package com.revature.DYDM.repository;

import com.revature.DYDM.model.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerCharacterRepo extends JpaRepository<PlayerCharacter, Long> {
    public List<PlayerCharacter> findByName(String name);
}
