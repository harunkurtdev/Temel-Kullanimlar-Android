package com.serifgungor.customdialogkullanimi.Activity;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.serifgungor.customdialogkullanimi.Helper.DialogHelper;
import com.serifgungor.customdialogkullanimi.R;

public class MainActivity extends AppCompatActivity {

    Button btnPromptDialog,btnCheckboxDialog,btnFeedbackDialog;
    DialogHelper dialogHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogHelper = new DialogHelper(getApplicationContext(),this);

        btnPromptDialog = findViewById(R.id.btnPromptDialog);
        btnPromptDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogHelper.promptDialog();
            }
        });

        btnCheckboxDialog = findViewById(R.id.btnCheckboxDialog);
        btnCheckboxDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogHelper.checkboxDialog(
                        "Sevdiğiniz Renkler ?",
                        new String[]{"Kırmızı","Mor","Pembe","Mavi","Yeşil","Lacivert","Turuncu"}
                );
            }
        });

        btnFeedbackDialog = findViewById(R.id.btnFeedbackDialog);
        btnFeedbackDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogHelper.feedbackDialog(
                        "Uygulamamıza puan vermek ister misiniz ?",
                        "Belki sonra :)",
                        "Değerlendir"
                );
            }
        });

    }
}
