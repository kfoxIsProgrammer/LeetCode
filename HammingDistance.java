//https://leetcode.com/problems/hamming-distance/
class HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
        
        ///Old code
      /*  String z ="";
        String k ="";
        
        //Convert x into binary
        while(x > 0)
        {
            int a = x % 2;
            z = a + z;
            x = x / 2;
        }
        //Convert y into binary
        while(y > 0)
        {
            int b = y % 2;
            k = b + k;
            y = y / 2;
        }
        
        //Padding Zeros to make the binaries equal length
        while(k.length()!=z.length())
        {
            if(k.length() > z.length()){
                z = "0"+z;
            }
            else
            {
                k = "0"+k;
            }
        }
    
        //Counting the differences
        int counter = 0;
        for(int i = 0; i<k.length(); i++){
           if(k.charAt(i) != z.charAt(i)){
               counter++;
           } 
        }
        
        
        return counter;
       
        
    }
}
*/
