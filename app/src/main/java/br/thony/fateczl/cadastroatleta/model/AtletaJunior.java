package br.thony.fateczl.cadastroatleta.model;

import androidx.annotation.NonNull;

public class AtletaJunior extends Atleta {
    private int anosTreino;

    public int getAnosTreino() {
        return anosTreino;
    }

    public void setAnosTreino(int anosTreino) {
        this.anosTreino = anosTreino;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaJuvenil{" +
                "nome='" + getNome() + '\'' +
                ", dataNasc='" + getDataNasc() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", anosTreino=" + anosTreino +
                '}';
    }
}
