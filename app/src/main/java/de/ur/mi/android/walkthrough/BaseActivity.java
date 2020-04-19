package de.ur.mi.android.walkthrough;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.ur.mi.android.exercises.walkthrough.R;

public class BaseActivity extends Activity implements View.OnClickListener {

    protected Button optionA;
    protected Button optionB;
    protected TextView textContent;
    protected Class targetForOptionA = null;
    protected Class targetForOptionB = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }

    private void initUI() {
        setContentView(R.layout.activity_walkthrough);
        optionA = findViewById(R.id.buttonOptionA);
        optionB = findViewById(R.id.buttonOptionB);
        optionA.setOnClickListener(this);
        optionB.setOnClickListener(this);
        textContent = findViewById(R.id.content);
        textContent.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonOptionA:
                startIntent(targetForOptionA);
                break;
            case R.id.buttonOptionB:
                startIntent(targetForOptionB);
                break;
            default:
                break;
        }
    }

    private void startIntent(Class target) {
        Intent intent = new Intent(this.getBaseContext(), target);
        startActivity(intent);
    }

}
