package com.example.abhishek.phone_id;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mamadhaxor on 22/01/15.
 */
public class recycleViewAdapter extends RecyclerView.Adapter<recycleViewAdapter.ViewHolder>
{
    private ItemsModelList data;
    recycleViewAdapter(ItemsModelList data)
    {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_row, viewGroup, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        ItemsModel itemsModel = data.getItem(i);
        viewHolder.p_name.setText(itemsModel.getP_name());
        viewHolder.q_text.setText(itemsModel.getQ_text());
//        Bitmap bitmap = BitmapFactory.decodeResource(viewHolder.view.getResources(), itemsModel.getP_photo());
//        viewHolder.p_photo.setImageBitmap(bitmap);
//        Bitmap bitmap1 = BitmapFactory.decodeResource(viewHolder.view.getResources(), itemsModel.getQ_image());
//        viewHolder.q_image.setImageBitmap(bitmap1);
//        Bitmap bitmap2 = BitmapFactory.decodeResource(viewHolder.view.getResources(), itemsModel.getFollow_image());
//        viewHolder.follow_image.setImageBitmap(bitmap2);
        }

    @Override
    public int getItemCount() {
        return data.getItemCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView p_name;
        public ImageView p_photo;
        public ImageView follow_image;
        public ImageView q_image;
        public TextView q_text;

        public View view;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
//            p_photo=(ImageView)view.findViewById(R.id.p_photo);
//            follow_image=(ImageView)view.findViewById(R.id.follow_image);
//            q_image=(ImageView)view.findViewById(R.id.q_image);
            p_name=(TextView)view.findViewById(R.id.p_name);
            q_text = (TextView)view.findViewById(R.id.q_text);

        }
    }
}
