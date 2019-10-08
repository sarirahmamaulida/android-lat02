package id.ac.poliban.mi.sari.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hubungkan masing2 view yang ingin di manipulasi
        //dengan object yang kita buat
        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBismaDewaBrata = findViewById(R.id.btBismaDewaBrata);
        Button btBasudewa = findViewById(R.id.btBasudewa);

        //Pasang event Listener & handler
        //menggunakan kelas anonim yang menginplementasikan interface
        //View.OnclikListener
        btKrisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "I'm Krisna, Advisor of Arjuna", Toast.LENGTH_SHORT).show();

            }
        });
        btBismaDewaBrata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "I'm Bisma Dewa Brata, the godFather of Hastina", Toast.LENGTH_SHORT).show();

            }
        });
        btBasudewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The Brother of Krisna", Toast.LENGTH_SHORT).show();

            }
        });
    }
    }

