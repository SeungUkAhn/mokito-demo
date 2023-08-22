package com.maicoding.mokito.mokitodemo.business;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

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
