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
public class Coach extends Member {
private String CoachType;
private String Salary;
public void setCoachType(String CoachType){this.CoachType=CoachType;}
public void setSalary(String Salary){this.Salary=Salary;}
public String getCoachType(){
    while (this.CoachType.length()<12){
            this.CoachType=this.CoachType+" ";}
    return this.CoachType;}
public String getSalary(){return this.Salary;}
public String Output(){return this.getName(this.getFirstName(), this.getLastName())+this.getAge()+this.getContract()+this.getCoachType()+this.getCountry()+"€"+this.getSalary();}


    
}
