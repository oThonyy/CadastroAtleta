package br.thony.fateczl.cadastroatleta.controller;

import java.util.ArrayList;
import java.util.List;

import br.thony.fateczl.cadastroatleta.model.AtletaJunior;

public class OperacaoAtletaJunior implements IOperacao<AtletaJunior> {

    private List<AtletaJunior> atList;

    public OperacaoAtletaJunior() {
        this.atList = new ArrayList<>();
    }

    @Override
    public void cadastra(AtletaJunior atletaJunior) {
        atList.add(atletaJunior);
    }
}
