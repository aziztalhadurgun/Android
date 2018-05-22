package com.aziz.talha.ilkuygulamam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity.xml içinde tanımladığımız görünümleri java dosyamızda kullanabilmek için
        // yukarıda tanımladığımız değişkenlere atıyoruz.
        et = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        //artık et değişkeni view içindeki editText'i temsil etmektedir.

        btn.setOnClickListener(new View.OnClickListener() {//butona tıklandığında yapılacaklar
            @Override
            public void onClick(View view) {
                //buraya butona tıklandığında yapmasını istediğimiz seyleri yazıyoruz

                tv.setText(et.getText());
                //textview'in textine edittextten gelen veriyi gönderiyoruz.
            }
        });

    }
}
