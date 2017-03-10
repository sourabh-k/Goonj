package com.example.andorid.goonj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        findViewById(R.id.techimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Technical".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.cultimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Cultural".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.theaimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Theatre".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.liteimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Literature".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.funimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Fun".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.sporimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Sports".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.fineimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("FA"), ColorGenerator.MATERIAL.getRandomColor()));
        final CardView cvtech = (CardView) findViewById(R.id.cvtechnical);
        final CardView cvtech2 = (CardView) findViewById(R.id.cvtechnical2);
        cvtech.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvtech.animate().rotationY(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvtech2.setVisibility(View.VISIBLE);
                                cvtech2.setRotationY(-90);
                                cvtech.setVisibility(View.GONE);
                                cvtech2.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });



                    }

                }, 0);
                return true;
            }
        });

        cvtech2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvtech2.animate().rotationY(-90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvtech.setVisibility(View.VISIBLE);
                                cvtech.setRotationY(90);
                                cvtech2.setVisibility(View.GONE);
                                cvtech.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });
                    }

                }, 0);

        }});

        cvtech.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                loadDataToList(1);
            }
        });
        findViewById(R.id.backtech).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvtech2.callOnClick();
            }
        });

        final CardView cvcult = (CardView) findViewById(R.id.cvcultural);
        final CardView cvcult2 = (CardView) findViewById(R.id.cvcultural2);
        cvcult.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvcult.animate().rotationY(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvcult2.setVisibility(View.VISIBLE);
                                cvcult2.setRotationY(-90);
                                cvcult.setVisibility(View.GONE);
                                cvcult2.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });



                    }

                }, 0);
                return true;
            }
        });

        cvcult2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvcult2.animate().rotationY(-90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvcult.setVisibility(View.VISIBLE);
                                cvcult.setRotationY(90);
                                cvcult2.setVisibility(View.GONE);
                                cvcult.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });
                    }

                }, 0);

            }});

        cvcult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                loadDataToList(2);
            }
        });
        findViewById(R.id.backcult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvcult2.callOnClick();
            }
        });


        final CardView cvlite = (CardView) findViewById(R.id.cvliterature);
        final CardView cvlite2 = (CardView) findViewById(R.id.cvliterature2);
        cvlite.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvlite.animate().rotationY(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvlite2.setVisibility(View.VISIBLE);
                                cvlite2.setRotationY(-90);
                                cvlite.setVisibility(View.GONE);
                                cvlite2.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });



                    }

                }, 0);
                return true;
            }
        });

        cvlite2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvlite2.animate().rotationY(-90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvlite.setVisibility(View.VISIBLE);
                                cvlite.setRotationY(90);
                                cvlite2.setVisibility(View.GONE);
                                cvlite.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });
                    }

                }, 0);

            }});

        cvlite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /* loadDataToList(3); */
            }
        });
        findViewById(R.id.backlite).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvlite2.callOnClick();
            }
        });

        final CardView cvthea = (CardView) findViewById(R.id.cvtheatre);
        final CardView cvthea2 = (CardView) findViewById(R.id.cvtheatre2);
        cvthea.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvthea.animate().rotationY(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvthea2.setVisibility(View.VISIBLE);
                                cvthea2.setRotationY(-90);
                                cvthea.setVisibility(View.GONE);
                                cvthea2.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });



                    }

                }, 0);
                return true;
            }
        });

        cvthea2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvthea2.animate().rotationY(-90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvthea.setVisibility(View.VISIBLE);
                                cvthea.setRotationY(90);
                                cvthea2.setVisibility(View.GONE);
                                cvthea.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });
                    }

                }, 0);

            }});

        cvthea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /* loadDataToList(4); */
            }
        });
        findViewById(R.id.backthea).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvthea2.callOnClick();
            }
        });

        final CardView cvfun = (CardView) findViewById(R.id.cvfun);
        final CardView cvfun2 = (CardView) findViewById(R.id.cvfun2);
        cvfun.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvfun.animate().rotationY(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvfun2.setVisibility(View.VISIBLE);
                                cvfun2.setRotationY(-90);
                                cvfun.setVisibility(View.GONE);
                                cvfun2.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });



                    }

                }, 0);
                return true;
            }
        });

        cvfun2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvfun2.animate().rotationY(-90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvfun.setVisibility(View.VISIBLE);
                                cvfun.setRotationY(90);
                                cvfun2.setVisibility(View.GONE);
                                cvfun.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });
                    }

                }, 0);

            }});

        cvfun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /* loadDataToList(5); */
            }
        });
        findViewById(R.id.backfun).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvfun2.callOnClick();
            }
        });
        final CardView cvsports = (CardView) findViewById(R.id.cvsports);
        final CardView cvsports2 = (CardView) findViewById(R.id.cvsports2);
        cvsports.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvsports.animate().rotationY(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvsports2.setVisibility(View.VISIBLE);
                                cvsports2.setRotationY(-90);
                                cvsports.setVisibility(View.GONE);
                                cvsports2.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });



                    }

                }, 0);
                return true;
            }
        });

        cvsports2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvsports2.animate().rotationY(-90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvsports.setVisibility(View.VISIBLE);
                                cvsports.setRotationY(90);
                                cvsports2.setVisibility(View.GONE);
                                cvsports.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });
                    }

                }, 0);

            }});

        cvsports.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /* loadDataToList(6); */
            }
        });
        findViewById(R.id.backsports).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvsports2.callOnClick();
            }
        });
        final CardView cvfinearts = (CardView) findViewById(R.id.cvfinearts);
        final CardView cvfinearts2 = (CardView) findViewById(R.id.cvfinearts2);
        cvfinearts.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvfinearts.animate().rotationY(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvfinearts2.setVisibility(View.VISIBLE);
                                cvfinearts2.setRotationY(-90);
                                cvfinearts.setVisibility(View.GONE);
                                cvfinearts2.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });



                    }

                }, 0);
                return true;
            }
        });

        cvfinearts2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cvfinearts2.animate().rotationY(-90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                cvfinearts.setVisibility(View.VISIBLE);
                                cvfinearts.setRotationY(90);
                                cvfinearts2.setVisibility(View.GONE);
                                cvfinearts.animate().rotationY(0).setDuration(200).setListener(null);
                            }
                        });
                    }

                }, 0);

            }});

        cvfinearts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /* loadDataToList(6); */
            }
        });
        findViewById(R.id.backfinearts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvfinearts2.callOnClick();
            }
        });
    }

            public void loadDataToList(final int eventClass) {
                ListView listView = (ListView) findViewById(R.id.listView);
                ArrayList<Data> data = Utility.getDataForEvents(eventClass);
                final ListAdapter listAdapter = new ListAdapter(this, 0, data);
                listView.setAdapter(listAdapter);
                //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, data);
                //listView.setAdapter(adapter);
                Bundle bd = new Bundle();
                bd.putInt(getResources().getString(R.string.event_class), eventClass);
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                intent.putExtra(getResources().getString(R.string.extra_data), bd);
                startActivity(intent);
                Log.i("SCROLLING DOWN", "TRUE");
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                        Data current_data = listAdapter.getItem(position);
                        Bundle bd = new Bundle();
                        if (current_data != null) {
                            bd.putInt(getResources().getString(R.string.event_class), current_data.getmEventClass());
                            bd.putString(getResources().getString(R.string.event_name), current_data.getmEventName());
                            bd.putString(getResources().getString(R.string.event_date), current_data.getmEventDate());
                            bd.putString(getResources().getString(R.string.event_summary), current_data.getmEventSummary());
                        }
                        Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                        intent.putExtra(getResources().getString(R.string.extra_data), bd);
                        startActivity(intent);
                    }
                });

            }

            @Override
            public void onBackPressed() {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    super.onBackPressed();
                }
            }

            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.main, menu);
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

            @SuppressWarnings("StatementWithEmptyBody")
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.nav_gallery) {
                    // Handle the camera action
                } else if (id == R.id.nav_contacts) {

                } else if (id == R.id.nav_direction) {

                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        }
