package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnOpenAlertDialog).setOnClickListener(v -> {

            // b1 . khoi tao
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            // b2 . set title
            builder.setTitle("Hello!!!");
            builder.setIcon(R.drawable.ic_launcher_background);
            View view = LayoutInflater.from(MainActivity.this)
                    .inflate(R.layout.custom_dialog,null);
            builder.setView(view);
            EditText edtUsername = view.findViewById(R.id.edtUsername);
            EditText edtPassword = view.findViewById(R.id.edtPassword);
            Button btnLogin = view.findViewById(R.id.btnLOGIN);
            AlertDialog dialog = builder.show();
            btnLogin.setOnClickListener(von -> {
                Toast.makeText(this, edtUsername.getText().toString(),
                        Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });





        });
    }
}