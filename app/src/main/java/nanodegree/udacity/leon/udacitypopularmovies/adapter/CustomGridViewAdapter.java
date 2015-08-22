package nanodegree.udacity.leon.udacitypopularmovies.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import nanodegree.udacity.leon.udacitypopularmovies.model.MovieInfoModel;

public class CustomGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<MovieInfoModel> moviesInfoAsArrayList;

    public CustomGridViewAdapter(Context context, ArrayList<MovieInfoModel> moviesInfoAsArrayList) {
        mContext = context;
        this.moviesInfoAsArrayList = moviesInfoAsArrayList;
    }

    @Override
    public int getCount() {
        return moviesInfoAsArrayList.size();
    }

    @Override
    public MovieInfoModel getItem(int position) {
        return moviesInfoAsArrayList.get(position);
    }

    public String getPosterImageUrl(int position) {
        return getItem(position).getMovieImageUrl();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
        } else {
            imageView = (ImageView) convertView;
        }

        Picasso.with(mContext).load(getPosterImageUrl(position)).resize(1000, 1000).fit().into(imageView);
        return imageView;
    }
}
