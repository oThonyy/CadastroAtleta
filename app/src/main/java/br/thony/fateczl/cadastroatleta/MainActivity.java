package br.thony.fateczl.cadastroatleta;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Fragment flFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            loadFragment(bundle);
        }
    }

    private void loadFragment(Bundle bundle) {
        String tipoAtleta = bundle.getString("tipoAtleta");
        assert tipoAtleta != null;
        if (tipoAtleta.equals("AtletaJ")) {
            flFragment = new AtletaJuniorFragment();
        }
        if (tipoAtleta.equals("AtletaS")) {
            flFragment = new AtletaSeniorFragment();
        }
        if (tipoAtleta.equals("AtletaO")) {
            flFragment = new AtletaOutroFragment();
        }

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, flFragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Bundle bundle = new Bundle();
        Intent i = new Intent(this, MainActivity.class);

        if (id == R.id.menu_atletaJ) {
            bundle.putString("tipoAtleta", "AtletaJ");
            i.putExtras(bundle);
            this.startActivity(i);
            this.finish();
            return true;
        }
        if (id == R.id.menu_atletaS) {
            bundle.putString("tipoAtleta", "AtletaS");
            i.putExtras(bundle);
            this.startActivity(i);
            this.finish();
            return true;
        }
        if (id == R.id.menu_atletaO) {
            bundle.putString("tipoAtleta", "AtletaO");
            i.putExtras(bundle);
            this.startActivity(i);
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}