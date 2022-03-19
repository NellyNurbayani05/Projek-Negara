package com.example.project;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class SemuaNegaraAdapter extends RecyclerView.Adapter<SemuaNegaraAdapter.SemuaNegaraHolder>{
    Activity activity;
    List<Negaraaa> listNegaranya;

    public SemuaNegaraAdapter(Activity activity, List<Negaraaa> listNegaranya) {
        this.activity = activity;
        this.listNegaranya = listNegaranya;
    }

    @NonNull
    @Override
    public SemuaNegaraHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.negara_item,parent,false);
        return new SemuaNegaraHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SemuaNegaraHolder holder, int position) {
        holder.txtNamaNegara.setText(listNegaranya.get(position).getName().getCommon());
        holder.txtNamaBenua.setText(listNegaranya.get(position).getRegion());
        Picasso.with(activity).load(listNegaranya.get(position).getFlags().getPng()).into(holder.imgBendera);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kirim = new Intent(activity,AreaActivity.class);
                kirim.putExtra("neg",listNegaranya.get(position));
                view.getContext().startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listNegaranya.size();
    }

    static class SemuaNegaraHolder extends RecyclerView.ViewHolder{
        ImageView imgBendera;
        TextView txtNamaNegara,txtNamaBenua;
        public SemuaNegaraHolder(@NonNull View itemView) {
            super(itemView);
            imgBendera=(ImageView) itemView.findViewById(R.id.img_bendera);
            txtNamaNegara=(TextView) itemView.findViewById(R.id.txt_nama_negara);
            txtNamaBenua=(TextView) itemView.findViewById(R.id.txt_region);
        }
    }
}
