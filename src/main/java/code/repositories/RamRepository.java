package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.entities.items.Ram;
@Repository
public interface RamRepository extends JpaRepository<Ram, Integer> {}
