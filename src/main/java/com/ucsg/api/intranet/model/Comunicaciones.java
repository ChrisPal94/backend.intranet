package com.ucsg.api.intranet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "CCE_VW_COMUNICACIONES")
public class Comunicaciones {

    @Id
    @Column(name = "CODIGO")
    private Integer codigo;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "FEC_INICIO")
    private Date fecInicio;

    @Column(name = "DIR_IMAGEN")
    private String dirImagen;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "CATEGORIA")
    private String categoria;

    @Column(name = "HIGHLIGHT")
    private String highlight;

    @Column(name = "DETALLE_DESC")
    private String detalleDesc;

    @Column(name = "TIPO_EVENTO")
    private Integer tipoEvento;

    @Column(name = "SECCION")
    private Integer seccion;

    @Column(name = "INDICE")
    private Integer indice;

    @Column(name = "TIP_SITIO")
    private Integer tipSitio;

    @Column(name = "DESTACADO")
    private String destacado;

    @Column(name = "SUBSECCION")
    private String subseccion;

    @Column(name = "UBICACION")
    private String ubicacion;

    @Column(name = "DESC_ORGANIZA")
    private String descOrganiza;

    public Comunicaciones() {                                                    
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public String getDirImagen() {
        return dirImagen;
    }

    public void setDirImagen(String dirImagen) {
        this.dirImagen = dirImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getDetalleDesc() {
        return detalleDesc;
    }

    public void setDetalleDesc(String detalleDesc) {
        this.detalleDesc = detalleDesc;
    }

    public Integer getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(Integer tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getTipSitio() {
        return tipSitio;
    }

    public void setTipSitio(Integer tipSitio) {
        this.tipSitio = tipSitio;
    }

    public String getDestacado() {
        return destacado;
    }

    public void setDestacado(String destacado) {
        this.destacado = destacado;
    }

    public String getSubseccion() {
        return subseccion;
    }

    public void setSubseccion(String subseccion) {
        this.subseccion = subseccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescOrganiza() {
        return descOrganiza;
    }

    public void setDescOrganiza(String descOrganiza) {
        this.descOrganiza = descOrganiza;
    }
}
