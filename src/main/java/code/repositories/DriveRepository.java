package code.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import code.entities.items.Display;
import code.entities.items.Drive;

@Repository
public interface DriveRepository extends JpaRepository<Drive, Integer> {
    @Query("select c from Drive c where c.part_number in :inStockPartNumbers")
    List<Drive> findInStock(
            @Param("inStockPartNumbers")
                    List<Integer> partNumbers
    );
}
