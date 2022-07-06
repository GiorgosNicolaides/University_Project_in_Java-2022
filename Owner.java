
package ergasia_;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author giorgos
 */
public class Owner {
    
    int afm;
    String name;
    String surname;
    int id;
    String o_address;

    Owner() {
        
    }

    public int getAfm() {
        return afm;
    }

    public void setAfm(int afm) {
        this.afm = afm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getO_address() {
        return o_address;
    }

    public void setO_address(String o_address) {
        this.o_address = o_address;
    }

    public Owner(int afm, String name, String surname, int id, String o_address) {
        this.afm = afm;
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.o_address = o_address;
    }
     public ArrayList<Owner> owners = new ArrayList<>();
     
    public void get_Owner(){
        
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        
        Owner a = null;
        
        System.out.println("Owner's afm");
        this.afm=input1.nextInt();
        
        System.out.println("Owner's name:");
        this.name=input.nextLine();
        
        System.out.println("Owner's surname:");
        this.surname=input.nextLine();
        
        System.out.println("Owner's id:");
        this.id=input1.nextInt();
        
        System.out.println("Owner's address:");
        this.o_address=input.nextLine();
        
        owners.add(a);
    }
    
    
   
    public void checkAfm(int afm) {
        
        
        Property p=new Property();
        if(owners.contains(afm)){ 
            System.out.println("Owner exist");
            p.get_Property();
            
        }else {
           
            get_Owner();
            p.get_Property();
           
         
            
        }
    }

    
}
