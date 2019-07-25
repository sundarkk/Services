package in.apkglobal.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    Button btn_play, btn_stop;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);

        //Picasso.get().load("http://searchkero.com/aaa/back.PNG").into(imageView);

       Glide.with(this).load("http://searchkero.com/aaa/back.PNG")
               .into(imageView);
        btn_play=findViewById(R.id.btn_play);
        btn_stop=findViewById(R.id.btn_stop);
        final Intent intent=new Intent(MainActivity.this, Music.class);

        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stopService(intent);

            }
        });
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startService(intent);
                finish();
            }
        });
    }
}
