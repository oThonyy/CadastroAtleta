package br.thony.fateczl.cadastroatleta.model;

import androidx.annotation.NonNull;

public class AtletaOutro extends Atleta {
    private String academia;
    private double record;

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaOutro{" +
                "nome='" + getNome() + '\'' +
                ", dataNasc='" + getDataNasc() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", academia='" + academia + '\'' +
                ", record=" + record +
                '}';
    }
}
