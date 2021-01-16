package code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import code.entities.Shipment;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
    @Procedure("s265482.parts_income")
    void confirmIncome(@Param("part_number") int part_number);
}
