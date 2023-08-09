package com.fiveta.rentacar.rentACar.dataAccess.concretes;

import com.fiveta.rentacar.rentACar.dataAccess.abstracts.BrandDao;
import com.fiveta.rentacar.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository  //bu sınıf dataAccess nesnesi
public class InMemoryBrandDao implements BrandDao {
    List<Brand> brands;

    public InMemoryBrandDao() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Audi"));
        brands.add(new Brand(4,"Fiat"));
        brands.add(new Brand(5,"Renault"));


    }


    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
