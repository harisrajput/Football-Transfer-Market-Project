/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football.transfer.market;

/**
 *
 * @author hp
 */
public class Member {
    private String FirstName;
    private String LastName;
    private String Name;
    private String Country;
    private String Age;
    private String Contract;
    
    public void setFirstName(String FirstName){this.FirstName=FirstName;}
   public void setLastName(String LastName){this.LastName =LastName;}
    public void setCountry(String Country){this.Country=Country;}
    public void setAge(String Age){this.Age=Age;}
    public void setContract (String Contract){this.Contract=Contract;}
    
    public String getFirstName(){return this.FirstName;}
    public String getLastName(){return this.LastName;}
        public String getName(String FirstName, String LastName){
            this.Name= FirstName+" "+LastName;
            while (this.Name.length()<23){
            this.Name=this.Name+" ";}
        return this.Name;}
    public String getCountry(){
        while (this.Country.length()<10){
            this.Country=this.Country+" ";}
        return this.Country;}
    public String getAge(){
        while (this.Age.length()<5){
            this.Age=this.Age+" ";}
        return this.Age;}
    public String getContract(){
        while (this.Contract.length()<5){
            this.Contract=this.Contract+" ";}
        return this.Contract;}
}
