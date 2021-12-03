package com.example.historykart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class ShablonStr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shablon_str);
        Intent intent = getIntent();

        String kartinka = intent.getStringExtra("kartinka");
        String taxt = intent.getStringExtra("taxt");

        SubsamplingScaleImageView im = findViewById(R.id.imageView);
        String mDrawableName = kartinka;
        int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());
        im.setImage(ImageSource.resource(resID));

        TextView txt = findViewById(R.id.textView8);
        String mStringName = taxt;
        int resID1 = getResources().getIdentifier(mStringName , "strings", getPackageName());
        txt.setText(resID1);
    }

    public  void home (View v)
    {
        Intent hmn = new Intent(this,MenuHistoryMir.class);
        hmn.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(hmn);
    }
}