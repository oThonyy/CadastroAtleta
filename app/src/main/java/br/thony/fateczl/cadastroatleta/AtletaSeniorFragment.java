package br.thony.fateczl.cadastroatleta;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import br.thony.fateczl.cadastroatleta.controller.IOperacao;
import br.thony.fateczl.cadastroatleta.controller.OperacaoAtletaSenior;
import br.thony.fateczl.cadastroatleta.model.AtletaSenior;

public class AtletaSeniorFragment extends Fragment {

    private View view;
    private EditText etNomeS, etDataS, etBairroS;
    private CheckBox cbCardiacoS;
    private Button btnCadastraS;

    public AtletaSeniorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_atleta_senior, container, false);

        etNomeS = view.findViewById(R.id.etNomeS);
        etDataS = view.findViewById(R.id.etDataS);
        etBairroS = view.findViewById(R.id.etBairroS);
        cbCardiacoS = view.findViewById(R.id.cbCardiacoS);
        btnCadastraS = view.findViewById(R.id.btnCadastraS);

        btnCadastraS.setOnClickListener(op -> cadastroS());
        return view;
    }

    private void cadastroS() {
        AtletaSenior atS = new AtletaSenior();

        atS.setNome(etNomeS.getText().toString());
        atS.setDataNasc(etDataS.getText().toString());
        atS.setBairro(etBairroS.getText().toString());
        atS.setCardiaco(cbCardiacoS.isChecked());

        IOperacao<AtletaSenior> op = new OperacaoAtletaSenior();
        op.cadastra(atS);
        Toast.makeText(view.getContext(), atS.toString(), Toast.LENGTH_LONG).show();
    }

}

