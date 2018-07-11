package skylark.intern.demon.mycvmaker.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import skylark.intern.demon.mycvmaker.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CVview> {

    Context mContent;
    List<String> cvs;
    int key;

    public RecyclerAdapter(Context mContent, List<String> cvs,int key) {
        this.mContent = mContent;
        this.cvs = cvs;
        this.key=key;
    }

    @Override
    public CVview onCreateViewHolder(ViewGroup parent, int viewType) {
        //loading view into java
        View view = LayoutInflater.from(mContent).inflate(R.layout.item, null);
        //return CV view into recyclerview
        return new CVview(view);
    }

    @Override
    public void onBindViewHolder(CVview holder, final int position) {
        //insert title into nameview
        holder.name.setText(cvs.get(position));

    }

    @Override
    public int getItemCount() {
        //return array size
        return cvs.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class CVview extends RecyclerView.ViewHolder {
        TextView name;
        ImageView share,delete,view;

        public CVview(View itemView) {
            super(itemView);

            name =  itemView.findViewById(R.id.cvname);
            share = itemView.findViewById(R.id.share);
            delete = itemView.findViewById(R.id.delete);
            view = itemView.findViewById(R.id.view);
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    
                }
            });
        }
    }

}