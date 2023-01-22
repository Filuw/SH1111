package com.example.coursesmarthouse;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.coursesmarthouse.ui.main.SectionsPagerAdapter;
import com.example.coursesmarthouse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.frame_home1,
            R.drawable.frame_routines,
            R.drawable.frame_statics,
            R.drawable.frame_setting,
    };
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;

        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
    }


    public void startNewActivity(View v) {
        Intent intent=new Intent(MainActivity.this, AddActivity.class);
        startActivity(intent);
    }

    public void startKitchenActivity(View v) {
        Intent intent=new Intent(MainActivity.this, KitchenActivity.class);
        startActivity(intent);
    }


    public void startNewActivityy(View v) {
        Intent intent=new Intent(MainActivity.this, HouseFragment.class);
        startActivity(intent);
    }
}