/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparabledemo;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author omsairam
 */

class Music
{
    
    String track_name;
    String artist;
    int year;

    public Music(String track_name, String artist, int year) {
        this.track_name = track_name;
        this.artist = artist;
        this.year = year;
    }
    
}


class Yearcomparator implements Comparator{
    
    
    public int compare(Object p1, Object p2)
    {
        
        Music m1 = (Music)p1;
        Music m2 = (Music)p2;
        
        
        if(m1.year==m2.year)
            return 0;
        else if(m1.year>m2.year)
            return 1;
        else
        {
            return -1;
        }
        
        
        
    }
    
    
    
}



class Artistcomparator implements Comparator{
    
    
    public int compare(Object p1, Object p2)
    {
        
        Music m1 = (Music)p1;
        Music m2 = (Music)p2;
        
       return m1.artist.compareTo(m2.artist);
        
    }
    
    
    
}



class Trackcomparator implements Comparator{
    
    
    public int compare(Object p1, Object p2)
    {
        
        Music m1 = (Music)p1;
        Music m2 = (Music)p2;
        
        
        
       return m1.track_name.compareTo(m2.track_name);
        
        
        
    }
    
    
    
}



public class ComparatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
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