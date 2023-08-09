package com.fiveta.rentacar.rentACar.webApi.controllers;

import com.fiveta.rentacar.rentACar.business.abstracts.BrandService;
import com.fiveta.rentacar.rentACar.business.requests.CreateBrandRequest;
import com.fiveta.rentacar.rentACar.business.responses.GetAllBrandsResponse;
import com.fiveta.rentacar.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired //uygulamayı tara brandservice interfaceini implements edeni bul newle
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){ //veriyi bodyden alacağını yazdık requestbody ile
        this.brandService.add(createBrandRequest);
    }


}
