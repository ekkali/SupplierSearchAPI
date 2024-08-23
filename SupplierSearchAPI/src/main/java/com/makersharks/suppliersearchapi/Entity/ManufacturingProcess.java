package com.makersharks.suppliersearchapi.Entity;

public enum ManufacturingProcess {

    MOULDING("moulding"),
    _3D_PRINTING("3d_printing"),
    CASTING("casting"),
    COATING("coating");



    private final String process;

    ManufacturingProcess(String process) {
        this.process = process;
    }

    public String getProcess() {
        return process;
    }


}
