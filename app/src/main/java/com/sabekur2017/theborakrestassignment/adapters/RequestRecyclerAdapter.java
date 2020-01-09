package com.sabekur2017.theborakrestassignment.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sabekur2017.theborakrestassignment.R;
import com.sabekur2017.theborakrestassignment.models.TvChannelModel;

import java.util.List;

public class RequestRecyclerAdapter extends RecyclerView.Adapter<RequestRecyclerAdapter.RquesViewHolder> {
    private Context context;
    private List<TvChannelModel.Request> requests;

    public RequestRecyclerAdapter(Context context, List<TvChannelModel.Request> requests) {
        this.context = context;
        this.requests = requests;
    }

    @NonNull
    @Override
    public RquesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.request_single_row,parent,false);
        return new RquesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RquesViewHolder holder, int position) {
        holder.requestNameTV.setText(requests.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return requests.size();
    }

    public class RquesViewHolder extends RecyclerView.ViewHolder{
        TextView requestNameTV;

        public RquesViewHolder(@NonNull View itemView) {
            super(itemView);
            requestNameTV=itemView.findViewById(R.id.request_name_tv);
        }
    }
}
