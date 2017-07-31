package com.example.admin.durban_tour_guild_app;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Admin on 7/28/2017.
 */

public class DurbanAdapter extends ArrayAdapter<Durban> {
    public DurbanAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Durban> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.durban_items,parent,false);

        }

        ImageView photoImageView = listItemView.findViewById(R.id.image_view);
        TextView headTextView = listItemView.findViewById(R.id.head_view);

        TextView decriptionView = listItemView.findViewById(R.id.decr_view);
        Durban durban = getItem(position);
        boolean isPhoto = durban.getPhoteUrl()!=null;

        if (isPhoto)
        {
            Glide.with(photoImageView.getContext())
                    .load(durban.getPhoteUrl())
                    .into(photoImageView);
            headTextView.setText(durban.getHead());
            decriptionView.setText(durban.getDescription());
        }
        else {
            photoImageView.setVisibility(View.GONE);
            headTextView.setText(durban.getHead());
            decriptionView.setText(durban.getDescription());
        }

        return listItemView;
    }

}
