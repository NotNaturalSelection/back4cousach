package code.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import code.entities.items.Gpu;

@Repository
public interface GpuRepository extends JpaRepository<Gpu, Integer> {
    @Query("select c from Gpu c where c.power <=:power and c.part_number  in :inStockPartNumbers order by c.price")
    List<Gpu> wherePowerLessThanAndInStock(
            @Param("power")
                    int power,
            @Param("inStockPartNumbers") List<Integer> partNumbers
    );
}
