package com.fiveta.rentacar.rentACar.dataAccess.abstracts;

import com.fiveta.rentacar.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandDao extends JpaRepository <Brand,Integer>{  //hangi model, primary key'in değişken türü

}
