package com.umair.iptv.Profile;

import android.content.Context;
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

import com.umair.iptv.R;

public class VODFragment extends Fragment {
    private Context context;
    private RecyclerView recyclerView;
    public static VODFragment newInstance(){
        Bundle bundle=new Bundle();
        VODFragment fragment=new VODFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vodfragment,container,false);
        recyclerView=view.findViewById(R.id.vrecylerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        OurAdapter adapter=new OurAdapter();
        recyclerView.setAdapter(adapter);
        return view;
    }
    public class OurAdapter extends RecyclerView.Adapter<OurAdapter.ViewHolder>{
        public DataModel [] data = new DataModel[6];
        public OurAdapter(){
            data[0]=new DataModel(R.drawable.ic_arrow_back_black_24dp,"PTV");
            data[1]=new DataModel(R.drawable.ic_kaaba,"PTvHOME");
            data[2]=new DataModel(R.drawable.ic_arrow_back_black_24dp,"PTV");
            data[3]=new DataModel(R.drawable.ic_arrow_back_black_24dp,"PTV");
            data[4]=new DataModel(R.drawable.ic_kaaba,"PTVSPORT");
            data[5]=new DataModel(R.drawable.ic_kaaba,"PTVSPORT");
        }
        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.recyclerview,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          DataModel item=data[position];
          holder.imageView.setImageResource(item.getImag());
          holder.textView.setText(item.getCategariesname());
        }

        @Override
        public int getItemCount() {
            return data.length;
        }
        class ViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView textView;
            public ViewHolder(View itemView) {
                super(itemView);
                imageView=itemView.findViewById(R.id.categriesimage);
                textView=itemView.findViewById(R.id.catagirestext);
            }
        }
    }
    public class DataModel{
        public int imag;
        public String categariesname;

        public DataModel(int imag, String categariesname) {
            this.imag = imag;
            this.categariesname = categariesname;
        }

        public int getImag() {
            return imag;
        }

        public void setImag(int imag) {
            this.imag = imag;
        }

        public String getCategariesname() {
            return categariesname;
        }

        public void setCategariesname(String categariesname) {
            this.categariesname = categariesname;
        }
    }

}
