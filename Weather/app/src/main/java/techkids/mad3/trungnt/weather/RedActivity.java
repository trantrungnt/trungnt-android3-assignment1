package techkids.mad3.trungnt.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TrungNT on 3/31/2016.
 */
public class RedActivity extends AppCompatActivity {
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
        processMainActivity();
    }

    public void processMainActivity()
    {
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenMainActivityByRedActivity();
            }
        });
    }

    private void OpenMainActivityByRedActivity()
    {
        //dong RedActivity
        this.finish();
    }
}
