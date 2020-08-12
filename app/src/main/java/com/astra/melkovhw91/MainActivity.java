package com.astra.melkovhw91;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner mLanguagesSpinner;
    private Spinner mStylesSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mLanguagesSpinner = findViewById(R.id.spinner_language);
        mStylesSpinner = findViewById(R.id.spinner_style);

        initSpinners();
    }

    private void initSpinners() {
        ArrayAdapter<CharSequence> adapterLanguages = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapterLanguages.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mLanguagesSpinner.setAdapter(adapterLanguages);

        ArrayAdapter<CharSequence> adapterStyles = ArrayAdapter.createFromResource(this, R.array.styles, android.R.layout.simple_spinner_item);
        adapterStyles.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mStylesSpinner.setAdapter(adapterStyles);
    }
}