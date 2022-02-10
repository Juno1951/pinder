package com.example.pinder;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private int mpageCount = 5;

    public ViewPagerAdapter(AppCompatActivity fm){
        super(fm);
        //this.mpageCount = pageCount;
    }


    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
            TabFragment_main tabFragment_main = new TabFragment_main();
            return tabFragment_main;

            case 1:
            TabFragment_shelter tabFragment_shelter = new TabFragment_shelter();
            return tabFragment_shelter;

            case 2:
            TabFragment_report tabFragment_report = new TabFragment_report();
            return tabFragment_report;

            case 3:
            TabFragment_story tabFragment_story = new TabFragment_story();
            return tabFragment_story;

            default:
                return null;
        }
    }

    @Override
    public long getItemId(int position){
        return super.getItemId(position);
    }

    @Override
    public int getItemCount(){
        return mpageCount;
    }
}
