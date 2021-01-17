package code.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import code.entities.items.Ram;

@Repository
public interface RamRepository extends JpaRepository<Ram, Integer> {
    @Query("select c from Ram c where c.form=:form and c.part_number in :inStockPartNumbers order by c.price")
    List<Ram> findAllByFormInStock(
            @Param("form")
                    String form,
            @Param("inStockPartNumbers")
                    List<Integer> partNumbers
    );
}
