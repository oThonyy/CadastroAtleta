package br.thony.fateczl.cadastroatleta.controller;

import java.util.ArrayList;
import java.util.List;

import br.thony.fateczl.cadastroatleta.model.AtletaOutro;

public class OperacaoAtletaOutro implements IOperacao<AtletaOutro> {

    private List<AtletaOutro> atList;

    public OperacaoAtletaOutro() {
        this.atList = new ArrayList<>();
    }

    @Override
    public void cadastra(AtletaOutro atletaOutro) {
        atList.add(atletaOutro);
    }
}
