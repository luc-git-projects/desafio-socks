/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.luciano.desafio.socks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author luciano
 */
public class DesafioSocks {
    
    

    public static void main(String[] args) {
        Integer[] arraySocks = {1, 5, 7, 3, 1, 1, 5, 7, 7, 9, 1, 4, 11, 8};
        List<Integer> allSocks = Arrays.asList(arraySocks);
        int totalParisOfSocks = sockMerchant(12, allSocks);
        System.out.println("Tal of pairs of socks = " + totalParisOfSocks);
    }
    
    public static int sockMerchant(int n, List<Integer> ar){
        
        /*
            tests to see if the List containing the socks 
            is null or empty, if it is empty return zero
        */
        if((ar == null) || (ar.isEmpty())){
            return 0;
        }
        
        /*
            tests to see if the number of socks that will be 
            used from the Sock List is equal to zero, if so 
            returns zero
        */
        if(n <= 0){
            return 0;
        }
        
        
        int numberOfPairs = 0;
        
        List<Integer> socks = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            Integer sock = ar.get(i);
            socks.add(sock);
        }
    
        
        for(int i = 0; i < socks.size(); i++){
            Integer sock = socks.get(i);
            
            for(int j = i + 1; j < socks.size(); j++){
             
                Integer anotherSock = socks.get(j);
                
                if(sock.equals(anotherSock)){
                    numberOfPairs++;
                    socks.remove(j);
                    break;
                }
            }
        }
        return numberOfPairs;
    }
}
