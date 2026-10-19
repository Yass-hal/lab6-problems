package Problem3;

public class Novel extends Book{
    private double price;
    public Novel(String title,String author,int nbrPages,double price){
        super(title,author,nbrPages);
        this.price=price;
    }

}
