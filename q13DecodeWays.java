class Solution {
    public int numDecodings(String s) {
        int a = 1;  
        int b = 1;
        int c = 0;  

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == '0' && (s.charAt(i - 1) > '2' || s.charAt(i - 1) < '1')) {
                return 0;
            }   else if (s.charAt(i - 1) != '0' && ((s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0')) < 27) {
                
                if (s.charAt(i) == '0') {
                    c = b;
                    b = a;
                    a = c;
                    continue;
                } 
           
                else {
                    c = b;
                    b = a;
                    a = a + c;
                    continue;
                }
            } 
   
            else {
                b = a;
                continue;
            }
        }


        if (s.charAt(0) == '0') {
            return 0;
        }

        return a;
    }
}
