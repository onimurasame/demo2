package com.example.demo.controller;

import java.util.ArrayList;

import com.example.demo.model.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/CategoryRestService")
@Api(value="Categorias", description="Servicio asociado a categorias")
public class CategoryRestService {
    @ApiOperation(value="FindAll",response = Iterable.class)
    @ApiResponses(value={
            @ApiResponse(code=200, message="Success"),
            @ApiResponse(code=401, message="Unauthorized xDD"),
            @ApiResponse(code=403, message="Forbidden xD"),
            @ApiResponse(code=404, message="Not Exists")
    })
    @RequestMapping(value = "/FindAll", method = RequestMethod.GET,produces = "application/json")
    public Iterable<Category> findAll() {
        ArrayList<Category> listaElementos= new ArrayList<>();
        listaElementos.add(new Category(Integer.valueOf(1),"Auto"));
        listaElementos.add(new Category(Integer.valueOf(2),"Moto"));
        listaElementos.add(new Category(Integer.valueOf(3),"Bote"));
        return listaElementos;
    }
}

