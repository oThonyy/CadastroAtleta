package br.thony.fateczl.cadastroatleta.model;

import androidx.annotation.NonNull;

public class AtletaSenior extends Atleta {
    private boolean cardiaco;

    public boolean isCardiaco() {
        return cardiaco;
    }

    public void setCardiaco(boolean cardiaco) {
        this.cardiaco = cardiaco;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaSenior{" +
                "nome='" + getNome() + '\'' +
                ", dataNasc='" + getDataNasc() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", atletaCardiaco=" + cardiaco +
                '}';
    }
}
