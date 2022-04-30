package it.dipendentepubico.CCIS.adapter.repository.major.model;

import it.dipendentepubico.CCIS.usecase.domain.FlussoSdi;

import java.util.List;

public class FlussoSdiList {
    private List<FlussoSdi> list;

    public FlussoSdiList(List<FlussoSdi> list) {
        this.list = list;
    }

    public List<FlussoSdi> getList() {
        return list;
    }

    public void setList(List<FlussoSdi> list) {
        this.list = list;
    }
}
