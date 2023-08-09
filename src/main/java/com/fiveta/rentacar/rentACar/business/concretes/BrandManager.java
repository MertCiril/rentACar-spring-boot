package com.fiveta.rentacar.rentACar.business.concretes;

import com.fiveta.rentacar.rentACar.business.abstracts.BrandService;
import com.fiveta.rentacar.rentACar.dataAccess.abstracts.BrandDao;
import com.fiveta.rentacar.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandService {
    private BrandDao brandDao;
    @Autowired
    public BrandManager(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public List<Brand> getAll() {
        //iş kuralları buraya yazılır


        return brandDao.getAll();
    }
}
