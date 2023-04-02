package com.example.a23a_11345a_l05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.a23a_11345a_l05.Models.Movie;
import com.example.a23a_11345a_l05.Models.MovieList;
import com.example.a23a_11345a_l05.Utilities.MySP1;
import com.example.a23a_11345a_l05.Utilities.MySP2;
import com.example.a23a_11345a_l05.Utilities.MySP3;
import com.example.a23a_11345a_l05.Utilities.SignalGenerator;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MovieList movieList = new MovieList();
        movieList.setName("Top 10");

        movieList.getMovies().add(new Movie()
                .setTitle("The Godfather")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3bhkrj58Vtu7enYsRolD1fZdja1.jpg")
                .setDuration(175)
                .setFavorite(false)
                .setYear(1972)
                .setRating(87.0f)
                .setReviews(24));

        movieList.getMovies().add(new Movie()
                .setTitle("The Shawshank Redemption")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hBcY0fE9pfXzvVaY4GKarweriG2.jpg")
                .setDuration(142)
                .setFavorite(false)
                .setYear(1994)
                .setRating(87.0f)
                .setReviews(16));

        String movieListJson = new Gson().toJson(movieList);
        Log.d("JSON", movieListJson);

//        String json = "{\"movies\":[{\"duration\":175,\"image\":\"https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3bhkrj58Vtu7enYsRolD1fZdja1.jpg\",\"isFavorite\":false,\"rating\":87.0,\"reviews\":24,\"title\":\"The Godfather\",\"year\":1972},{\"duration\":142,\"image\":\"https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hBcY0fE9pfXzvVaY4GKarweriG2.jpg\",\"isFavorite\":false,\"rating\":87.0,\"reviews\":16,\"title\":\"The Shawshank Redemption\",\"year\":1994}],\"name\":\"Top 10\"}";
//        MovieList fromJsonMovieList = new Gson().fromJson(json, MovieList.class);
//        Log.d("From JSON", fromJsonMovieList.toString());

//        MySP1.putString(this, "23A-11345A-L05", json);
//        String fromSP = MySP1.getString(this,"23A-11345A-L05","");
//        Log.d("FromSP: ", fromSP);
//
//        MySP2 mySP2 = new MySP2(this);
//        mySP2.putString("23B-11345A-L05","23B-11345A-L05");
//
//        String read = mySP2.getString("23B-11345A-L05","");
//        Log.d("read:", read);

        MySP3.getInstance().putString("23B-11345A-L05", movieListJson);
        String fromSP =  MySP3.getInstance().getString("23B-11345A-L05","");
        MovieList movielistFromJson = new Gson().fromJson(fromSP,MovieList.class );
        Log.d("From JSON", movielistFromJson.toString());


    }
}