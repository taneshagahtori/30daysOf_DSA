class Solution {
    public int numberOfBeams(String[] bank) {
        int beams=0;
        int prevRowDevices=0;
        for(String row:bank){
            int currRowDevices=0;
            for(int i=0;i<row.length(); i++){
                if(row.charAt(i)=='1'){
                    currRowDevices++;
                }
            }
            if (currRowDevices>0){
                beams+=(prevRowDevices*currRowDevices);
                prevRowDevices=currRowDevices;
            }
        }
        return beams;
    }
}