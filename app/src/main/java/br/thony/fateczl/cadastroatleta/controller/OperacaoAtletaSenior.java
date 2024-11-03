package br.thony.fateczl.cadastroatleta.controller;

import java.util.ArrayList;
import java.util.List;

import br.thony.fateczl.cadastroatleta.model.AtletaSenior;

public class OperacaoAtletaSenior implements IOperacao<AtletaSenior> {

    private List<AtletaSenior> atList;

    public OperacaoAtletaSenior() {
        this.atList = new ArrayList<>();
    }

    @Override
    public void cadastra(AtletaSenior atletaSenior) {
        atList.add(atletaSenior);
    }
}
