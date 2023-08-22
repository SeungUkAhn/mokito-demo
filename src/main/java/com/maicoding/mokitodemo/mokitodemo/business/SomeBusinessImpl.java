package com.maicoding.mokitodemo.mokitodemo.business;

public class SomeBusinessImpl {

    private DataService dataService;

    public int findTheGreatestFromALlData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for(int v : data){
            if(v > greatest){
                greatest = v;
            }
        }
        return greatest;
    }
}

interface DataService{
    int[] retrieveAllData();
}
