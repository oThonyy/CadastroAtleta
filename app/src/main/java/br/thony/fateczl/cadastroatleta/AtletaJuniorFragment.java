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
import br.thony.fateczl.cadastroatleta.controller.OperacaoAtletaJunior;
import br.thony.fateczl.cadastroatleta.model.AtletaJunior;

public class AtletaJuniorFragment extends Fragment {

    private View view;
    private EditText etNomeJ, etDataJ, etAnosJ, etBairroJ;
    private Button btnCadastraJ;

    public AtletaJuniorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_atleta_junior, container, false);

        etNomeJ = view.findViewById(R.id.etNomeJ);
        etDataJ = view.findViewById(R.id.etDataJ);
        etAnosJ = view.findViewById(R.id.etAnosJ);
        etBairroJ = view.findViewById(R.id.etBairroJ);
        btnCadastraJ = view.findViewById(R.id.btnCadastraJ);

        btnCadastraJ.setOnClickListener(op -> cadastroJ());
        return view;
    }

    private void cadastroJ() {
        AtletaJunior atJ = new AtletaJunior();

        atJ.setNome(etNomeJ.getText().toString());
        atJ.setDataNasc(etDataJ.getText().toString());
        atJ.setBairro(etBairroJ.getText().toString());
        atJ.setAnosTreino(Integer.parseInt(etAnosJ.getText().toString()));

        IOperacao<AtletaJunior> op = new OperacaoAtletaJunior();
        op.cadastra(atJ);
        Toast.makeText(view.getContext(), atJ.toString(), Toast.LENGTH_LONG).show();
    }
}
