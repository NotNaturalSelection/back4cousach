package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.entities.items.Drive;

@Repository
public interface DriveRepository extends JpaRepository<Drive, Integer> {}
