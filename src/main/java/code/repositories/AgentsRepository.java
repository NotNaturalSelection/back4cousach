package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.entities.Agent;

@Repository
public interface AgentsRepository extends JpaRepository<Agent, Integer> {
    Agent findById(int id);
}
