package techkids.mad3.trungnt.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TrungNT on 3/31/2016.
 */
public class BlueAcitivity extends AppCompatActivity {
    private Button btnMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);
    }

    public void proceesMainActivity()
    {
        btnMainActivity = (Button) findViewById(R.id.btnBack);
        btnMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    //dung intent de start MainActivity
    private void openMainActivity()
    {
        Intent intentMainActivity = new Intent(this, MainActivity.class);
        startActivity(intentMainActivity);
    }
}
