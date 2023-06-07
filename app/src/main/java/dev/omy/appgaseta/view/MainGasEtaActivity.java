package dev.omy.appgaseta.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import dev.omy.appgaseta.R;
import dev.omy.appgaseta.apoio.UtilGasEta;

public class MainGasEtaActivity extends AppCompatActivity {

EditText editText_gasolina;
EditText editText_etanol;

Button btn_calcular;
Button btn_limpar;
Button btn_salvar;
Button btn_finalizar;

TextView textView_Resultado;

Double gasolina;
Double etanol;
String recomendacao;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_gaseta);

        UtilGasEta.metodoNaoEstatico();

        editText_gasolina = findViewById(R.id.editText_gasolina);
        editText_etanol = findViewById(R.id.editText_etanol);
        btn_calcular = findViewById(R.id.btn_calcular);
        btn_limpar = findViewById(R.id.btn_limpar);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_finalizar = findViewById(R.id.btn_finalizar);
        textView_Resultado = findViewById(R.id.textView_Resultado);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            boolean isDadosOK = true;

            if(TextUtils.isEmpty(editText_gasolina.getText())) {
                editText_gasolina.setError("* Obrigatório");
                editText_gasolina.requestFocus();
                isDadosOK = false;
            }

            if(TextUtils.isEmpty(editText_etanol.getText())) {
                editText_etanol.setError("* Obrigatório");
                editText_etanol.requestFocus();
                isDadosOK = false;
            }

            if(isDadosOK) {

                gasolina = Double.parseDouble(editText_gasolina.getText().toString());
                etanol = Double.parseDouble(editText_etanol.getText().toString());

                recomendacao = UtilGasEta.calcularMelhorOpcao(gasolina, etanol);

                textView_Resultado.setText(recomendacao);

            } else {
                Toast.makeText(MainGasEtaActivity.this,
                        "Por favor digite os dados corretamente!",
                        Toast.LENGTH_LONG).show();
            }

            }
        });

        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText_gasolina.setText("");
                editText_etanol.setText("");

            }
        });

        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainGasEtaActivity.this, "GasEta boa economia!",
                        Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
