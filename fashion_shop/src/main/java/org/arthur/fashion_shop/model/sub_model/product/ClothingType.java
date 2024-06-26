package org.arthur.fashion_shop.model.sub_model.product;

import jakarta.persistence.*;
import org.arthur.fashion_shop.model.main_model.Product;

@Entity
public class ClothingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    public ClothingType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
