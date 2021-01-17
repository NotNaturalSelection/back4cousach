package code.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import code.entities.items.Display;

@Repository
public interface DisplayRepository extends JpaRepository<Display, Integer> {
    @Query("select c from Display c where c.sizemInches=:sizemInches and c.part_number in :inStockPartNumbers order by c.price")
    List<Display> findAllBySizeInchesInStock(
            @Param("sizemInches")
                    int sizemInches,
            @Param("inStockPartNumbers")
                    List<Integer> partNumbers
    );
}
