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
        //goi phuong thuc xu ly goi su kien click nut btnBack de mo MainActivity
        proceesMainActivity();
    }

    public void proceesMainActivity()
    {
        btnMainActivity = (Button) findViewById(R.id.btnBack);
        btnMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenMainActivityByBlueActivity();
            }
        });
    }

    //dung intent de start MainActivity
    public void OpenMainActivityByBlueActivity()
    {
        //dong BlueActivity
        this.finish();
    }
}
