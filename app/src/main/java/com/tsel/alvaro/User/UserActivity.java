package com.tsel.alvaro.User;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tsel.alvaro.Peminjaman.PeminjamanActivity;
import com.tsel.alvaro.Pengembalian.PengembalianActivity;
import com.tsel.alvaro.R;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Button btnPeminjaman = (Button) findViewById(R.id.pinjam) ;
        Button btnPengembalian = (Button) findViewById(R.id.kembali) ;

        btnPeminjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserActivity.this, PeminjamanActivity.class);
                startActivity(i);
            }
        });

        btnPengembalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserActivity.this, PengembalianActivity.class);
                startActivity(i);
            }
        });
    }
}
