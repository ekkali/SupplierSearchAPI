package com.makersharks.suppliersearchapi.Controller;

import com.makersharks.suppliersearchapi.Entity.ManufacturingProcess;
import com.makersharks.suppliersearchapi.Entity.NatureOfBusiness;
import com.makersharks.suppliersearchapi.Entity.Supplier;
import com.makersharks.suppliersearchapi.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public Page<Supplier> querySuppliers(
            @RequestParam String location,
            @RequestParam NatureOfBusiness natureOfBusiness,
            @RequestParam ManufacturingProcess manufacturingProcess,
            Pageable pageable) {
        return supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcess, pageable);
    }
}
