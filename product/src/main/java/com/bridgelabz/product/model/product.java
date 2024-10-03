package com.bridgelabz.product.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prod")
public class product
{
    @Id
    @GeneratedValue
    private int prodId;

    @Column(name = "prodname")
    private String prodNme;

    @Column(name = "prodprice")
    private float prodPrice;

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdNme() {
        return prodNme;
    }

    public void setProdNme(String prodNme) {
        this.prodNme = prodNme;
    }

    public float getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(float prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "product{" +
                "prodId=" + prodId +
                ", prodNme='" + prodNme + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }
}
