package com.ucsg.api.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ucsg.api.intranet.model.Comunicaciones;

import java.util.List;

@Repository
public interface ComunicacionesRepository extends JpaRepository<Comunicaciones, Integer> {

    @Query(value = "SELECT CODIGO, DESCRIPCION, FEC_INICIO, DIR_IMAGEN, TITULO, CATEGORIA, HIGHLIGHT, DETALLE_DESC, TIPO_EVENTO, SECCION, INDICE, TIP_SITIO, DESTACADO, SUBSECCION, UBICACION, DESC_ORGANIZA " +
                   "FROM CCE_VW_COMUNICACIONES " +
                   "WHERE TIPO_EVENTO = ?1 AND SECCION = ?2 AND TIP_SITIO = ?3 ORDER BY INDICE", nativeQuery = true)
    List<Comunicaciones> findComunicacionesEspecificas(Integer tipoEvento, Integer seccion, Integer tipSitio);
}
