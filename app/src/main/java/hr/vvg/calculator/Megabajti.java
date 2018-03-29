package hr.vvg.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import java.math.BigInteger;

public class Megabajti extends AppCompatActivity {

    private EditText eTkiloBajt;
    private EditText eTmegaBajt;
    private EditText eTgigaBajt;
    private EditText eTteraBajt;
    private EditText eTpetaBajt;
    private EditText eTeksaBajt;
    private EditText eTzetaBajt;
    public static final BigInteger eksaBajtKonst = new BigInteger("1024");
    public static final BigInteger petaBajtKonst = new BigInteger("1048576");
    public static final BigInteger teraBajtKonst = new BigInteger("1073741824");
    public static final BigInteger gigaBajtKonst = new BigInteger("1099511627776");
    public static final BigInteger megaBajtKonst = new BigInteger("1125899906842624");
    public static final BigInteger kiloBajtKonst = new BigInteger("1152921504606846976");


    public void izracunaj2 (View V){

        BigInteger zetaBajt = new BigInteger(eTzetaBajt.getText().toString());
        BigInteger megaBajt = zetaBajt.multiply(megaBajtKonst);
        BigInteger gigaBajt = zetaBajt.multiply(gigaBajtKonst);
        BigInteger teraBajt = zetaBajt.multiply(teraBajtKonst);
        BigInteger petaBajt = zetaBajt.multiply(petaBajtKonst);
        BigInteger eksaBajt = zetaBajt.multiply(eksaBajtKonst);
        BigInteger kiloBajt = zetaBajt.multiply(kiloBajtKonst);

        eTmegaBajt.setText(megaBajt.toString());
        eTgigaBajt.setText(gigaBajt.toString());
        eTteraBajt.setText(teraBajt.toString());
        eTpetaBajt.setText(petaBajt.toString());
        eTeksaBajt.setText(eksaBajt.toString());
        eTkiloBajt.setText(kiloBajt.toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_megabajti);

        eTkiloBajt = findViewById(R.id.editTextKb);
        eTmegaBajt = findViewById(R.id.editTextMb);
        eTgigaBajt = findViewById(R.id.editTextGb);
        eTteraBajt = findViewById(R.id.editTextTb);
        eTpetaBajt = findViewById(R.id.editTextPb);
        eTeksaBajt = findViewById(R.id.editTextEb);
        eTzetaBajt = findViewById(R.id.editTextZb);
    }
}
