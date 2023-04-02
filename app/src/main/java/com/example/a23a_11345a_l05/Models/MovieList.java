package com.example.a23a_11345a_l05.Models;

import java.util.ArrayList;

public class MovieList {
    private String name = "";
    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieList() {
    }

    public String getName() {
        return name;
    }

    public MovieList setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public MovieList setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
        return this;
    }

    @Override
    public String toString() {
        return "MovieList{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
