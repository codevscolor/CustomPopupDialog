package com.example.custompopupdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class CustomDialog extends DialogFragment {

    public CustomDialog() {

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        View view = inflater.inflate(R.layout.custom_dialog, null);
        builder.setView(view);

        builder.setCancelable(true);
        return builder.create();
    }

    public static CustomDialog newInstance() {
        CustomDialog fragment = new CustomDialog();
        return fragment;
    }
}
