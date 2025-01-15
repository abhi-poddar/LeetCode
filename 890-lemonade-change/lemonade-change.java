class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        if(bills[0] == 10 || bills[0] == 20){
            return false;
        }
        for (int i = 0; i <= bills.length - 1 && i<1000; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five >= 1) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
        // int five=0;
        // int ten =0;
        // for(int i=0 ; i < bills.length;i++){
        //     if(bills[i]==5){
        //         five++;
        //     }
        //     else if(bills[i]==10){
        //         ten++;
        //     }
        // }

        // for(int i=0;i<bills.length;i++){
        //     if(bills[i]==10 && five>=1){
        //         return true;
        //         five=five-1;
        //     }
        //     else if(bills[i]==20){
        //         if(five>=3){
        //             return true;
        //             five=five-3;
        //         }
        //         else if(ten>=1 && five>=1)
        //             return true;
        //             ten=ten-1;
        //             five=five-1;
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        // }
        // return true;
    }
}