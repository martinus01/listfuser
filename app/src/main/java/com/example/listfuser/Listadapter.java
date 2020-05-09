package com.example.listfuser;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Listadapter extends RecyclerView.Adapter<Listadapter.ViewHolder> {
    private List<Launch> values;


    class ViewHolder extends RecyclerView.ViewHolder{

    TextView txtMission;
    TextView txtFusee;
    TextView txtAgencies;
    View layout;

    ViewHolder(View v){
        super(v);
        layout=v;
        txtMission=(TextView) v.findViewById(R.id.titre_mission);
        txtFusee=(TextView) v.findViewById(R.id.titre_fusee);
        txtAgencies=(TextView) v.findViewById(R.id.titre_agency);


    }
}

    public void add(int position,Launch item){
        values.add(position, item);
        notifyItemInserted(position);
}
    /*public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }*/

    // Provide a suitable constructor (depends on the kind of dataset)
    public Listadapter(List<Launch> myDataset) {
        values = myDataset;
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
        holder.txtMission.setText(currentLaunch.getName());
        holder.txtFusee.setText(currentLaunch.getWindowstart());
        holder.txtAgencies.setText(currentLaunch.getWindowend());


        holder.txtMission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //remove(position);


            }
        });


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }


}