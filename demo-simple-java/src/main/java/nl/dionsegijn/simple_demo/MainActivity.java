package nl.dionsegijn.simple_demo;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.view.View;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Shape droplet = new Shape.DrawableShape(
                ResourcesCompat.getDrawable(getResources(), R.drawable.droplet, null), false);
        final KonfettiView konfettiView = findViewById(R.id.konfettiView);
        konfettiView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                konfettiView.build()
                        .setDirection(140.0, 200.0)
                        .setSpeed(6f, 8f)
                        .setFadeOutEnabled(true)
                        .setTimeToLive(3000L)
                        .addShapes(droplet)
                        .addSizes(new Size(15, 10))
                        .setPosition(konfettiView.getWidth() - konfettiView.getWidth()*.2f,
                                konfettiView.getWidth() - konfettiView.getWidth()*.2f,
                                100, 120f)
//                        .burst(20);
                        .streamFor(50, 2000L);
            }
        });
    }
}
