package dev.rezaur.kidsafariapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        DefaultFragment defaultFragment = new DefaultFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftr = fm.beginTransaction();
        ftr.replace(R.id.frame, defaultFragment);
        ftr.commit();
    }

    public void lion(View view) {
        LionFragment lion = new LionFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftr = fm.beginTransaction();
        ftr.replace(R.id.frame, lion);
        ftr.commit();
    }

    public void monkey(View view) {
        MonkeyFragment monkey = new MonkeyFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftr = fm.beginTransaction();
        ftr.replace(R.id.frame, monkey);
        ftr.commit();
    }

    public void horse(View view) {
        HorseFragment horse = new HorseFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftr = fm.beginTransaction();
        ftr.replace(R.id.frame, horse);
        ftr.commit();
    }

    public void bird(View view) {
        BirdFragment bird = new BirdFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftr = fm.beginTransaction();
        ftr.replace(R.id.frame, bird);
        ftr.commit();
    }

    public void tiger(View view) {
        TigerFragment tiger = new TigerFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftr = fm.beginTransaction();
        ftr.replace(R.id.frame, tiger);
        ftr.commit();
    }

    public void giraffe(View view) {
        GiraffeFragment giraffe = new GiraffeFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftr = fm.beginTransaction();
        ftr.replace(R.id.frame, giraffe);
        ftr.commit();
    }

    public void rhino(View view) {
        RhinoFragment rhino = new RhinoFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftr = fm.beginTransaction();
        ftr.replace(R.id.frame, rhino);
        ftr.commit();
    }

    public void about(View view) {
        Intent intent = new Intent(this, AboutPage.class);
        startActivity(intent);
    }
}