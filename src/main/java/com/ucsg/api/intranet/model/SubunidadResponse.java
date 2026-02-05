package com.ucsg.api.intranet.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubunidadResponse {
    private Integer codSubunidadPadre;
    private String subunidadPadre;
    private List<HijaDTO> subunidadesHijas;

    // Constructor, Getters y Setters
    public SubunidadResponse(Integer codSubunidadPadre, String subunidadPadre) {
        this.codSubunidadPadre = codSubunidadPadre;
        this.subunidadPadre = subunidadPadre;
        this.subunidadesHijas = new ArrayList<>();
    }

    public static class HijaDTO {
        private Integer codSubunidad;
        private String subunidad;

        public HijaDTO(Integer codSubunidad, String subunidad) {
            this.codSubunidad = codSubunidad;
            this.subunidad = subunidad;
        }
        // Getters y Setters

        public Integer getCodSubunidad() {
            return codSubunidad;
        }

        public void setCodSubunidad(Integer codSubunidad) {
            this.codSubunidad = codSubunidad;
        }

        public String getSubunidad() {
            return subunidad;
        }

        public void setSubunidad(String subunidad) {
            this.subunidad = subunidad;
        }

        // ESTO ES CLAVE: Define que dos hijas son iguales si tienen el mismo código
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HijaDTO hijaDTO = (HijaDTO) o;
        return Objects.equals(codSubunidad, hijaDTO.codSubunidad);
    }

        @Override
        public int hashCode() {
            return Objects.hash(codSubunidad);
        }
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

    public List<HijaDTO> getSubunidadesHijas() {
        return subunidadesHijas;
    }

    public void setSubunidadesHijas(List<HijaDTO> subunidadesHijas) {
        this.subunidadesHijas = subunidadesHijas;
    }
}
