package com.example.sunsom.memoire;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by sunsom on 12/6/17.
 */

public class yourturn2 extends AppCompatActivity {
    ImageButton ib8,ib1,ib2,ib3,ib5,ib6,ib7,ib4,ib9,ib10,ib11,ib12;
    private static int SPLASH_TIME_OUT = 3000;
    TextView t1;
    public int a=0,flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youturn2);
        ib1 = (ImageButton) findViewById(R.id.ib1);
        ib2 = (ImageButton) findViewById(R.id.ib2);
        ib3 = (ImageButton) findViewById(R.id.ib3);
        ib4 = (ImageButton) findViewById(R.id.ib4);
        ib5 = (ImageButton) findViewById(R.id.ib5);
        ib6 = (ImageButton) findViewById(R.id.ib6);
        ib7 = (ImageButton) findViewById(R.id.ib7);
        ib8 = (ImageButton) findViewById(R.id.ib8);
        ib9 = (ImageButton) findViewById(R.id.ib9);
        ib10 = (ImageButton) findViewById(R.id.ib10);
        ib11 = (ImageButton) findViewById(R.id.ib11);
        ib12 = (ImageButton) findViewById(R.id.ib12);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                flag++;
                ib1.setImageResource(R.drawable.sapple);
                View.OnClickListener l1 = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.equals(ib6)) {
                            ib6.setImageResource(R.drawable.sapple);
                            a++;
                        } else {
                            ib6.setImageResource(R.drawable.sques);
                            ib2.setEnabled(false);
                            ib6.setEnabled(false);
                            ib4.setEnabled(false);
                            ib8.setEnabled(false);
                            ib10.setEnabled(false);
                            ib12.setEnabled(false);
                        }
                        if (flag>=6) {
                            new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                                @Override
                                public void run() {
                                    // This method will be executed once the timer is over
                                    // Start your app main activity
                                    Intent i = new Intent(yourturn2.this, score.class);
                                    i.putExtra("a", Integer.toString(a));
                                    startActivity(i);

                                    // close this activity
                                    finish();
                                }
                            }, SPLASH_TIME_OUT);
                        }
                    }
                };
                ib6.setOnClickListener(l1);
                ib2.setOnClickListener(l1);
                ib4.setOnClickListener(l1);
                ib8.setOnClickListener(l1);
                ib10.setOnClickListener(l1);
                ib12.setOnClickListener(l1);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                flag++;
                ib3.setImageResource(R.drawable.bbball);
                ib2.setEnabled(true);
                ib6.setEnabled(true);
                ib4.setEnabled(true);
                ib8.setEnabled(true);
                ib10.setEnabled(true);
                ib12.setEnabled(true);
                View.OnClickListener l2 = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.equals(ib8)) {
                            ib8.setImageResource(R.drawable.bbball);
                            a++;
                        } else {
                            ib8.setImageResource(R.drawable.sques);
                            ib2.setEnabled(false);
                            ib6.setEnabled(false);
                            ib4.setEnabled(false);
                            ib8.setEnabled(false);
                            ib10.setEnabled(false);
                            ib12.setEnabled(false);
                        }
                        if (flag>=6) {
                            new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                                @Override
                                public void run() {
                                    // This method will be executed once the timer is over
                                    // Start your app main activity
                                    Intent i = new Intent(yourturn2.this, score.class);
                                    i.putExtra("a", Integer.toString(a));
                                    startActivity(i);

                                    // close this activity
                                    finish();
                                }
                            }, SPLASH_TIME_OUT);
                        }
                    }
                };
                ib2.setOnClickListener(l2);
                ib6.setOnClickListener(l2);
                ib4.setOnClickListener(l2);
                ib8.setOnClickListener(l2);
                ib10.setOnClickListener(l2);
                ib12.setOnClickListener(l2);

            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                flag++;
                ib5.setImageResource(R.drawable.bee);
                ib2.setEnabled(true);
                ib6.setEnabled(true);
                ib4.setEnabled(true);
                ib8.setEnabled(true);
                ib10.setEnabled(true);
                ib12.setEnabled(true);
                View.OnClickListener l3 = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.equals(ib10)) {
                            ib10.setImageResource(R.drawable.bee);
                            a++;
                        } else {
                            ib2.setImageResource(R.drawable.sques);
                            ib2.setEnabled(false);
                            ib6.setEnabled(false);
                            ib4.setEnabled(false);
                            ib8.setEnabled(false);
                            ib10.setEnabled(false);
                            ib12.setEnabled(false);
                        }
                        if (flag>=6) {
                            new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                                @Override
                                public void run() {
                                    // This method will be executed once the timer is over
                                    // Start your app main activity
                                    Intent i = new Intent(yourturn2.this, score.class);
                                    i.putExtra("a", Integer.toString(a));
                                    startActivity(i);

                                    // close this activity
                                    finish();
                                }
                            }, SPLASH_TIME_OUT);
                        }
                    }
                };
                ib6.setOnClickListener(l3);
                ib2.setOnClickListener(l3);
                ib4.setOnClickListener(l3);
                ib8.setOnClickListener(l3);
                ib10.setOnClickListener(l3);
                ib12.setOnClickListener(l3);

            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                ib7.setImageResource(R.drawable.aball);
                flag++;
                ib2.setEnabled(true);
                ib6.setEnabled(true);
                ib4.setEnabled(true);
                ib8.setEnabled(true);
                ib10.setEnabled(true);
                ib12.setEnabled(true);
                View.OnClickListener l4 = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.equals(ib12)) {
                            ib12.setImageResource(R.drawable.aball);
                            a++;
                        } else {
                            ib6.setImageResource(R.drawable.sques);
                            ib2.setEnabled(false);
                            ib4.setEnabled(false);
                            ib6.setEnabled(false);
                            ib8.setEnabled(false);
                            ib10.setEnabled(false);
                            ib12.setEnabled(false);

                        }
                        if (flag>=6) {
                            new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                                @Override
                                public void run() {
                                    // This method will be executed once the timer is over
                                    // Start your app main activity
                                    Intent i = new Intent(yourturn2.this, score.class);
                                    i.putExtra("a", Integer.toString(a));
                                    startActivity(i);

                                    // close this activity
                                    finish();
                                }
                            }, SPLASH_TIME_OUT);
                        }
                    }
                };
                ib6.setOnClickListener(l4);
                ib2.setOnClickListener(l4);
                ib4.setOnClickListener(l4);
                ib8.setOnClickListener(l4);
                ib10.setOnClickListener(l4);
                ib12.setOnClickListener(l4);

            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                ib9.setImageResource(R.drawable.bfly);
                flag++;
                ib2.setEnabled(true);
                ib6.setEnabled(true);
                ib4.setEnabled(true);
                ib8.setEnabled(true);
                ib10.setEnabled(true);
                ib12.setEnabled(true);
                View.OnClickListener l4 = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.equals(ib4)) {
                            ib4.setImageResource(R.drawable.bfly);
                            a++;
                        } else {
                            ib4.setImageResource(R.drawable.sques);
                            ib2.setEnabled(false);
                            ib4.setEnabled(false);
                            ib6.setEnabled(false);
                            ib8.setEnabled(false);
                            ib10.setEnabled(false);
                            ib12.setEnabled(false);

                        }
                        if (flag>=6) {
                            new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                                @Override
                                public void run() {
                                    // This method will be executed once the timer is over
                                    // Start your app main activity
                                    Intent i = new Intent(yourturn2.this, score.class);
                                    i.putExtra("a", Integer.toString(a));
                                    startActivity(i);

                                    // close this activity
                                    finish();
                                }
                            }, SPLASH_TIME_OUT);
                        }
                    }
                };
                ib6.setOnClickListener(l4);
                ib2.setOnClickListener(l4);
                ib4.setOnClickListener(l4);
                ib8.setOnClickListener(l4);
                ib10.setOnClickListener(l4);
                ib12.setOnClickListener(l4);

            }
        });
        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v6) {
                ib11.setImageResource(R.drawable.teddy);
                flag++;
                ib2.setEnabled(true);
                ib6.setEnabled(true);
                ib4.setEnabled(true);
                ib8.setEnabled(true);
                ib10.setEnabled(true);
                ib12.setEnabled(true);
                View.OnClickListener l4 = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.equals(ib2)) {
                            ib2.setImageResource(R.drawable.teddy);
                            a++;
                        } else {
                            ib2.setImageResource(R.drawable.sques);
                            ib2.setEnabled(false);
                            ib4.setEnabled(false);
                            ib6.setEnabled(false);
                            ib8.setEnabled(false);
                            ib10.setEnabled(false);
                            ib12.setEnabled(false);

                        }
                        if (flag>=6) {
                            new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                                @Override
                                public void run() {
                                    // This method will be executed once the timer is over
                                    // Start your app main activity
                                    Intent i = new Intent(yourturn2.this, score.class);
                                    i.putExtra("a", Integer.toString(a));
                                    startActivity(i);

                                    // close this activity
                                    finish();
                                }
                            }, SPLASH_TIME_OUT);
                        }
                    }
                };
                ib6.setOnClickListener(l4);
                ib2.setOnClickListener(l4);
                ib4.setOnClickListener(l4);
                ib8.setOnClickListener(l4);
                ib10.setOnClickListener(l4);
                ib12.setOnClickListener(l4);

            }
        });
    }
}
