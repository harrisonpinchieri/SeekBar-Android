package seekbar.cursoandroid.com.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekbar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = findViewById(R.id.seekBarId);
        textoExibicao = findViewById(R.id.textoExibicaoId);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
//            Cada vez que movimenta o seekbar, o método  onProgressChanged
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textoExibicao.setText("Progresso: " + i + " / "+ seekBar.getMax());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this, "Seekbar pressionado", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Salvar valor", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
