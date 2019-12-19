package com.juborajsarker.assignment.utils;

import android.app.ProgressDialog;
import android.content.Context;

public class MyDialog {

    public Context context;
    public String dialogMessage;
    public boolean cancelable;

    ProgressDialog dialog;

    public MyDialog(Context context, String dialogMessage, boolean cancelable) {
        this.context = context;
        this.dialogMessage = dialogMessage;
        this.cancelable = cancelable;
    }

    public void showDialog(){

        dialog = new ProgressDialog(this.context);
        dialog.setMessage(this.dialogMessage);
        dialog.setCancelable(this.cancelable);
        dialog.setIndeterminate(false);
        dialog.show();
    }

    public void dismissDialog(){

        dialog.dismiss();
    }
}
