package com.kunal.imageview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView hImageViewPic;
    private Button iButton;

    private int currentImage = 0;
    int[] images = { R.drawable.r1, R.drawable.r2, R.drawable.r3, R.drawable.r4, R.drawable.r5 };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hImageViewPic = (ImageView) findViewById(R.id.idImageViewSemafor);
        iButton = (Button) findViewById(R.id.idBtnChangeImage);


        iButton.setOnClickListener(iButtonChangeImageListener);
    }
    View.OnClickListener iButtonChangeImageListener = new OnClickListener() {

        public void onClick(View v) {
            //Increase Counter to move to next Image
            currentImage++;
            currentImage = currentImage % images.length;

            hImageViewPic.setImageResource(images[currentImage]);

        }
    };


}