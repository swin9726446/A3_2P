package com.example.a9726446.a3_2p;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Converter converter = new Converter();
    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            convert();
        }
    };

    private void convert() {
        String mi = ((TextView) findViewById(R.id.etMiles)).getText().toString();
        String ft = ((TextView) findViewById(R.id.etFeet)).getText().toString();
        String in = ((TextView) findViewById(R.id.etInches)).getText().toString();
        boolean isMetres = ((CheckBox) findViewById(R.id.chkMetres)).isChecked();
        ((TextView) findViewById(R.id.txtMetric)).setText(converter.Convert(mi, ft, in, isMetres));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseUI();
    }

    private void initialiseUI() {
        findViewById(R.id.btnConvert).setOnClickListener(clickListener);
    }


}
