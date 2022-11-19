package com.company.raul.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "produtoWeb")
public class Produto {
    @Id
    private int codigoProd;
    @Column
    private String info;
    @Column
    private String marca;
    @Column
    private int preco;

    public int getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(int codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
