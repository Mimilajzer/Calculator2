package hr.vvg.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toHidroTlak(View v) {

        if (v.getId() == R.id.ImagerButtonHidroTlak) {
            Intent k = new Intent(MainActivity.this, HidroTlak.class);
            startActivity(k);
        }
    }

    public void toMegabajti(View v) {

        if (v.getId() == R.id.ImagerButtonMegabajti) {
            Intent i = new Intent(MainActivity.this, Megabajti.class);
            startActivity(i);
        }
    }
}
