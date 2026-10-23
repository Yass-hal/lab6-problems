package Problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;
    public Library(int capacity){
        this.capacity=capacity;
        documents=new ArrayList<>();
    }
    public void displayDocument(){
        for (Document document:documents){
            System.out.println(document.getTitle());
        }

    }
    public boolean add(Document document){
        return documents.add(document);
    }
    public boolean delete(Document document){
        return documents.remove(document);
    }
    public Document document(int numRec){
        for (Document doc : documents) {
            if (doc.getNumRec() == numRec) {
                return doc;
            }
        }
        return null;
    }
    public void displayAuthors(){
        for (Document doc : documents) {
            if (doc instanceof Book) {
                Book book = (Book) doc;
                System.out.println(book.getAuthor());
            }
        }
    }


    public void displayDocuments() {
    }
}
