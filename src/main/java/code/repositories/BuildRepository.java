package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.entities.Build;

@Repository
public interface BuildRepository extends JpaRepository<Build, Integer> {}
