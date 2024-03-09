package com.example.fragmentstransactionapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonAddF = findViewById(R.id.addF);
        final FirstFragment firstFragment = new FirstFragment();
        final FragmentManager fragmentManager = getSupportFragmentManager();
        buttonAddF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.root_layout, firstFragment, "FirstFrag");
                fragmentTransaction.commit();
            }
        });
        Button buttonAddS = findViewById(R.id.addS);
        final SecondFragment secondFragment = new SecondFragment();
        final FragmentManager fragmentManager2 = getSupportFragmentManager();
        buttonAddS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager2.beginTransaction();
                fragmentTransaction.add(R.id.root_layout, secondFragment, "SecondFrag");
                fragmentTransaction.commit();
            }
        });
        Button buttonRemoveF = findViewById(R.id.removeF);
        final FragmentManager fragmentManager3 = getSupportFragmentManager();
        buttonRemoveF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager3.beginTransaction();
                fragmentTransaction.remove(firstFragment);
                fragmentTransaction.commit();
            }
        });
        Button buttonRemoveS = findViewById(R.id.removeS);
        final FragmentManager fragmentManager4 = getSupportFragmentManager();
        buttonRemoveS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager4.beginTransaction();
                fragmentTransaction.remove(secondFragment);
                fragmentTransaction.commit();
            }
        });
        Button buttonAttachF = findViewById(R.id.attachF);
        final FragmentManager fragmentManager5 = getSupportFragmentManager();
        buttonAttachF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager5.beginTransaction();
                fragmentTransaction.attach(firstFragment);
                fragmentTransaction.commit();
            }
        });
        
    }
}