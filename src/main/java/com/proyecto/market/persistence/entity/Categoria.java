package com.proyecto.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private String estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

}
