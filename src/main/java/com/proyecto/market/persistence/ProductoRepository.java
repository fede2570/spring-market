package com.proyecto.market.persistence;

import com.proyecto.market.persistence.crud.ProductoCrudRepository;
import com.proyecto.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/*
* Clase que interactua directamente con la base de datos
* @Repository: anotación para interactuar con la base de datos
* @Componente: componente spring
*/
@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;  //Interface

    //Recuperar productos de la base de datos
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }

    public Optional<List<Producto>> getProductosEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }

}
