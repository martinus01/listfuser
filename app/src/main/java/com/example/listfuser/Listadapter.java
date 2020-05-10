package com.example.listfuser;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Listadapter extends RecyclerView.Adapter<Listadapter.ViewHolder> {
    private String context;
    private List<Launch> values;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(Launch item);


    }
    class ViewHolder extends RecyclerView.ViewHolder{

    TextView txtmission;
    TextView txtfusee;
    TextView txtagencies;
    ImageView imageView;
    View layout;

    ViewHolder(View v){
        super(v);
        layout=v;

        txtmission=(TextView) v.findViewById(R.id.titre_mission);
        txtfusee=(TextView) v.findViewById(R.id.titre_fusee);
        txtagencies=(TextView)v.findViewById(R.id.titre_agency);
        /*ImageView fuseeimage=v.findViewById(R.id.fusee_image);
        Picasso.with(this).load(fuseeimage).into(fuseeimage);*/

    }
}

    public void add(int position,Launch item){
        values.add(position, item);
        notifyItemInserted(position);
}
    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }
    // Provide a suitable constructor (depends on the kind of dataset)
    public Listadapter(List<Launch> myDataset, OnItemClickListener listener) {
        this.values = myDataset;
     //   this.context = context;
        this.listener=listener;
    }

// Create new views (invoked by the layout manager)
@Override
public Listadapter.ViewHolder onCreateViewHolder(
        ViewGroup parent,
        int viewType) {
    // create a new view
    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
    View v = inflater.inflate(R.layout.section, parent, false);
    // set the view's size, margins, paddings and layout parameters
    ViewHolder vh = new ViewHolder(v);
    return vh;
}

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final Launch currentLaunch = values.get(position);
        holder.txtmission.setText(currentLaunch.getMission());
        holder.txtfusee.setText(currentLaunch.getWindowstart());
        holder.txtagencies.setText(currentLaunch.getPadagencies());
        //Picasso.with(this).load(values.get(position).getFuseeimage()).into(imageView);



        holder.txtmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*remove(position);*/
                listener.onItemClick(currentLaunch);
            }
        });

       /* holder.txtmission.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                listener.onItemClick(currentLaunch);
            }
        });*/
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}