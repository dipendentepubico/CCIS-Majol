package it.dipendentepubico.CCIS.adapter.repository.major.model;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.FelDACImportFattureEntity;

import java.util.List;

public class FatturaEntityList {
    private List<FelDACImportFattureEntity> list;

    public FatturaEntityList(List<FelDACImportFattureEntity> list) {
        this.list = list;
    }

    public List<FelDACImportFattureEntity> getList() {
        return list;
    }

    public void setList(List<FelDACImportFattureEntity> list) {
        this.list = list;
    }
}
