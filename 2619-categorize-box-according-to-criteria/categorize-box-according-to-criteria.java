class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height;
        String s1="";
        String s2="";
        String result="";
        if(length>=1e4 || width>=1e4 || height>=1e4 || volume>=1e9){
            s1="Bulky";
        }
        if(mass>=100){
            s2="Heavy";
        }
        if(s1.equals("Bulky") && s2.equals("Heavy")) result= "Both";
        else if(s1.equals("Bulky")) result= "Bulky";
        else if(s2.equals("Heavy")) result="Heavy";
        else result= "Neither";
        return result;
    }
}