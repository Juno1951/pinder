package com.example.pinder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;

    private ViewPager2 mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout) findViewById(R.id.tab_menu);

        mViewPager = (ViewPager2) findViewById(R.id.pager);

        //프레그먼트 이동 구현
        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(this);
        mViewPager.setAdapter(viewPagerAdapter);

        final List<String> tabElement = Arrays.asList("Main","Shelter","Report","Story");

        //Tablayout 이랑 viewPager 연결
        new TabLayoutMediator(mTabLayout, mViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull @NotNull TabLayout.Tab tab, int position) {
                TextView textView = new TextView(MainActivity.this);
                textView.setText(tabElement.get(position)   );
                tab.setCustomView(textView);

            }
        }).attach();


    }
}