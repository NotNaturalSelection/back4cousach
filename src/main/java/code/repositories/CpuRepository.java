package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.entities.items.Cpu;

@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {

}
