package io.github.hexiangyuan.sharedelementtransitionsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ActivityA extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivit_a);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void imageClick(View v) {
        Intent intent = new Intent(this, ActivityB.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, imageView,
                getString(R.string.transitions_name)
        );
        startActivity(intent, optionsCompat.toBundle());
    }
}
