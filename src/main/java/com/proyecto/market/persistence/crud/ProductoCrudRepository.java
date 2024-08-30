package com.proyecto.market.persistence.crud;

import com.proyecto.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/*
* https://docs.spring.io/spring-data/jpa/reference/repositories/query-by-example.html
* <Producto,Integer> Clase y tipo de clave primaria
*/

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    /*
    * Recuperar lista de productos que pertenecen a una categoria especifica
    * @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    * Query method
    */
    List<Producto> findByIdCategoria(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
