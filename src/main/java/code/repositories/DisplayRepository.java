package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.entities.items.Display;

@Repository
public interface DisplayRepository extends JpaRepository<Display, Integer> {}
