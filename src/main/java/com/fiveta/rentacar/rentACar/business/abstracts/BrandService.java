package com.fiveta.rentacar.rentACar.business.abstracts;

import com.fiveta.rentacar.rentACar.business.requests.CreateBrandRequest;
import com.fiveta.rentacar.rentACar.business.responses.GetAllBrandsResponse;
import com.fiveta.rentacar.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
