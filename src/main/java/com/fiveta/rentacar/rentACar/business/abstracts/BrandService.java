package com.fiveta.rentacar.rentACar.business.abstracts;

import com.fiveta.rentacar.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
