import java.util.HashMap;
class TwelveDays {
    HashMap<Integer, String> verseMap = new HashMap<>();
    
    void mapping(){
    	    verseMap.put(1, "a Partridge in a Pear Tree");
	    verseMap.put(2, "two Turtle Doves");
	    verseMap.put(3, "three French Hens");
	    verseMap.put(4, "four Calling Birds");
	    verseMap.put(5, "five Gold Rings");
	    verseMap.put(6, "six Geese-a-Laying");
	    verseMap.put(7, "seven Swans-a-Swimming");
	    verseMap.put(8, "eight Maids-a-Milking");
	    verseMap.put(9, "nine Ladies Dancing");
	    verseMap.put(10, "ten Lords-a-Leaping");
	    verseMap.put(11, "eleven Pipers Piping");
	    verseMap.put(12, "twelve Drummers Drumming");
    }
  
    String verse(int verseNumber) {
        mapping();
        String singleVerse = "On the ";
        switch(verseNumber){
        		case 1: singleVerse += "first ";
        				break;
        		case 2: singleVerse += "second ";
        				break;
        		case 3: singleVerse += "third ";
        				break;
        		case 4: singleVerse += "fourth ";
        				break;
        		case 5: singleVerse += "fifth ";
        				break;
        		case 6: singleVerse += "sixth ";
        				break;
        		case 7: singleVerse += "seventh ";
        				break;
        		case 8: singleVerse += "eighth ";
        				break;
        		case 9: singleVerse += "ninth ";
        				break;
        		case 10: singleVerse += "tenth ";
        				break;
        		case 11: singleVerse += "eleventh ";
        				break;
        		case 12: singleVerse += "twelfth ";
        				break;
        }
        singleVerse += "day of Christmas my true love gave to me: ";
        if(verseNumber > 1){
		   for(int i=verseNumber;i>1;i--){
		   		singleVerse += verseMap.get(i);
		   		singleVerse += ", ";
		   }
		   singleVerse += "and ";
        }
        singleVerse += verseMap.get(1);
        singleVerse += ".\n";
        return singleVerse;
    }

    String verses(int startVerse, int endVerse) {
        String verseRange = "";
        for(int i=startVerse;i<endVerse;i++){
        		verseRange += verse(i);
        		verseRange += "\n";
        }
        verseRange += verse(endVerse);
        return verseRange;
    }
    
    String sing() {
        String wholeSong = "";
        wholeSong += verses(1, 12);
        return wholeSong;
    }
}
