package com.upgrad.inheritance;

public class IntroToInheritance {
    public static void main(String[] args) {
//        Faisal munaa= new Faisal();
//        munaa.setBuss();
//        System.out.println(munaa.areaOfLand()); //Dada
//        System.out.println(munaa.getBuss()); // Baap
//        System.out.println(munaa.getKattaKaVyapar()); // faisal
//        Baap faisal = new Baap();
//        faisal.setBuss();
//        System.out.println(faisal.areaOfLand()); //Dada
//        System.out.println(faisal.getBuss()); // Baap

        Ramu ramu= new Ramu();
        System.out.println(ramu.getName());
    }

}
class Father1 {  //collection of entity/attribute and methods
    public String name;
    public String place;
    public Father1(){
        this.name="Rohit";
        this.place="US";
    }
    public String getName(){

        return "Name is "+name;
    }
}
class Father2 {  //collection of entity/attribute and methods
    public String name;
    public String place;
    public Father2(){
        this.name="Rohit";
        this.place="Dubai";
    }
    public String getName(){

        return "Name is "+name;
    }
}
class Ramu {
    Father1 father=new Father1();   // compositon
    Father2 father2= new Father2();
    public String getName(){
        father.name="Ambani";
        return "Baap ka naam "+father.name +" and I got dinar of "+ father2.place +" dinar and dollar of "+father.place  ;
    }
}
//class Ramu extends Father2,Father1{
//    public String getName(){
//        return "Baap ka naam "+this.name;
//    }
//}

//class Dada {  //collection of entity/attribute and methods
//    public String land;
//    public Dada(){
//        this.land="1000";
//    }
//    public String areaOfLand(){
//
//        return "Area of land is "+land;
//    }
//}
//class Baap extends Dada{
//    public String buss;
//    public void setBuss(){
//        this.buss="bhot bada buss";
//    }
//    public String getBuss(){
//        return "Baap ka "+this.buss;
//    }
//}
//class Faisal extends Baap{
//    public boolean home;
//    public String abc(){
//
//        return this.land;
//    }
//    public String getHome(){
//        home=true;
//        return "My House name is Child2 on Land of area "+this.land;
//    }
//    public String getKattaKaVyapar(){
//        return "Faisal ka "+this.buss;
//    }
//
//}

//class father {  //collection of entity/attribute and methods
//    public String land;
//    public father(){
//        this.land="1000";
//    }
//    public String areaOfLand(){
//
//        return "Area of land is "+land;
//    }
//}
//class Child1 extends father{
//    public boolean home;
//    public String abc(){
//
//        return this.land;
//    }
//    public String getHome(){
//        home=true;
//        return "My House name is Child1 on Land of area "+this.land;
//    }
//}
//class Child2 extends father{
//    public boolean home;
//    public String abc(){
//
//        return this.land;
//    }
//    public String getHome(){
//        home=true;
//        return "My House name is Child2 on Land of area "+this.land;
//    }
//}
//class Child3 extends father{
//    public boolean home;
//    public String abc(){
//
//        return this.land;
//    }
//    public String getHome(){
//        home=true;
//        return "My House name is Child3 on Land of area "+this.land;
//    }
//}
//public class IntroToInheritance {
//    public static void main(String[] args) {
//        IntroToInheritance obj= new IntroToInheritance("aaa");
//    }
//    //collection of entity/attribute and methods
//    public String land;
//    public IntroToInheritance(String land){
//        this.land=land;
//    }
//    public String areaOfLand(){
//        return "Area of land is "+land;
//    }
//
//}
