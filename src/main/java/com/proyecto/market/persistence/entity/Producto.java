package com.proyecto.market.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productos") //Nombre de la tabla
public class Producto {

    @Id                                                 //Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Generacion automatica de clave
    @Column(name = "id_producto")   //Incluir anotación si nombre de atributo es diferente a columna
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "precio_stock")
    private Integer precioStock;

    private Boolean estado;

    @ManyToOne      //Muchos a uno
    //Anotacion para que no se borre ni inserte una nueva categoria
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)     //Relacion id_categoria
    private Categoria categoria;

}
