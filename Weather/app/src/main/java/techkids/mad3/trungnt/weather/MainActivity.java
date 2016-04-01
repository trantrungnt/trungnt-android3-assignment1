package techkids.mad3.trungnt.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnRed0, btnRed1, btnRed2, btnRed3, btnRed4, btnRed5;
    Button btnBlue0, btnBlue1, btnBlue2, btnBlue3, btnBlue4;
    Button btnGreen0, btnGreen1, btnGreen2, btnGreen3, btnGreen4, btnGreen5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewButton();
    }

    @Override
    public void onClick(View v) {
        connectButton(v);
    }

    private void initViewButton()
    {
        //tim id cua Button
        btnBlue0 = (Button) this.findViewById(R.id.btnBlue0);
        btnBlue1 = (Button) this.findViewById(R.id.btnBlue1);
        btnBlue2 = (Button) this.findViewById(R.id.btnBlue2);
        btnBlue3 = (Button) this.findViewById(R.id.btnBlue3);
        btnBlue4 = (Button) this.findViewById(R.id.btnBlue4);

        btnGreen0 = (Button) this.findViewById(R.id.btnGreen0);
        btnGreen1 = (Button) this.findViewById(R.id.btnGreen1);
        btnGreen2 = (Button) this.findViewById(R.id.btnGreen2);
        btnGreen3 = (Button) this.findViewById(R.id.btnGreen3);
        btnGreen4 = (Button) this.findViewById(R.id.btnGreen4);
        btnGreen5 = (Button) this.findViewById(R.id.btnGreen5);

        btnRed0 = (Button) this.findViewById(R.id.btnRed0);
        btnRed1 = (Button) this.findViewById(R.id.btnRed1);
        btnRed2 = (Button) this.findViewById(R.id.btnRed2);
        btnRed3 = (Button) this.findViewById(R.id.btnRed3);
        btnRed4 = (Button) this.findViewById(R.id.btnRed4);
        btnRed5 = (Button) this.findViewById(R.id.btnRed5);

        //btnBlue
        btnBlue0.setOnClickListener(this);
        btnBlue1.setOnClickListener(this);
        btnBlue2.setOnClickListener(this);
        btnBlue3.setOnClickListener(this);
        btnBlue4.setOnClickListener(this);

        //btnGreen
        btnGreen0.setOnClickListener(this);
        btnGreen1.setOnClickListener(this);
        btnGreen2.setOnClickListener(this);
        btnGreen3.setOnClickListener(this);
        btnGreen4.setOnClickListener(this);
        btnGreen5.setOnClickListener(this);

        //btnRed
        btnRed0.setOnClickListener(this);
        btnRed1.setOnClickListener(this);
        btnRed2.setOnClickListener(this);
        btnRed3.setOnClickListener(this);
        btnRed4.setOnClickListener(this);
        btnRed5.setOnClickListener(this);

    }

    private void connectButton(View v) {
        /////////////////////////////////////////////////////////////////////////////////////////
        //Xet dieu kien de dung phuong thuc click phu hop cho tung nut Button
        int id = v.getId();
        /*switch (id)
        {
            case R.id.btnRed0:
                OpenRedActivity();
            break;

        }*/
        btnRed0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenRedActivity();
            }
        });

        //kiem co phai la nut btnRed khong?
        /*if ((id == R.id.btnRed0)
            || (id == R.id.btnRed1)
            || (id == R.id.btnRed2)
            || (id == R.id.btnRed3)
            || (id == R.id.btnRed4)
            || (id == R.id.btnRed5)
            || (id == R.id.btnRed6)
            ) {
            OpenRedActivity();
        }

        //kiem tra day co phai la nut btnBlue khong?
        if ((id == R.id.btnBlue0)
            || (id == R.id.btnBlue1)
            || (id == R.id.btnBlue2)
            || (id == R.id.btnBlue3)
            || (id == R.id.btnBlue4)
            || (id == R.id.btnBlue5)
           )
        {
            OpenBlueActvity();
        }

        //kiem tra day co phai la nut btnGreen
        if ((id == R.id.btnGreen0)
            || (id == R.id.btnGreen1)
            || (id == R.id.btnGreen2)
            || (id == R.id.btnGreen3)
            || (id == R.id.btnGreen4)
            || (id == R.id.btnGreen5)
            || (id == R.id.btnGreen6)
           )
        {
            //dong MainActivity
            this.finish();
        }*/
    }

    private void OpenBlueActvity()
    {
        Intent intentBlueActivity = new Intent(this, BlueAcitivity.class);
        startActivity(intentBlueActivity);
    }

    private void OpenRedActivity()
    {
        Intent intentRedActivity = new Intent(this,  RedActivity.class);
        startActivity(intentRedActivity);
    }
}
