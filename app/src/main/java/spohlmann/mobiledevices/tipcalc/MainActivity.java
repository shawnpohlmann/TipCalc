package spohlmann.mobiledevices.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etBill;
    EditText etParty;
    TextView tvTip;
    TextView tvPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etBill = (EditText) findViewById((R.id.bill));
        etParty = (EditText) findViewById((R.id.numParty));
        tvTip = (TextView) findViewById((R.id.totalTip));
        tvPerson = (TextView) findViewById((R.id.tipPerPerson));


    }

    public void onClick(View view) {
        double b = Double.parseDouble(etBill.getText().toString());
        double p = Double.parseDouble(etParty.getText().toString());
        double tip = b * .10;
        double person = tip / p;

        tvTip.setText("The total tip is: " + tip);
        tvPerson.setText("Each person should tip: " + person);
    }
}
