package com.ucsg.api.intranet.repository;
import com.ucsg.api.intranet.model.CumpleanioMes;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CumpleanioMesRepository extends JpaRepository<CumpleanioMes, String> {
    
    @SuppressWarnings("null")
    @Cacheable("cumpleanioMes")
    List<CumpleanioMes> findAll();
}
