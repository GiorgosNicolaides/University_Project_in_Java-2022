package ergasia_;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author giorgos
 */
class Property {
    
    String dimos;
    String address;
    Owner afm;
    int people;
    int rooms;
    boolean wifi;
    boolean tv;
    boolean kitchen;
    boolean parking;
    String view;
    double distance;
    double comfort;
    int dailyCost;
    String generateId;
     int floor;
    boolean balcony;
    boolean elevator;
    int pool;
    int garden;
    boolean barbeque;
    
     List<Property> list = new ArrayList();

    public Property(String dimos, Owner afm, String address, int people, int rooms, boolean wifi, boolean tv, boolean kitchen, boolean parking, String view, double distance, int dailyCost, String generateId, int floor, boolean balcony, boolean elevator, int pool, int garden, boolean barbeque) {
        this.afm = getAfm();
        this.dimos = dimos;
        this.address = address;
        this.people = people;
        this.rooms = rooms;
        this.wifi = wifi;
        this.tv = tv;
        this.kitchen = kitchen;
        this.parking = parking;
        this.view = view;
        this.distance = distance;
        this.dailyCost = dailyCost;
        this.generateId = generateId;
        this.floor = floor;
        this.balcony = balcony;
        this.elevator = elevator;
        this.pool = pool;
        this.garden = garden;
        this.barbeque = barbeque;
    }

    Property() {
    }

    public String getDimos() {
        return dimos;
    }

    public void setDimos(String dimos) {
        this.dimos = dimos;
    }

    private Owner getAfm() {
        return afm;
    }

    public void setAfm(Owner afm) {
        this.afm = afm;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getComfort() {
        return comfort;
    }

    public void setComfort() {
        
        comfort=getRooms()/getPeople();
        this.comfort = comfort;
    }
    

    public int getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(int dailyCost) {
        this.dailyCost = dailyCost;
    }

    public String getGenerateId() {
        return generateId;
    }

    public void setGenerateId(String generateId) {
        this.generateId = generateId; //pos to kamnis generate?
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     public int getPool() {
        return pool;
    }

    public void setPool(int pool) {
        this.pool = pool;
    }

    public int getGarden() {
        return garden;
    }

    public void setGarden(int garden) {
        this.garden = garden;
    }

    public boolean isBarbeque() {
        return barbeque;
    }

    public void setBarbeque(boolean barbeque) {
        this.barbeque = barbeque;
    }

    //prepei na valis prokathorismena spithkia
     public void get_Property() {
         
         Property p=new Property();

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.println("Which area is the property in:  ");
        this.dimos = input.nextLine();

        System.out.println("What is the address:   ");
        this.address = input.nextLine();

        System.out.println("How many peaple can stay:  ");
        this.people = input1.nextInt();

        System.out.println("How many rooms are there:  ");
        this.rooms = input.nextInt();

        System.out.println("View of the property:  ");
        this.view = input.nextLine();

        System.out.println("How much is the daily cost: ");
        this.dailyCost = input1.nextInt();

        System.out.println("Is there a tv\nOf yes type 1  ");
        int tv_check = input1.nextInt();
        if (tv_check == 1) {
            this.tv = true;
        } else {
            this.tv = false;
        }

        System.out.println("Is there a kitchen\nOf yes type 1 ");
        int kitchen_check = input1.nextInt();
        if (kitchen_check == 1) {
            this.kitchen = true;
        } else {
            this.wifi = false;
        }

        System.out.println("Is there a wifi\nOf yes type 1  ");
        int wifi_check = input1.nextInt();
        if (wifi_check == 1) {
            this.wifi = true;
        } else {
            this.wifi = false;
        }

        System.out.println("Is there a parking\nOf yes type 1");
        int parking_check = input1.nextInt();
        if (parking_check == 1) {
            this.parking = true;
        } else {
            this.parking = false;
        }

        System.out.println("Distance from closest metro station:");
        this.distance = input1.nextDouble();

        int i;

        do{
        System.out.println("Is the property an apartment\nIf yes press 1");
        System.out.println("Is the property a house\nIf yes press 1");
        i = input1.nextInt();
        }while(i>2);
        
        if(i == 0){
            get_Apartment();
        }
        if(i==1){
            Detached();
        }
        Random id = new Random();
        char c[] = this.dimos.toCharArray();
        this.generateId = "Id:" + c[0] + c[1] + '-' + id;
        list.add(p);
        
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giorgos
 */
 
    public void get_Apartment() {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        get_Property(); 

        System.out.println("Is there an elevator?\nIf yes type 1");
        int elevator_check = input1.nextInt();
        if (elevator_check == 1) {
            this.elevator = true;
        } else {
            this.elevator = false;
        }

        System.out.println("Is there a balcony?\nIf yes type 1");
        int balcony_check = input1.nextInt();
        if (balcony_check == 1) {
            this.balcony = true;
        } else {
            this.balcony = false;
        }

        System.out.println("What floor is the apartment in:");
        this.floor = input1.nextInt();
    }
    public void Detached() {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        get_Property(); 

        System.out.println("Is there a garden?\nIf yes type 1");
        int garden_check = input1.nextInt();
        if (garden_check == 1) {
            System.out.println("How many square meters is the garden:");
            this.garden = input1.nextInt();
        }

        System.out.println("Is there a pool?\nIf yes type 1");
        int pool_check = input1.nextInt();
        if (pool_check == 1) {
            System.out.println("How many square meters is the pool:");
            this.pool = input1.nextInt();
        }

        System.out.println("Is there a barbeque?\nIf yes type 1");
        int barbeque_check = input1.nextInt();
        if (barbeque_check == 1) {
            this.barbeque = true;
        } else {
            this.barbeque = false;
            
            
        }
        
    }
}
