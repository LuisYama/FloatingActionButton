package com.example.floatingactionbutton;

import android.animation.Animator;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class MainActivity extends AppCompatActivity {

    boolean click=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*
        //FAB sencillo con rompimiento de bordes
        FloatingActionButton fab = findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Se presionó el FAB", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
           */

        /*
        //FAB con animación de escala
        final FloatingActionButton fab= (FloatingActionButton) findViewById(R.id.fab2);
        fab.setScaleX(0);
        fab.setScaleY(0);

        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP){
            final Interpolator interpolador = AnimationUtils.loadInterpolator(getBaseContext(),android.R.interpolator.fast_out_slow_in);

        fab.animate().scaleX(1).scaleY(1).setInterpolator(interpolador).setDuration(600).setStartDelay(1000).setListener(new Animator.AnimatorListener(){

                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        fab.animate().scaleY(0).scaleX(0).setInterpolator(interpolador).setDuration(600).start();


                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
        }
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Se presionó el FAB",Snackbar.LENGTH_LONG).show();
            }
        });
        */


        /*
        //FAB con rotación al presionar
        FloatingActionButton fab=(FloatingActionButton) findViewById(R.id.fab2);
        fab.setImageResource(android.R.drawable.ic_input_add);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click=!click;
                if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP){
                    Interpolator interpolador=AnimationUtils.loadInterpolator(getBaseContext(),android.R.interpolator.fast_out_slow_in);

                    v.animate().rotation(click ? 45f:0).setInterpolator(interpolador).start();

                }
            }
        });
        */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
