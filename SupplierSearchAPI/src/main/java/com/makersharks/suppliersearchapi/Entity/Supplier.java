package com.makersharks.suppliersearchapi.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;

    private String website;

    private String location;

    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;

    @ElementCollection(targetClass = ManufacturingProcess.class)
    @CollectionTable(name = "supplier_manufacturing_processes")
    @Enumerated(EnumType.STRING)
    private Set<ManufacturingProcess> manufacturingProcesses;


}
