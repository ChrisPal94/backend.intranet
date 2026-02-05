package com.ucsg.api.intranet.model;

import java.util.ArrayList;
import java.util.List;

public class UnidadResponse {
    private Integer codUnidad;
    private List<SubunidadResponse> facultades;

    public UnidadResponse(Integer codUnidad) {
        this.codUnidad = codUnidad;
        this.facultades = new ArrayList<>();
    }

    public Integer getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(Integer codUnidad) {
        this.codUnidad = codUnidad;
    }

    public List<SubunidadResponse> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<SubunidadResponse> facultades) {
        this.facultades = facultades;
    }
    
}
