/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web2.MVSSpring.repositorio;

import com.web2.MVSSpring.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jeanp
 */
public interface RepositorioProducto extends JpaRepository<Producto, Long> {
    Producto findByProdNombre(final String prodNombre);
    
}
