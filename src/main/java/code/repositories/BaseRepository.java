package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.entities.items.Base;

@Repository
public interface BaseRepository extends JpaRepository<Base, Integer> {
    Base  findById(int id);
}
