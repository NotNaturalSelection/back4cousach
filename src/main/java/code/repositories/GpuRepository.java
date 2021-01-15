package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.entities.items.Gpu;

@Repository
public interface GpuRepository extends JpaRepository<Gpu, Integer> {}
