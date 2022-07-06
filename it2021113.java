package ergasia_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ergasia_.Property;

/**
 *
 * @author giorgos
 */
public class it2021113 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        List<Property> list = new ArrayList();
        List<Property> book = new ArrayList();

        ArrayList<Owner> owners = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Book b = new Book();
        Owner owner = new Owner();
        int ch = 0;
        do {
            System.out.println("CHOOSE:\n    1.Add Property\n    2.Make a reservation\n    3.Update an existing reservation\n    4.Display");
            ch = input.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Give afm");
                    int afm = input.nextInt();
                    owner.checkAfm(afm);
                    Property property = new Property();
                    property.get_Property();
                    list.add(property);

                    break;

                case 2:

                    b.booking(list, book);

                    break;

                case 3:
                    int ch1;
                    System.out.println("Delete or update\n0 for update\n1 to remove the reservation");
                    ch1 = input.nextInt();
                    if (ch1 == 0) {
                        b.updateBooking(book, list);
                    } else {
                        b.deleteBooking(book, list);
                    }

                    break;

                case 4:
                    System.out.println("Are you an owner or a tenant\n0 for owner\n1 for tenant");
                    int ch2 = input.nextInt();
                    System.out.println("Give your AFM");
                    int afm1 = input.nextInt();
                    if (ch == 0) {
                        System.out.println("Display all or one single property\n0 for all\n1 for  asingle property");
                        int ch3 = input.nextInt();
                        switch (ch3) {
                            case 0:
                                System.out.println(list.contains(afm1));
                                break;

                            case 1:
                                System.out.println("Property id");
                                String id = input.nextLine();
                                System.out.println(list.contains(id));
                                break;
                        }
                    } else {
                        if (ch2 == 1) {
                            System.out.println("Display alla reservations or cost\0 for all\n1for cost");
                            int ch4 = input.nextInt();
                            switch (ch4) {
                                case 0:
                                    System.out.println(book.contains(afm1));
                                    break;

                                case 2:
                                    int sum=0;
                                    for (int i = 0; i < book.lastIndexOf(list); i++) {
                                        if (book.contains(afm1)) {
                                          sum=sum+b.cost;
                                        }
                                    }
                                    System.out.println("The sumarized cost is"+sum);

                                    break;

                            }
                        }
                        break;
                    }
            }

        } while (ch >= 1 && ch <= 4);
        

    }
}
