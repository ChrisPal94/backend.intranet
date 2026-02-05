package com.ucsg.api.intranet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SCT_DIRECTORIO", schema = "CALLCENTER")
public class DirectorioPersona {
    @Id
    private Integer codSubunidad; // Usamos este como ID temporal
    private Integer codUnidad;
    private Integer codSubunidadPadre;
    private String subunidadPadre;
    private String subunidad;

    public DirectorioPersona() {}

    public Integer getCodSubunidad() {
        return codSubunidad;
    }

    public void setCodSubunidad(Integer codSubunidad) {
        this.codSubunidad = codSubunidad;
    }

    public Integer getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(Integer codUnidad) {
        this.codUnidad = codUnidad;
    }

    public Integer getCodSubunidadPadre() {
        return codSubunidadPadre;
    }

    public void setCodSubunidadPadre(Integer codSubunidadPadre) {
        this.codSubunidadPadre = codSubunidadPadre;
    }

    public String getSubunidadPadre() {
        return subunidadPadre;
    }

    public void setSubunidadPadre(String subunidadPadre) {
        this.subunidadPadre = subunidadPadre;
    }

    public String getSubunidad() {
        return subunidad;
    }

    public void setSubunidad(String subunidad) {
        this.subunidad = subunidad;
    }
}
