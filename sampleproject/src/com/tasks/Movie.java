package com.tasks;
import java.time.LocalDate;
public class Movie {
	static String theatreName="Inox", theatreLoaction="Kukatpally";
	String movieName;
	long movieBudget;
	LocalDate MovieReleaseDate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1 = new Movie();
		m1.movieName="Panja";
		m1.movieBudget=330000000L;
		m1.MovieReleaseDate=LocalDate.of(2011, 12, 9);
		System.out.println(m1.movieName+" Details:");
		System.out.println("Theatre_Name: "+theatreName+", Theatre_LOcation: "+theatreLoaction+", Movie_Name: "+m1.movieName+", Movie_budget: "+m1.movieBudget+", movie_Release_Date: "+m1.MovieReleaseDate);
		Movie m2 = new Movie();
		m2.movieName="Gabbar Singh";
		m2.movieBudget=300000000L;
		m2.MovieReleaseDate=LocalDate.of(2012, 5, 11);
		System.out.println(m2.movieName+" Details:");
		System.out.println("Theatre_Name: "+theatreName+", Theatre_LOcation: "+theatreLoaction+", Movie_Name: "+m2.movieName+", Movie_budget: "+m2.movieBudget+", movie_Release_Date: "+m2.MovieReleaseDate);
		Movie m3 = new Movie();
		m3.movieName="Thammudu";
		m3.movieBudget=130000000L;
		m3.MovieReleaseDate=LocalDate.of(1999, 7, 15);
		System.out.println(m3.movieName+" Details:");
		System.out.println("Theatre_Name: "+theatreName+", Theatre_LOcation: "+theatreLoaction+", Movie_Name: "+m3.movieName+", Movie_budget: "+m3.movieBudget+", movie_Release_Date: "+m3.MovieReleaseDate);
		Movie m4 = new Movie();
		m4.movieName="Annaya";
		m4.movieBudget=100000000L;
		m4.MovieReleaseDate=LocalDate.of(2000, 1, 7);
		System.out.println(m4.movieName+" Details:");
		System.out.println("Theatre_Name: "+theatreName+", Theatre_LOcation: "+theatreLoaction+", Movie_Name: "+m4.movieName+", Movie_budget: "+m4.movieBudget+", movie_Release_Date: "+m4.MovieReleaseDate);
		Movie m5 = new Movie();
		m5.movieName="Anji";
		m5.movieBudget=250000000L;
		m5.MovieReleaseDate=LocalDate.of(2004, 1, 15);
		System.out.println(m5.movieName+" Details:");
		System.out.println("Theatre_Name: "+theatreName+", Theatre_LOcation: "+theatreLoaction+", Movie_Name: "+m5.movieName+", Movie_budget: "+m5.movieBudget+", movie_Release_Date: "+m5.MovieReleaseDate);
		

	}

}
