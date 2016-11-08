package com.example.jgervas.tdialogs;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends Activity
        implements TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePickerDialog(View v)
    {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
    }

    public void showDatePickerDialog(View v)
    {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "datePicker");
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Toast.makeText(getBaseContext(),new StringBuilder().append(year).append("/").append(month+1).append("/").append(dayOfMonth), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(getBaseContext(),new StringBuilder().append(hourOfDay).append(":").append(minute), Toast.LENGTH_LONG).show();
    }

    public void showAlertDialog(View v)
    {

        DialogFragment newFragment = AlertDialogFragment.newInstance(
                R.string.alert_dialog_text);
        newFragment.show(getFragmentManager(), "dialog");
    }

    public void doPositiveClick() {
        // Look at your Android Monitor to see the message.
        Log.i("FragmentAlertDialog", "Positive click!");
    }

    public void doNegativeClick() {
        // Look at your Android Monitor to see the message.
        Log.i("FragmentAlertDialog", "Negative click!");
    }
}
