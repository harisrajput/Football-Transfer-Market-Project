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
public class Player extends Member {
private String Position;
private String worth;
public void setPosition(String Position){this.Position=Position;}
public void setWorth(String worth){this.worth=worth;}
public String getPosition(){
    while (this.Position.length()<12){
            this.Position=this.Position+" ";}
    return this.Position;}
public String getWorth(){return this.worth;}
public String Output(){return this.getName(this.getFirstName(), this.getLastName())+this.getAge()+this.getContract()+this.getPosition()+this.getCountry()+"€"+this.getWorth();}


    
}
