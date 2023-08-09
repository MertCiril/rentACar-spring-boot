package com.fiveta.rentacar.rentACar.entities.concretes;


import jakarta.persistence.*;
import lombok.*;

@Table(name="brands") //veri tabanındaki brands tablosuna karşılık geliyor

//-----------------------LOMBOK BAŞLANGIÇ-----------------------
//@Data //lomboktan geliyor get set oluşturur ve parametresiz constructor oluşturur
@Getter //sadece getleri oluşturur
@Setter //sadece setleri oluşturur
@AllArgsConstructor //bunu yazınca data dan gelen boş constructor gidiyor onun yerine bütün verileri isteyen const. oluşuyor
@NoArgsConstructor //bunu yazınca boş constructor da oluşturur
//lombok sayesinde get set constructor oluşturup yer doldurmadık
//-----------------------LOMBOK BİTİŞ-----------------------

@Entity //veri tabanı varlığı olduğunu belirttik
public class Brand {
    @Id //veri tabanında primary key olduğunu belirttik
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id nin otomatik olarak bir bir artmasını sağlıyor
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


}
