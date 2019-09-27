package com.example.recyclerviewactivity1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewactivity1.Model.Mahasiswa;

import java.util.ArrayList;

public class RecViewAdapter  extends RecyclerView.Adapter<RecViewAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs,
                parent, false);
        return new ViewHolder(view);
    }


    private ArrayList<Mahasiswa> dataList;

    public RecViewAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNamaMhs.setText(dataList.get(position).getNama());
        holder.txtNpMhs.setText(dataList.get(position).getNpm());
        holder.txtNhpMhs.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNamaMhs, txtNpMhs, txtNhpMhs;
        public  ViewHolder (@NonNull View itemView){
            super(itemView);
            txtNamaMhs = itemView.findViewById(R.id.txtNamaMhs);
            txtNhpMhs = itemView.findViewById(R.id.txtNhpMhs);
            txtNpMhs = itemView.findViewById(R.id.txtNpMhs);
        }
    }
}

