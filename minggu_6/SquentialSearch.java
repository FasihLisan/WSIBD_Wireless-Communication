/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_6;

/**
 *
 * @author FASIH
 */
public class SquentialSearch {
    public static void main(String[] args) {
        int[] exampleVariableOne = {2,9,6,7,4,5,3,0,1};
        int target = 4;
        squentialSearch(exampleVariableOne,target);
    }
    
    public static void squentialSearch(int[] parameterOne, int parameterTwo){
        int index = -1;
        
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Your target integer does not exist in the array");
        }else{
            System.out.println("Your target integer is in index "+index+ " of the array");
        }
    }
}
