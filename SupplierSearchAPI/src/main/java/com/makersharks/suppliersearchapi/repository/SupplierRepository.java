package com.makersharks.suppliersearchapi.repository;

import com.makersharks.suppliersearchapi.Entity.ManufacturingProcess;
import com.makersharks.suppliersearchapi.Entity.NatureOfBusiness;
import com.makersharks.suppliersearchapi.Entity.Supplier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
            String location,
            NatureOfBusiness natureOfBusiness,
            Collection<ManufacturingProcess> manufacturingProcesses,
            Pageable pageable
    );
}