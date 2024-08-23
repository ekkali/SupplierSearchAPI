package com.makersharks.suppliersearchapi.Service;

import com.makersharks.suppliersearchapi.Entity.ManufacturingProcess;
import com.makersharks.suppliersearchapi.Entity.NatureOfBusiness;
import com.makersharks.suppliersearchapi.Entity.Supplier;
import com.makersharks.suppliersearchapi.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> searchSuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess, Pageable pageable) {
        List<ManufacturingProcess> manufacturingProcesses = Collections.singletonList(manufacturingProcess);
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(location, natureOfBusiness, manufacturingProcesses, pageable);
    }



}
