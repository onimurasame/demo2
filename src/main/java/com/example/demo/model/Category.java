package com.example.demo.model;


import io.swagger.annotations.ApiModelProperty;

public class Category {

    @ApiModelProperty(notes = "Id de cada categoria")
    private Integer id;
    @ApiModelProperty(notes = "Nombre de cada categoria")
    private String categoria;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Category(Integer id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }
}
