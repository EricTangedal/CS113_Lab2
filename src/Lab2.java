public class Lab2 {
    //Instance Variable
    public double num;
    public double tempNum;
    //Constructor
    public Lab2(double _num){
        num = _num;
    }
    //Method
    public void checkIfPowerOfTwo(){
        tempNum = num;
        while(tempNum > 2) {
            System.out.println(tempNum);
            tempNum = tempNum/2;
        }
        if(tempNum == 2) {
            System.out.println(num + " is a power of 2.");
        }
        else{
            System.out.println(num + " is NOT a power of 2.");
        }
    }
}
/*
Eric Tangedal
Lab 2
CS113 1971
Version 1.0
08/31/2022
 */