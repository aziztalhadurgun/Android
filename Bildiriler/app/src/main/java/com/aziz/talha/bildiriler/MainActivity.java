package com.aziz.talha.bildiriler;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnT;
    Button btnA;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textview);
        btnT = findViewById(R.id.toast);
        btnA = findViewById(R.id.alert);

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast mesajını bu metodla cağırıyoruz,3 parametre alıyor
                //1. parametre context
                //2. parametre mesajımız
                //3. parametre süre
                Toast.makeText(getApplicationContext(),"Merhaba Toast Mesaj",Toast.LENGTH_LONG).show();
            }
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Mesaj Başlığı")
                        .setMessage("vermek istediğiniz mesaj...")
                        .setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Olumlu cevap verildiğinde yapmasını istediğimiz şeyler
                                tv.setText("Tamam butonuna bastınız");
                            }
                        })
                        .setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //olumsuz cevap verildiğinde yapmasını istediğimiz şeyler
                                tv.setText("iptal butonuna bastınız");
                            }
                        })
                        .show();
            }
        });
    }
}
