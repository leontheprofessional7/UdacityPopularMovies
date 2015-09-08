package nanodegree.udacity.leon.udacitypopularmovies.model;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class CompleteMovieInfoModel implements Parcelable {

    // Movie info
    private long movieId;
    private String movieOriginalTitle;
    private String movieImageUrl;
    private String moviePlotSynopsis;
    private String movieUserRating;
    private String movieReleaseDate;
    private ArrayList<String> movieTrailerUrlArrayList = null;
    private ArrayList<MovieReviewModel> movieReviewArrayList = new ArrayList<>();

    public CompleteMovieInfoModel() {
    }

    public CompleteMovieInfoModel(Long movieId, String movieOriginalTitle, String movieImageUrl, String moviePlotSynopsis, String movieUserRating, String movieReleaseDate, ArrayList<String> movieTrailerUrlArrayList, ArrayList<MovieReviewModel> movieReviewArrayList) {
        this.movieId = movieId;
        this.movieOriginalTitle = movieOriginalTitle;
        this.movieImageUrl = movieImageUrl;
        this.moviePlotSynopsis = moviePlotSynopsis;
        this.movieUserRating = movieUserRating;
        this.movieReleaseDate = movieReleaseDate;
        this.movieTrailerUrlArrayList = movieTrailerUrlArrayList;
        this.movieReviewArrayList = movieReviewArrayList;
    }

    public void setMovieTrailerUrlArrayList(ArrayList<String> movieTrailerUrlArrayList) {
        this.movieTrailerUrlArrayList = movieTrailerUrlArrayList;
    }

    public void setMovieId(Long movieId) {
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

    public void setMovieUserRating(String movieUserRating) {
        this.movieUserRating = movieUserRating;
    }

    public void setMovieReleaseDate(String movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public void setMovieReviewArrayList(ArrayList<MovieReviewModel> movieReviewArrayList) {
        this.movieReviewArrayList = movieReviewArrayList;
    }

    public ArrayList<MovieReviewModel> getMovieReviewArrayList() {
        return movieReviewArrayList;
    }

    public ArrayList<String> getMovieTrailerUrlArrayList() {
        return movieTrailerUrlArrayList;
    }

    public Long getMovieId() {
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

    public String getMovieUserRating() {
        return movieUserRating;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    protected CompleteMovieInfoModel(Parcel in) {
        movieId = in.readLong();
        movieOriginalTitle = in.readString();
        movieImageUrl = in.readString();
        moviePlotSynopsis = in.readString();
        movieUserRating = in.readString();
        movieReleaseDate = in.readString();
        movieTrailerUrlArrayList = in.createStringArrayList();
        in.readTypedList(movieReviewArrayList, MovieReviewModel.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(movieId);
        dest.writeString(movieOriginalTitle);
        dest.writeString(movieImageUrl);
        dest.writeString(moviePlotSynopsis);
        dest.writeString(movieUserRating);
        dest.writeString(movieReleaseDate);
        dest.writeStringList(movieTrailerUrlArrayList);
        dest.writeTypedList(movieReviewArrayList);
    }

    public static final Creator<CompleteMovieInfoModel> CREATOR = new Creator<CompleteMovieInfoModel>() {
        @Override
        public CompleteMovieInfoModel createFromParcel(Parcel in) {
            return new CompleteMovieInfoModel(in);
        }

        @Override
        public CompleteMovieInfoModel[] newArray(int size) {
            return new CompleteMovieInfoModel[size];
        }
    };
}