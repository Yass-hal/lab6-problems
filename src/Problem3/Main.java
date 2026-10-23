package Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter library capacity:");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Library library = new Library(capacity);

        library.add(new Novel("The Alchemist", "Paulo Coelho", 208, 95));
        library.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 223));

        int choice;

        do {
            System.out.println("1. Add a document");
            System.out.println("2. Display documents");
            System.out.println("3. Delete a document");
            System.out.println("4. Search a document");
            System.out.println("5. Display authors");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Choose document type:");
                    System.out.println("1. Book");
                    System.out.println("2. Novel");
                    System.out.println("3. Textbook");
                    System.out.println("4. Magazine");
                    System.out.println("5. Dictionary");

                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter title:");
                    String title = scanner.nextLine();

                    Document doc = null;

                    switch (type) {
                        case 1:
                        case 2:
                        case 3:
                            System.out.println("Enter author:");
                            String author = scanner.nextLine();

                            System.out.println("Enter number of pages:");
                            int pages = scanner.nextInt();
                            scanner.nextLine();

                            if (type == 1) {
                                doc = new Book(title, author, pages);
                            } else if (type == 2) {
                                System.out.println("Enter price:");
                                double price = scanner.nextDouble();
                                scanner.nextLine();
                                doc = new Novel(title, author, pages, price);
                            } else {
                                System.out.println("Enter level:");
                                String level = scanner.nextLine();
                                doc = new Textbook(title, author, pages, level);
                            }
                            break;

                        case 4:
                            System.out.println("Enter month:");
                            String month = scanner.nextLine();

                            System.out.println("Enter year:");
                            int year = scanner.nextInt();
                            scanner.nextLine();

                            doc = new Magazine(title, month, year);
                            break;

                        case 5:
                            System.out.println("Enter language:");
                            String language = scanner.nextLine();

                            doc = new Dictionary(title, language);
                            break;

                        default:
                            System.out.println("Invalid type");
                    }

                    if (doc != null) {
                        if (library.add(doc)) {
                            System.out.println("Document added");
                        } else {
                            System.out.println("Library is full");
                        }
                    }
                    break;

                case 2:
                    library.displayDocuments();
                    break;

                case 3:
                    System.out.println("Enter document number:");
                    int deleteNum = scanner.nextInt();

                    Document toDelete = library.document(deleteNum);

                    if (toDelete != null && library.delete(toDelete)) {
                        System.out.println("Document deleted");
                    } else {
                        System.out.println("Document not found");
                    }
                    break;

                case 4:
                    System.out.println("Enter document number:");
                    int searchNum = scanner.nextInt();

                    Document found = library.document(searchNum);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Document not found");
                    }
                    break;

                case 5:
                    library.displayAuthors();
                    break;

                case 0:
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        scanner.close();
    }
}