package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView textViewStory;
    Button topButton, bottomButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        textViewStory = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {

                    textViewStory.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);

                    mStoryIndex = 3;

                } else if (mStoryIndex == 3 && textViewStory.getText().equals(getResources().getString(R.string.T3_Story))) {

                    textViewStory.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);

                    //mStoryIndex = 1;

                } else if (mStoryIndex == 2 && textViewStory.getText().equals(getResources().getString(R.string.T2_Story))) {

                    textViewStory.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);

                    mStoryIndex = 3;

                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {

                    textViewStory.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);

                    mStoryIndex = 2;

//                    Log.d("Checada", "onClick: " + getResources().getString(R.string.T1_Story));

                } else if (mStoryIndex == 2 && textViewStory.getText().equals(getResources().getString(R.string.T2_Story))) {

                    textViewStory.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);

                } else if (mStoryIndex == 3 && textViewStory.getText().equals(getResources().getString(R.string.T3_Story))) {

                    textViewStory.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);

                }

            }
        });

    }
}
