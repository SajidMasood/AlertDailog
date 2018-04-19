package com.mr_abdali.alertdailog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //
    AlertDialog alertDialog;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // show dialog message ...
        // color change method no 2....
        builder = new AlertDialog.Builder(MainActivity.this,R.style.AlertDialogTheme);
        builder.setMessage("Discard Draft ?");

        // option to confirm yes or no
        builder.setPositiveButton("DISCARD", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // <code></code>
                //System.out.println("discart");
            }
        });
        // option to confirm no negative
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // <code></code>
                System.out.println("Cancel");
            }
        });

        alertDialog = builder.create();
        alertDialog.show();

        // color change Method no 1
        /*alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.colorAlertDailoq));
        alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.colorAlertDailoq));*/

        // color change method no 2....
    }
}
