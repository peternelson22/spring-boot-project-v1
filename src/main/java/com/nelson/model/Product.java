package com.nelson.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "producttypeid", insertable = false, updatable = false)
    private ProductType productType;
    private Long producttypeid;

    private String productNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;

    private String description;

    @ManyToOne
    @JoinColumn(name = "productmakeid", updatable = false, insertable = false)
    private ProductMake productMake;
    private Long productmakeid;

    private String productPower;
    private String productDurability;

    @ManyToOne
    @JoinColumn(name = "productstatusid", updatable = false, insertable = false)
    private ProductStatus productStatus;
    private Long productstatusid;

    private String netWeight;

    @ManyToOne
    @JoinColumn(name = "employeeid", updatable = false, insertable = false)
    private Employee inCharge;
    private Long employeeid;

    @ManyToOne
    @JoinColumn(name = "productmodelid", updatable = false, insertable = false)
    private ProductModel productModel;
    private Long productmodelid;

    @ManyToOne
    @JoinColumn(name = "locationid", updatable = false, insertable = false)
    private Location currentLocation;
    private Long locationid;

    private String remarks;
}
