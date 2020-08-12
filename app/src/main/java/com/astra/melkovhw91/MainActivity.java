package com.astra.melkovhw91;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner mLanguagesSpinner;
    private Spinner mStylesSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Utils.onActivityCreateSetTheme(this);

        //setTheme(R.style.AppThemeGreen);
        super.onCreate(savedInstanceState);
        //Utils.onActivityCreateSetTheme(this);

        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mLanguagesSpinner = findViewById(R.id.spinner_language);
        mStylesSpinner = findViewById(R.id.spinner_style);

        Button btnChange = findViewById(R.id.button_change_language);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(mStylesSpinner.getSelectedItemPosition()) {
                    case 0:
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLACK);
                        break;
                    case 1:
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_GREEN);
                        break;
                    case 2:
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLUE);
                }
            }
        });

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