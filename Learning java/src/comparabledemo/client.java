package comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Music>ml = new ArrayList<>();
         
         ml.add(new Music("abc", "Arijit", 2015));
         ml.add(new Music("kio", "Rahman", 2017));
         ml.add(new Music("lappy", "Amaan", 2012));
         ml.add(new Music("uio", "Darshan", 2018));
         ml.add(new Music("ftyu", "Baadshah", 2011));
         
         
         System.out.println("Sorting by Year");
         
         Collections.sort(ml, new Yearcomparator());
          for(Music m : ml)
 {
     
     System.out.println(m.track_name+" "+m.artist+" "+m.year);
 }
         
         
         
         
         System.out.println("Sorting by Track name");
         
         Collections.sort(ml, new Trackcomparator());
          for(Music m : ml)
 {
     
     System.out.println(m.track_name+" "+m.artist+" "+m.year);
 }
         
         
         
         System.out.println("Sorting by Artist name");
         
         
         Collections.sort(ml, new Artistcomparator());
          for(Music m : ml)
 {
     
     System.out.println(m.track_name+" "+m.artist+" "+m.year);
 }
         
         
         
         

	}

}
