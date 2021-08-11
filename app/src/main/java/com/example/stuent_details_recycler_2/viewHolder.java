package com.example.stuent_details_recycler_2;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class viewHolder extends RecyclerView.ViewHolder {
    private clickListener clickListener;
    private TextView tvName,tvID,tvAddress,tvDOB;
    private RelativeLayout relativeLayout;
    public viewHolder(@NonNull View itemView,clickListener clickListener) {
        super(itemView);
        this.clickListener = clickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        tvName = itemView.findViewById(R.id.tvName);
        tvID = itemView.findViewById(R.id.tvID);
        tvDOB = itemView.findViewById(R.id.tvDob);
        relativeLayout = itemView.findViewById(R.id.realativeLayout);
        tvAddress = itemView.findViewById(R.id.tvAddress);
    }

    public void setData(Model model){
        tvName.setText(model.getName());
        tvID.setText(model.getId());
        tvDOB.setText(model.getDob());
        tvAddress.setText(model.getAddress());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClick(model,getAdapterPosition());
            }
        });
    }
}
