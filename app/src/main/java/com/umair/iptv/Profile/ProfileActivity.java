package com.umair.iptv.Profile;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.umair.iptv.R;

public class ProfileActivity extends AppCompatActivity {
private ViewPager viewPager;
private TabLayout tabLayout;
private Toolbar toolbar;
private Context context;
         public static ProfileActivity newInstance(){
             Bundle bundle=new Bundle();
             ProfileActivity activity= new ProfileActivity();
             return activity;
         }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        this.context=this;
      viewPager=findViewById(R.id.pvpager);
      tabLayout=findViewById(R.id.ptablayout);
      tabLayout.setupWithViewPager(viewPager);
      toolbar=findViewById(R.id.ptoolbar);
      toolbar.setTitle(R.string.app_name);
      PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager());
      viewPager.setAdapter(pagerAdapter);
      
    }
    private class PagerAdapter extends FragmentPagerAdapter {
        private String[]titalbar={"Premium","VOD","Live"};
        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return PremiumFragment.newInstance();

                case 1:
                    return VODFragment.newInstance();

                case 2:
                    return LiveFragment.newInstance();

                default:
                    return null;}
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titalbar[position];
        }
    }
}
