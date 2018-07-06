package com.umair.iptv.Profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.umair.iptv.DataModel.LiveDataModel;
import com.umair.iptv.R;

import java.util.ArrayList;

public class LiveFragment extends Fragment {
    private RecyclerView recyclerView;

    public static LiveFragment newInstance(){
        Bundle bundle= new Bundle();
        LiveFragment fragment = new LiveFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.livefragment,container,false);
        recyclerView=view.findViewById(R.id.lrecyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        OurAdapter adapter= new OurAdapter();
        recyclerView.setAdapter(adapter);
        return view;
    }
    public class OurAdapter extends RecyclerView.Adapter<OurAdapter.ViewHolder>{
        private final ArrayList<LiveDataModel> data;
        public OurAdapter(ArrayList<LiveDataModel>data){
            this.data=data;
        }
        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.recyclerview,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          LiveDataModel dataModel=data.get(position);
          holder.imageView.setImageResource(dataModel.getImag());
          holder.chanelname.setText(dataModel.getChanelname());
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
        class ViewHolder extends RecyclerView.ViewHolder{
            public ImageView imageView;
            public TextView chanelname;

            public ViewHolder(View itemView) {
                super(itemView);
                imageView=itemView.findViewById(R.id.categriesimage);
                chanelname=itemView.findViewById(R.id.catagirestext);
            }
        }
    }
}
