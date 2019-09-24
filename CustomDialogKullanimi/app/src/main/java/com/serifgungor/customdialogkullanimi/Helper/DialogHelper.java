package com.serifgungor.customdialogkullanimi.Helper;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.serifgungor.customdialogkullanimi.R;

public class DialogHelper {
    private Context context;
    private Activity activity;

    public DialogHelper(){}
    public DialogHelper(Context context,Activity activity){
        this.context = context;
        this.activity = activity;
    }

    String getPromptText = "";

    public String getGetPromptText() {
        return getPromptText;
    }

    public void setGetPromptText(String getPromptText) {
        this.getPromptText = getPromptText;
    }

    public void promptDialog(){
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.dialog_prompt);
        final EditText etMesaj = dialog.findViewById(R.id.etPromptText);
        Button btnOk = dialog.findViewById(R.id.btnPromptOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setGetPromptText(etMesaj.getText().toString());
                Toast.makeText(context,getPromptText,Toast.LENGTH_LONG).show();
                dialog.dismiss(); //Dialog nesnesini kapatır
            }
        });

        dialog.show();
    }

    public void checkboxDialog(String baslik, String[] elemanlar){
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.dialog_checkbox);

        TextView tvCheckboxTitle = dialog.findViewById(R.id.tvCheckboxTitle);
        Button btnCheckboxKapat = dialog.findViewById(R.id.btnCheckboxKapat);
        LinearLayout linearLayoutCheckBox = dialog.findViewById(R.id.linearLayoutCheckBox);
        tvCheckboxTitle.setText(baslik);

        for (int i=0; i<elemanlar.length; i++){
            CheckBox checkBox = new CheckBox(context);
            checkBox.setText(elemanlar[i]);
            linearLayoutCheckBox.addView(checkBox);
        }
        btnCheckboxKapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    public void feedbackDialog(String baslik,String notNowText,String okText){
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.dialog_feedback);
        dialog.setCancelable(false); //Boş bir yere tıklayınca dialog kapanmasın

        TextView tvNotNow = dialog.findViewById(R.id.tvFeedbackNotNow);
        TextView tvOk = dialog.findViewById(R.id.tvFeedbackOK);
        TextView tvBaslik = dialog.findViewById(R.id.tvFeedbackTitle);
        tvBaslik.setText(baslik);
        tvOk.setText(okText);
        tvNotNow.setText(notNowText);

        tvNotNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        tvOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PLAY STORE'A GİDEN KODU YAZINIZ
                dialog.dismiss();
            }
        });

        dialog.show();
    }


}
