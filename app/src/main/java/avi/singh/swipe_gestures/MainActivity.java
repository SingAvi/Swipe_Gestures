package avi.singh.swipe_gestures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

        float x1,y1;
        float x2,y2;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
//for no title bar
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.activity_main);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//link up with XML files


        }

        public boolean onTouchEvent(MotionEvent touchevent)
        {
            switch (touchevent.getAction())
            {
// when user first touches the screen we get x and y coordinate
                case MotionEvent.ACTION_DOWN:
                {
                    x1 = touchevent.getX();
                    y1 = touchevent.getY();
                    break;
                }
                case MotionEvent.ACTION_UP:
                {
                    x2 = touchevent.getX();
                    y2 = touchevent.getY();
//if left to right sweep event on screen
                    if (x1 < x2)
                    {
                        Toast.makeText(this, "Left to Right Swap Performed", Toast.LENGTH_LONG).show();
                        setContentView(R.layout.left_right);
                    }
// if right to left sweep event on screen
                    if (x1 > x2)
                    {
                        Toast.makeText(this, "Right to Left Swap Performed", Toast.LENGTH_LONG).show();
                        setContentView(R.layout.right_left);
                    }
// if top to Down sweep event on screen
                    if (y1 < y2)
                    {Toast.makeText(this, "Top to Down Swap Performed", Toast.LENGTH_LONG).show();
                        setContentView(R.layout.top_down);
//Toast.makeText(this, "top to down Swap Performed", Toast.LENGTH_LONG).show();
                    }
//if Down to UP sweep event on screen
                    if (y1 > y2)
                    {
                        Toast.makeText(this, "Down to Top Swap Performed", Toast.LENGTH_LONG).show();
                        setContentView(R.layout.down_top);
// Toast.makeText(this, "Down to UP Swap Performed", Toast.LENGTH_LONG).show();
                    }
                    break;
                }
            }
            return false;
        }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


    }