package gp.fall2020.animateexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView dogWalk = findViewById(R.id.dog_walk);
        dogWalk.setBackgroundResource(R.drawable.dog_walk_animate);
        final AnimationDrawable dogWalkAnimation = (AnimationDrawable) dogWalk.getBackground();

        dogWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dogWalkAnimation.isRunning()) {
                    dogWalkAnimation.stop();
                }
                else {
                    dogWalkAnimation.start();
                }
            }
        });
    }
}