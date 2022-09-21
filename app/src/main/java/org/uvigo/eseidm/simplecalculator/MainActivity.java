package org.uvigo.eseidm.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.uvigo.eseidm.simplecalculator.model.Calculator;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonSum);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSum();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLocale("fr_FR");

    }

    private void updateLocale(String localeString) {
        // Aplica el cambio de locale a la actividad en función de un valor preestablecido
        // aunque podría ser establecido a partir de una selección desde la interfaz
        if (!this.getResources().getConfiguration().getLocales().get(0).toString().equalsIgnoreCase(localeString)){
            Configuration configuration = getResources().getConfiguration();
            configuration.setLocale(Locale.FRANCE);
            recreate();
        }
    }

    private void doSum() {
        try {
            Calculator calculator = new Calculator();

            EditText editText = findViewById(R.id.editTextOp1);
            Double op1 = Double.parseDouble(editText.getText().toString());
            calculator.setOp1(op1);

            editText = findViewById(R.id.editTextOp2);
            Double op2 = Double.parseDouble(editText.getText().toString());
            calculator.setOp2(op2);

            TextView textView = findViewById(R.id.textViewResult);
            textView.setText(calculator.sum()+"");
        }catch(Exception e){
            Log.e(MainActivity.class.getSimpleName(), e.getMessage(), e);
        }

    }
}