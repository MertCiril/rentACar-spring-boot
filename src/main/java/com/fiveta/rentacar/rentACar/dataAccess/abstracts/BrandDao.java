package com.fiveta.rentacar.rentACar.dataAccess.abstracts;

import com.fiveta.rentacar.rentACar.entities.concretes.Brand;

import java.util.List;


public interface BrandDao {
    List<Brand> getAll();
}
