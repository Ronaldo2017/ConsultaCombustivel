package consultacombustivel.cursoandroid.com.consultacombustivel;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimeiraActivity extends Activity {

    private Button btnConsumo;
    private Button btnAlcoolGasolina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        btnAlcoolGasolina = (Button) findViewById(R.id.btnAlcoolGasolina);
        btnConsumo = (Button) findViewById(R.id.btnConsumo);

        btnConsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrimeiraActivity.this,ConsumoActivity.class));
            }
        });

        btnAlcoolGasolina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrimeiraActivity.this,UtilizarCombustivelActivity.class));
            }
        });
    }
}
