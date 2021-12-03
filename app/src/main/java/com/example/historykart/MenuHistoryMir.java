package com.example.historykart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MenuHistoryMir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_history_mir);
        LinearLayout sps = findViewById(R.id.spisok1);
    }
    protected void shablon()
    {
        Button btn1;

    }
     private  void perehod(String i)
     {
         Intent tmm1 = new Intent(this,ShablonStr.class);
         tmm1.putExtra("kartinka","karta"+i);
         tmm1.putExtra("taxt", "@string/tema"+i);
         tmm1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
         startActivity(tmm1);
     }
     public void home(View v)
     {
         Intent hmn = new Intent(this, MainActivity.class);
         startActivity(hmn);
     }

    public void tm1(View v)
    {
        perehod("1");
    }
    public void tm2(View v)
    {
        perehod("2");
    }
}