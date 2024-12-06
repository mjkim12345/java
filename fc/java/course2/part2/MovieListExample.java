package fc.java.fc.java.course2.part2;

import fc.java.fc.java.model2.Movie;

import java.sql.Array;
import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list=new ArrayList<Movie>(); // Movie[]
        list.add(new Movie("괴물","봉준호","2006","한국"));
        list.add(new Movie("기생충","봉준호","2019","한국"));
        list.add(new Movie("완벽한 타인","이재규","2018","한국"));

        for (Movie m : list){
            System.out.println(m);
        }
        System.out.println("+-----------------+--------+-------+---+");
        System.out.println("+영화제목           |감독     |개봉년도|국가|");
        System.out.println("+-----------------+--------+-------+---+");
        for(Movie m:list){
            System.out.printf("|%-16s|%-8s|%4s|%-6s\n",m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());
        }

        String searchTitle="기생충";

        for(Movie m : list){
            if(m.getTitle().equals(searchTitle)){
                System.out.println("제목:"+m.getTitle());
                break;
            }
        }

    }
}
