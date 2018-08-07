package com.hoctienganh.demo2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterListMonAn extends RecyclerView.Adapter<AdapterListMonAn.ViewHolder>{
    private List<ListBuaSang> listBuaSangs;
    private Context context;

    public AdapterListMonAn(List<ListBuaSang> listBuaSangs, Context context) {
        this.listBuaSangs = listBuaSangs;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buasang_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListBuaSang list = listBuaSangs.get(position);
        holder.txtMonAn.setText(list.getMonAn());
        holder.txtKcal.setText(list.getKcal());
    }

    @Override
    public int getItemCount() {
        return listBuaSangs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtMonAn, txtKcal;
        public ViewHolder(View itemView) {
            super(itemView);
            txtMonAn = itemView.findViewById(R.id.txtMonAn);
            txtKcal = itemView.findViewById(R.id.txtKcal);
        }
    }
}
