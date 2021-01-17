package code.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import code.entities.items.Cpu;

@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {
    @Query("select c from Cpu c where c.tdp <=:tdp and c.part_number in :inStockPartNumbers")
    List<Cpu> whereTdpLessThanAndInStock(@Param("tdp") int tdp, @Param("inStockPartNumbers") List<Integer> partNumbers);
}
