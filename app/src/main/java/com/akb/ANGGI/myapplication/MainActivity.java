package com.akb.ANGGI.myapplication;
/*Tanggal Pengerjaan : 19 Mei 2019
 * NIM : 10116042
 * Nama : ANGGI
 * Kelas : AKB-1*/

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);

    }
}
