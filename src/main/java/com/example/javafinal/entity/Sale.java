package com.example.javafinal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Sale {
    @Id
    private int Id;
    private int SalesmanID;

    @Column(insertable = false, updatable = false)
    private int ProdID;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "ProdID", nullable = false, referencedColumnName = "id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Product product;

    private String SalesmanName;
    private String DOS;

    public Sale(int salesmanID, int prodID, String salesmanName, String DOS) {
        SalesmanID = salesmanID;
        ProdID = prodID;
        SalesmanName = salesmanName;
        this.DOS = DOS;
    }
}
