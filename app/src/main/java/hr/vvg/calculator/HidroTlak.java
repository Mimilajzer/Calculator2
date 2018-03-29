package hr.vvg.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.view.inputmethod.InputMethodManager;

import java.math.BigDecimal;

public class HidroTlak extends AppCompatActivity {

    private EditText eTmasa;
    private EditText eTvolumen;
    private EditText eTgustoca;
    private EditText eTvisina;
    private EditText eThidroTlak;
    public static final BigDecimal ubrzanjeSileTeze = new BigDecimal  (9.81);

    public void blabla (View V) {

        BigDecimal masa = new BigDecimal(eTmasa.getText().toString());
        BigDecimal volumen = new BigDecimal(eTvolumen.getText().toString());
        BigDecimal gustoca = masa.divide(volumen);
        BigDecimal visina = new BigDecimal(eTvisina.getText().toString());
        BigDecimal tlak = gustoca.multiply(visina).multiply(ubrzanjeSileTeze);
        tlak = tlak.setScale(2, BigDecimal.ROUND_HALF_UP);

        eTgustoca.setText(gustoca.toString());
        eThidroTlak.setText(tlak.toString());


    }



        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidro_tlak);

        eTmasa =  findViewById(R.id.eTmasa);
        eTvolumen =  findViewById(R.id.eTvolumen);
        eTgustoca =  findViewById(R.id.eTgustoca);
        eTvisina =  findViewById(R.id.eTvisina);
        eThidroTlak =  findViewById(R.id.eThidroTlak);


    }
}
