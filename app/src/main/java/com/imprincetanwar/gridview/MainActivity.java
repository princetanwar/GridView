package com.imprincetanwar.gridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = findViewById(R.id.main_grid_layout);

        setSingleEvent(gridLayout);
    }

    private void setSingleEvent(GridLayout gridLayout) {

        for (int i = 0; i < gridLayout.getChildCount(); i++) {

            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    switch (finalI) {

                        case 0:

                            Toast.makeText(MainActivity.this, "you click on index 0", Toast.LENGTH_SHORT).show();

                            break;
                        case 1:
                            Toast.makeText(MainActivity.this, "you click on index 1", Toast.LENGTH_SHORT).show();
                            break;

                        case 2:
                            Toast.makeText(MainActivity.this, "you click on index 2", Toast.LENGTH_SHORT).show();
                            break;

                        case 3:
                            Toast.makeText(MainActivity.this, "you click on index 3", Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            Toast.makeText(MainActivity.this, "you click on index 4", Toast.LENGTH_SHORT).show();
                            break;
                        case 5:
                            Toast.makeText(MainActivity.this, "you click on index 5", Toast.LENGTH_SHORT).show();
                            break;



                    }

                }
            });
        }
    }
}
