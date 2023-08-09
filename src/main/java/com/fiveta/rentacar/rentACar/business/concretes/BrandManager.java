package com.fiveta.rentacar.rentACar.business.concretes;

import com.fiveta.rentacar.rentACar.business.abstracts.BrandService;
import com.fiveta.rentacar.rentACar.business.requests.CreateBrandRequest;
import com.fiveta.rentacar.rentACar.business.responses.GetAllBrandsResponse;
import com.fiveta.rentacar.rentACar.dataAccess.abstracts.BrandDao;
import com.fiveta.rentacar.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BrandManager implements BrandService {
    private BrandDao brandDao;
    @Autowired
    public BrandManager(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        //iş kuralları buraya yazılır
        //kullanıcıya istemediğimiz verileri döndürmemek için böyle yapılır
        List<Brand> brands =brandDao.findAll();
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand: brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponse.add(responseItem);

        }


        return brandsResponse; //findAll jpadan geliyor
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandDao.save(brand);
    }
}
