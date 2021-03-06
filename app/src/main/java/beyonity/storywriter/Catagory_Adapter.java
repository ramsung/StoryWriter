package beyonity.storywriter;

/**
 * Created by RK on 8/30/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.content.ContentValues.TAG;

public class Catagory_Adapter extends RecyclerView.Adapter< Catagory_Adapter.MyViewHolder>{

    private List<catagoryModel> catagoryList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
       ImageView image;
       TextView name, totalStories;

        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
            totalStories = (TextView) view.findViewById(R.id.totalstories);


        }
    }


    public Catagory_Adapter(List<catagoryModel> catagoryList) {
        this.catagoryList = catagoryList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        catagoryModel catagory = catagoryList.get(position);
        holder.image.setImageResource(catagory.imageId);
        holder.name.setText(catagory.getName());
        holder.totalStories.setText(catagory.getTotalStories());


    }

    @Override
    public int getItemCount() {
        Log.i(TAG, "getItemCount: "+String.valueOf(catagoryList.size()));
        return catagoryList.size();
    }
}
