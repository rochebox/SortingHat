import java.util.Arrays;

public class SortingHat {

    public static void main(String[] args) {
        
        // TODO Auto-generated method stub  
        int howMany = 1000000;
        //int[ ] nums = getRandom(howMany);
        int[ ] nums0 = getDescendingOrder(howMany); //good
        int[ ] nums0A = nums0.clone();
        
        int[ ] nums1 = getDescendingOrder(howMany); //Worst
        int[ ] nums2 = getDescendingOrder(howMany); //Worst
        
        //System.out.println(Arrays.toString(nums0));
        //int[ ] nums2 = getRandom(howMany);
        
        
        //int[ ] nums2 = getRandom(howMany);
       
        /* 
        SelectionSort sSort = new SelectionSort(nums0, "Selection Sort");  
        doTiming(sSort);
        System.out.println();
        BubbleSort bSort = new BubbleSort(nums1, "BubbleSort");
        doTiming(bSort);
        */
        InsertionSort inS = new InsertionSort(nums0, "Insertion Sort Worst");
        //System.out.println(inS);
        doTiming(inS);
        System.out.println();
        BubbleSort bs = new BubbleSort(nums0A, "Bubble Worst");
        //System.out.println(inSW);
        doTiming(bs);
        
      
        
        
        
 

    }
    
    
    public static void doTiming(PapaSort s) {
        
        if(s.getLength() <=100) {
            System.out.println("Before: " + s);
        }
       
        long start = System.currentTimeMillis();
        long start2 = System.nanoTime();
        
        s.executeAlgorithm();
        
        long end = System.currentTimeMillis();
        long end2 = System.nanoTime();
        long theTime = end-start;
        long theTime2 = end2-start2;
          
        if(s.getLength() < 100) {
            System.out.println("Time for " + s.getSortName() + " on " +
                s.getLength() + " numbers is: " +  theTime2 +
                " (nano) seconds"
                );
            System.out.println("After: " + s);
        } else {
            System.out.println("Time for "  + s.getSortName() + " on " +
                s.getLength() + " numbers is: " +  theTime +
                " (milli) seconds"
                ); 
        }
        
    }
    
    public static int[ ] getRandom(int n) {
        
        int [ ] nList = new int[n];
        
        for(int  i = 0 ; i < nList.length; i++) {
            nList[i] = (int)(Math.random() * 1000);
        }
       
        return nList;
        
    }
    
    public static int [ ] getAscendingOrder(int n) {
        
        int [ ] nList = new int[n];
        
        for(int  i = 0 ; i < nList.length; i++) {
            nList[i] = i+1;
        }
       
        return nList;
        
    }
    
    public static int [ ] getDescendingOrder(int n) {
        
        int [ ] nList = new int[n];
     /*   
        for(int  i = 0 ; i < nList.length; i++) {
            nList[i] = nList.length -i;
        }
        */
        
        //or
        for(int i = nList.length; i > 0; i--) {
            nList[nList.length-i ] = i;
        }
       
        return nList;
        
    }

}
