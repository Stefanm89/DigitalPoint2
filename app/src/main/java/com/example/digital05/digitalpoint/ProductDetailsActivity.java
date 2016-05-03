package com.example.digital05.digitalpoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProductDetailsActivity extends AppCompatActivity {
    private TextView mTitleTextView;
    private TextView mDescTextView;
    private ImageView mScreenshot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Project project = (Project) getIntent().getSerializableExtra(HomeFragment.EXTRA_PROJECT);

        mTitleTextView = (TextView) findViewById(R.id.titleTextView);
        mTitleTextView.setText(project.getmTitle());

        mDescTextView = (TextView) findViewById(R.id.descTextView);
        mDescTextView.setText(project.getmDescription());

        mScreenshot = (ImageView) findViewById(R.id.screenShotView);
        mScreenshot.setImageResource(project.getmPhoto());


    }
}
