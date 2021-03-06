package nanodegree.udacity.leon.udacitypopularmovies.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Leon on 9/8/2015.
 */
public class MediumMovieInfoModel implements Parcelable {

    private long movieId;
    private String movieOriginalTitle;
    private String movieImageUrl;
    private String moviePlotSynopsis;
    private float movieUserRating;
    private String movieReleaseDate;
    private double moviePopularity;

    public MediumMovieInfoModel(long movieId, String movieOriginalTitle, String movieImageUrl,
                                String moviePlotSynopsis, float movieUserRating, String movieReleaseDate, double moviePopularity) {
        this.movieId = movieId;
        this.movieOriginalTitle = movieOriginalTitle;
        this.movieImageUrl = movieImageUrl;
        this.moviePlotSynopsis = moviePlotSynopsis;
        this.movieUserRating = movieUserRating;
        this.movieReleaseDate = movieReleaseDate;
        this.moviePopularity = moviePopularity;
    }

    protected MediumMovieInfoModel(Parcel in) {
        movieId = in.readLong();
        movieOriginalTitle = in.readString();
        movieImageUrl = in.readString();
        moviePlotSynopsis = in.readString();
        movieUserRating = in.readFloat();
        movieReleaseDate = in.readString();
        moviePopularity = in.readDouble();
    }

    public static final Creator<MediumMovieInfoModel> CREATOR = new Creator<MediumMovieInfoModel>() {
        @Override
        public MediumMovieInfoModel createFromParcel(Parcel in) {
            return new MediumMovieInfoModel(in);
        }

        @Override
        public MediumMovieInfoModel[] newArray(int size) {
            return new MediumMovieInfoModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(movieId);
        dest.writeString(movieOriginalTitle);
        dest.writeString(movieImageUrl);
        dest.writeString(moviePlotSynopsis);
        dest.writeFloat(movieUserRating);
        dest.writeString(movieReleaseDate);
        dest.writeDouble(moviePopularity);
    }

    public long getMovieId() {
        return movieId;
    }

    public String getMovieOriginalTitle() {
        return movieOriginalTitle;
    }

    public String getMovieImageUrl() {
        return movieImageUrl;
    }

    public String getMoviePlotSynopsis() {
        return moviePlotSynopsis;
    }

    public float getMovieUserRating() {
        return movieUserRating;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public double getMoviePopularity() {
        return moviePopularity;
    }

    public static Creator<MediumMovieInfoModel> getCREATOR() {
        return CREATOR;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public void setMovieOriginalTitle(String movieOriginalTitle) {
        this.movieOriginalTitle = movieOriginalTitle;
    }

    public void setMovieImageUrl(String movieImageUrl) {
        this.movieImageUrl = movieImageUrl;
    }

    public void setMoviePlotSynopsis(String moviePlotSynopsis) {
        this.moviePlotSynopsis = moviePlotSynopsis;
    }

    public void setMovieUserRating(float movieUserRating) {
        this.movieUserRating = movieUserRating;
    }

    public void setMovieReleaseDate(String movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public void setMoviePopularity(double moviePopularity) {
        this.moviePopularity = moviePopularity;
    }
}
