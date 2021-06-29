package com.android.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PublisherGetter {

    private Publisher publisher = new Publisher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment_1 fragment_1 = new Fragment_1();
        Fragment_2 fragment_2 = new Fragment_2();
        MainFragment mainFragment = new MainFragment;

        ////////Observer
        publisher.subscribe((Observer) fragment_2);
        publisher.subscribe((Observer) fragment_3);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.add(R.id.fragment_main, fragment_main);
        fragmentTransaction.add(R.id.fragment_1, fragment_1);
        fragmentTransaction.add(R.id.fragment_2, fragment_2);

    }
}