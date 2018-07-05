package com.umair.iptv.Profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.umair.iptv.R;

public class LiveFragment extends Fragment {
    public static LiveFragment newInstance(){
        Bundle bundle= new Bundle();
        LiveFragment fragment = new LiveFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.livefragment,container,false);
        return view;
    }
}
