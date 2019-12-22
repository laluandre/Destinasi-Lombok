package com.example.tempatwisatadilombok;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;
import java.util.List;

public class ListDestinasiAdapter extends RecyclerView.Adapter<ListDestinasiAdapter.ListViewHolder> implements View.OnClickListener{
    private ArrayList<Destinasi> listdestinasi;
    public ListDestinasiAdapter(ArrayList<Destinasi> list){
        this.listdestinasi = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.destination_list, viewGroup, false);
        ListViewHolder VH = new ListViewHolder(view);
        return VH;
    }


    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Destinasi destinasi = listdestinasi.get(position);
        Glide.with(holder.itemView.getContext())
                .load(destinasi.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(destinasi.getNama());
        holder.tvLokasi.setText(destinasi.getLokasi());
        holder.tvDeskripsi.setText(destinasi.getDeskripsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listdestinasi.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
    return listdestinasi.size();
    }

    @Override
    public void onClick(View v) {

    }

    class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDeskripsi, tvLokasi;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvLokasi = itemView.findViewById(R.id.tv_item_lokasi);
            tvDeskripsi = itemView.findViewById(R.id.tv_item_deskripsi);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Destinasi data);
    }


}
