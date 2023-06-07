package dev.omy.appgaseta.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import dev.omy.appgaseta.model.Pessoa;
import dev.omy.appgaseta.view.MainGasEtaActivity;

public class PessoaController {

    SharedPreferences preferences;

    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listVIP";

    public PessoaController(MainGasEtaActivity mainGasEtaActivity) {
        preferences = mainGasEtaActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller iniciada");

        return super.toString();
    }

    public void criarSharedPreferences() {

    }

    public void salvar(Pessoa pessoa) {

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome", pessoa.getSobreNome());
        listaVip.putString("cursoDesejado", pessoa.getCursoDesejado());
        listaVip.putString("telContato", pessoa.getTelContato());
        listaVip.apply();

        Log.d("MVC_Controller", "Salvo: " + pessoa.toString());

    }

    public void buscar(Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobreNome(preferences.getString("sobreNome", ""));
        pessoa.setCursoDesejado(preferences.getString("cursoDesejado", ""));
        pessoa.setTelContato(preferences.getString("telContato", ""));
    }

    public void limpar() {
        listaVip.clear();
        listaVip.apply();
    }
}
