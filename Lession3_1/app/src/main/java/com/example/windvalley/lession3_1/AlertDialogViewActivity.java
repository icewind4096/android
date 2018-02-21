package com.example.windvalley.lession3_1;

import android.app.AliasActivity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class AlertDialogViewActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_view);
        Button button1 = findViewById(R.id.AlertDialogViewActivity_buttonView_1);
        Button button2 = findViewById(R.id.AlertDialogViewActivity_buttonView_2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.AlertDialogViewActivity_buttonView_1){
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(AlertDialogViewActivity.this);
            alertDialog.setTitle("This is Dialog");
            alertDialog.setMessage("Something important.");
            alertDialog.setCancelable(false);
            alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertDialog.show();
        } else {
            if (view.getId() == R.id.AlertDialogViewActivity_buttonView_2){
                ProgressDialog progressBarDialog = new ProgressDialog(AlertDialogViewActivity.this);
                progressBarDialog.setTitle("This is Dialog");
                progressBarDialog.setMessage("Loading ...");
                progressBarDialog.setCancelable(true);
                progressBarDialog.show();
            }
        }
    }
}
