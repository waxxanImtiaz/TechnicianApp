package com.example.eureka.technicianapp;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.eureka.technicianapp.adapter.ViewPagerAdapter;
import com.example.eureka.technicianapp.customclasses.CustomViewPager;

import java.io.File;
import java.util.concurrent.Future;

public class MainActivity extends AppCompatActivity{

    private TabLayout tabLayout;
    private CustomViewPager viewPager;

    private File sharedPrefFile;

    private final int LOGIN_ACIVITY_VALIDATOR = 22;
    private final int SIGN_UP_FLAG = 23;
    private int index;

    private final int WISH_LIST = 122;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SharedPreferencesDataLoader.setGuestId(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //INITIALIZING TABS
        viewPager = (CustomViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                index = tab.getPosition();
                switch (index) {
                    case 1:

                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        setupTabIcons();

    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        menu.clear();

        MenuInflater myMenuInflater = getMenuInflater();


        return true;
    }



    private void setupTabIcons() {
//        tabLayout.getTabAt(0).setIcon(R.drawable.home);
//        tabLayout.getTabAt(1).setIcon(R.drawable.heart);
//        tabLayout.getTabAt(2).setIcon(R.drawable.cart);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new ProductsFragment(), "One");
//        adapter.addFragment(new WishList(), "Two");
//        adapter.addFragment(new Cart(), "Three");
        viewPager.setAdapter(adapter);
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



        return super.onOptionsItemSelected(item);
    }

}