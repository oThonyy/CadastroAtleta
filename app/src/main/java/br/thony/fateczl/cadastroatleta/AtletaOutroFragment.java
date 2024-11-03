package br.thony.fateczl.cadastroatleta;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import br.thony.fateczl.cadastroatleta.controller.IOperacao;
import br.thony.fateczl.cadastroatleta.controller.OperacaoAtletaOutro;
import br.thony.fateczl.cadastroatleta.model.AtletaOutro;

public class AtletaOutroFragment extends Fragment {

    private View view;
    private EditText etNomeO, etDataO, etBairro, etAcademiO, etRecordO;
    private Button btnCadastraO;

    public AtletaOutroFragment() {
        super();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_atleta_outro, container, false);

        etNomeO = view.findViewById(R.id.etNomeO);
        etDataO = view.findViewById(R.id.etDataO);
        etBairro = view.findViewById(R.id.etBairroO);
        etAcademiO = view.findViewById(R.id.etAcademiaO);
        etRecordO = view.findViewById(R.id.etRecordO);
        btnCadastraO = view.findViewById(R.id.btnCadastraO);

        btnCadastraO.setOnClickListener(op -> cadastroO());
        return view;
    }

    private void cadastroO() {
        AtletaOutro atO = new AtletaOutro();
        atO.setNome(etNomeO.getText().toString());
        atO.setDataNasc(etDataO.getText().toString());
        atO.setBairro(etBairro.getText().toString());
        atO.setAcademia(etAcademiO.getText().toString());
        atO.setRecord(Double.parseDouble(etRecordO.getText().toString()));

        IOperacao<AtletaOutro> op = new OperacaoAtletaOutro();
        op.cadastra(atO);
        Toast.makeText(view.getContext(), atO.toString(), Toast.LENGTH_LONG).show();
    }
}
