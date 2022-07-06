/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasia_;

import static java.lang.Math.abs;
import java.lang.String;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author giorgos
 */
class Book {

    int day1, day2;
    int month1, month2;
    int year1, year2;

    String date1 = (day1 + "/" + month1 + "/" + year1);
    String date2 = (day2 + "/" + month2 + "/" + year2);
    String dimos_s;
    int id1;
    int people;
    int cost;
    public Book(int day1, int day2, int month1, int month2, int year1, int year2, String dimos_s, int id1) {

        this.day1 = day1;
        this.day2 = day2;
        this.month1 = month1;
        this.month2 = month2;
        this.year1 = year1;
        this.year2 = year2;
        this.dimos_s = dimos_s;
        this.id1 = id1;
    }

    public Book() {
    }

    public int getDay1() {
        return day1;
    }

    public void setDay1(int day1) {
        this.day1 = day1;
    }

    public int getDay2() {
        return day2;
    }

    public void setDay2(int day2) {
        this.day2 = day2;
    }

    public int getMonth1() {
        return month1;
    }

    public void setMonth1(int month1) {
        this.month1 = month1;
    }

    public int getMonth2() {
        return month2;
    }

    public void setMonth2(int month2) {
        this.month2 = month2;
    }

    public int getYear1() {
        return year1;
    }

    public void setYear1(int year1) {
        this.year1 = year1;
    }
    
    public int getCost(){
        return this.cost;
    }
    
    public void setCost(){
        Property p= new Property();
        this.cost=p.dailyCost;
    }

    public int getYear2() {
        return year2;
    }

    public void setYear2(int year2) {
        this.year2 = year2;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getDimos_s() {
        return dimos_s;
    }

    public void setDimos_s(String dimos_s) {
        this.dimos_s = dimos_s;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    void get_Info() {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.println("Arrival day");
        this.day1 = input1.nextInt();

        System.out.println("Departure day");
        this.day2 = input1.nextInt();

        System.out.println("Arrival month");
        this.month1 = input1.nextInt();

        System.out.println("Departure month");
        this.month2 = input1.nextInt();

        System.out.println("Arrival year");
        this.year1 = input1.nextInt();

        System.out.println("Departure year");
        this.year2 = input1.nextInt();

        System.out.println("In which area would you like to stay");
        this.dimos_s = input1.nextLine();

    }
    List<Property> book = new ArrayList();

    public void booking(List list, List book) {

        Random id = new Random();
        Property property = null;
        Tenant t = new Tenant();
        t.checkTenant(list, book, t.t_afm);
        get_Info();
        if (list.contains(this.dimos_s) && (abs(this.day1 - this.day2) <= 15) && (abs(this.month1 - this.month2) < 2)) {

            property.equals(list.contains(this.dimos_s));
            book.add(property);
            char c[] = this.dimos_s.toCharArray();
            String id1 = "Id:" + c[0] + c[1] + '-' + this.year1 + id;

        } else {
            System.out.println("No such property");
        }

    }

    class Tenant {

        String t_name;
        String t_surname;
        String t_email;
        int t_afm;
        int t_id;

        private Tenant() {
        }

        public String getT_name() {
            return t_name;
        }

        public void setT_name(String t_name) {
            this.t_name = t_name;
        }

        public String getT_surname() {
            return t_surname;
        }

        public void setT_surname(String t_surname) {
            this.t_surname = t_surname;
        }

        public String getT_email() {
            return t_email;
        }

        public void setT_email(String t_email) {
            this.t_email = t_email;
        }

        public int getT_afm() {
            return t_afm;
        }

        public void setT_afm(int t_afm) {
            this.t_afm = t_afm;
        }

        public int getT_id() {
            return t_id;
        }

        public void setT_id(int t_id) {
            this.t_id = t_id;
        }

        public ArrayList<Tenant> tenants = new ArrayList<>();

        public Tenant(String t_name, String t_surname, String t_email, int t_afm, int t_id) {
            this.t_name = t_name;
            this.t_surname = t_surname;
            this.t_email = t_email;
            this.t_afm = t_afm;
            this.t_id = t_id;
        }

        public void checkTenant(List list, List book, int afm) {

            Book p = new Book();
            if (book.contains(afm)) {
                System.out.println("Tenant exist");
                p.booking(list, book);

            } else {
                System.out.println("Add tenant");
                get_Tenant();

            }
        }

        public void get_Tenant() {

            Scanner input = new Scanner(System.in);
            Scanner input1 = new Scanner(System.in);

            Tenant a = null;

            System.out.println("Tenant's AFM"); //en xriazete giati prepei na to thkiavazi mia fora an tha to thkiavazi p main + prepei na kamis check j gia poda
            this.t_afm = input1.nextInt();

            System.out.println("Tenant's name:");
            this.t_name = input.nextLine();

            System.out.println("Tenant's surname");
            this.t_surname = input.nextLine();

            System.out.println("Tenant's id:");
            this.t_id = input1.nextInt();

            System.out.println("Tenant's email:");
            this.t_email = input.nextLine();

            String emailRegex = "[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
            Pattern emailpat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = emailpat.matcher(t_email);

            while (matcher.find() == false) {
                System.out.println("Tenant's email:");
                this.t_email = input.nextLine();
            }

            tenants.add(a);
        }
    }

    public List<Property> getBook() {
        return book;
    }

    public void setBook(List<Property> book) {
        this.book = book;
    }
    
    public void deleteBooking(List book , List list){
        Book b = new Book();
         Scanner input = new Scanner(System.in);
         
        System.out.println("Which property would you like to update");
        String id = input.nextLine();
        if (book.contains(id)) {
            book.remove(book.contains(id));
    }
    }

    public void updateBooking(List book, List list) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        Book b = new Book();

        System.out.println("Which property would you like to update");
        String id = input.nextLine();
        if (book.contains(id)) {
            book.remove(book.contains(id));

            System.out.println("Arrival day");
            this.day1 = input1.nextInt();

            System.out.println("Departure day");
            this.day2 = input1.nextInt();

            System.out.println("Arrival month");
            this.month1 = input1.nextInt();

            System.out.println("Departure month");
            this.month2 = input1.nextInt();

            System.out.println("Arrival year");
            this.year1 = input1.nextInt();

            System.out.println("Departure year");
            this.year2 = input1.nextInt();

            Property property = null;

            if (list.contains(this.dimos_s) && (abs(this.day1 - this.day2) <= 15) && (abs(this.month1 - this.month2) < 2)) {

                property.equals(list.contains(this.dimos_s));
                char c[] = this.dimos_s.toCharArray();
                String id1 = "Id:" + c[0] + c[1] + '-' + this.year1 + id;
                book.add(property);
                double cost;
                double i = property.dailyCost;
                cost = ((i * 10) / 100) + (i / abs(this.day1 - this.day2));
                System.out.println("The cost is:" + cost);
                System.out.println(property.equals(list.contains(id1)));

            } else {
                System.out.println("No such property");
            }
        }
    }
}
