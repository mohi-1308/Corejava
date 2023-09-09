package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
	String moviename;
	int movieyear;
	double rating;

	public Movie(String moviename, int movieyear, double rating) {
		this.moviename = moviename;
		this.movieyear = movieyear;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [moviename=" + moviename + ", movieyear=" + movieyear + ", rating=" + rating + "]";//right click go to source then click on toString
	}

	
}

class SortByyear implements Comparator<Movie>{//control space

	@Override
	public int compare(Movie o1, Movie o2) {//o
		
		return o1.moviename.compareTo(o2.moviename) ;
	}
	
	class SortByName implements Comparator<Movie>{//control space

		@Override
		public int compare(Movie o1, Movie o2) {//o
			
			return o1.moviename.compareTo(o2.moviename) ;
		}
		
	
}}

public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("SITARAMAN", 2010, 4.7));
		list.add(new Movie("KGF", 2022, 4.9));
		list.add(new Movie("KAKAN", 2018, 4.8));
		list.add(new Movie("DRUSHAM", 2023, 4.5));
		Collections.sort(list,new SortByyear());
		for(Movie m:list) {
			System.out.println(m);
		}

	}

}
/*Movie [moviename=DRUSHAM, movieyear=2010, rating=4.7]
Movie [moviename=KAKAN, movieyear=2018, rating=4.8]
Movie [moviename=KGF, movieyear=2022, rating=4.9]
Movie [moviename=SITARAMAN, movieyear=2023, rating=4.5]
*/