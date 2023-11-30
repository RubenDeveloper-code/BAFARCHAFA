public class utilities {
    public static int initLength(Object[] myArray) {
        int count = 0;
        for (Object obj : myArray) {
            if ( obj != null ) count++;
        }
        return count;
    }
}
