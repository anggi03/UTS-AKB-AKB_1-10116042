package com.akb.ANGGI.myapplication.friendlistActivity;
/*Tanggal Pengerjaan : 19 Mei 2019
 * NIM : 10116042
 * Nama : ANGGI
 * Kelas : AKB-1*/

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.akb.ANGGI.myapplication.R;

public class FriendRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private TextView FriendTitleText = null;

    private ImageView FriendImageView = null;

    public FriendRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            FriendTitleText = (TextView)itemView.findViewById(R.id.card_view_image_title);

            FriendImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }

    public TextView getFriendTitleText() {
        return FriendTitleText;
    }

    public ImageView getFriendImageView() {
        return FriendImageView;
    }
}

