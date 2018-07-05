package com.umair.iptv.Profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.umair.iptv.R;

public class PremiumFragment extends Fragment {
    public static PremiumFragment newInstance(){
        Bundle bundle=new Bundle();
        PremiumFragment premiumFragment=new PremiumFragment();
        return premiumFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.premiumfragment,container,false);
        return view;

    }
}
