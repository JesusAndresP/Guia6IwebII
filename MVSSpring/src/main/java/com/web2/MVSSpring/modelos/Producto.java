
package com.web2.MVSSpring.modelos;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String prodNombre;
    private String prodDesc;
    private String prodImagen;
    private Double prodPrecio;
    
    public Producto(){
        
    }
    
    public Producto(Long id, String prodNombre, String prodDesc, String prodImagen, Double prodPrecio){
        this.id = id;
        this.prodNombre = prodNombre;
        this.prodDesc = prodDesc;
        this.prodImagen = prodImagen;
        this.prodPrecio = prodPrecio;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the prodNombre
     */
    public String getProdNombre() {
        return prodNombre;
    }

    /**
     * @param prodNombre the prodNombre to set
     */
    public void setProdNombre(String prodNombre) {
        this.prodNombre = prodNombre;
    }

    /**
     * @return the prodDesc
     */
    public String getProdDesc() {
        return prodDesc;
    }

    /**
     * @param prodDesc the prodDesc to set
     */
    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    /**
     * @return the prodImagen
     */
    public String getProdImagen() {
        return prodImagen;
    }

    /**
     * @param prodImagen the prodImagen to set
     */
    public void setProdImagen(String prodImagen) {
        this.prodImagen = prodImagen;
    }

    /**
     * @return the prodPrecio
     */
    public Double getProdPrecio() {
        return prodPrecio;
    }

    /**
     * @param prodPrecio the prodPrecio to set
     */
    public void setProdPrecio(Double prodPrecio) {
        this.prodPrecio = prodPrecio;
    }
    

    
    
}
