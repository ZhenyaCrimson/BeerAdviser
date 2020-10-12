package com.example.beeradviser;



public class BeerExpert  {
    private String beerType;
    private String res;



    public BeerExpert(String beerType) {
        this.beerType = beerType;
    }

    public String getBrands(){
        if(beerType.compareTo("light")==0) {
            res = "Desant";
        }
        if(beerType.compareTo("amber")==0) {
            res = "Lvivske";
        }
        if(beerType.compareTo("brown")==0) {
            res = "Corona";
        }
        if(beerType.compareTo("dark")==0) {
            res = "JimBim";
        }
        return res;
    }

}
