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
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import static android.content.ContentValues.TAG;

public class trending_Adapter extends RecyclerView.Adapter< trending_Adapter.MyViewHolder>{

    private List<trendingModel> trendingList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
       ImageView image;
       TextView name;
       RatingBar ratingBar;

        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.coverpic);
            name = (TextView) view.findViewById(R.id.covertitle);
            ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
        }
    }


    public trending_Adapter(List<trendingModel> trendingList) {
        this.trendingList = trendingList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.trending_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        trendingModel trending = trendingList.get(position);
        holder.image.setImageResource(trending.imageId);
        holder.name.setText(trending.getName());



    }

    @Override
    public int getItemCount() {
        Log.i(TAG, "getItemCount: "+String.valueOf(trendingList.size()));
        return trendingList.size();
    }
}
