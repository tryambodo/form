package id.sch.smktelkom_mlg.tugas01.xirpl3005.form;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    RadioGroup rgGender;
    CheckBox cbJaringan;
    CheckBox cbPemrograman;
    Spinner spJurusan;
    Button btnSubmit;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        rgGender = (RadioGroup) findViewById(R.id.RadioGroupGender);
        cbJaringan = (CheckBox) findViewById(R.id.checkBoxJaringan);
        cbPemrograman = (CheckBox) findViewById(R.id.checkBoxPemrograman);
        spJurusan = (Spinner) findViewById(R.id.spinnerJurusan);
        btnSubmit = (Button) findViewById(R.id.buttonSubmit);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }

            private void doClick() {
                String hasil = null;
                String tugas = "";

                String nama = etNama.getText() + " ";
                if (cbJaringan.isChecked()) {
                    tugas += cbJaringan.getText() + " ";
                }
                if (cbPemrograman.isChecked()) {
                    tugas += cbPemrograman.getText() + " ";
                }
                if (rgGender.getCheckedRadioButtonId() != -1) {
                    RadioButton rb = (RadioButton)
                            findViewById(rgGender.getCheckedRadioButtonId());
                    hasil = rb.getText().toString();
                    tvHasil.setText(nama + " " + "jurusan " + spJurusan.getSelectedItem().toString() + " " + " gender " + hasil + " " + " dengan minat " + tugas);
                }
            }
        });
    }
}
