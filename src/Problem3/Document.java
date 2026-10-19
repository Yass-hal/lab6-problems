package Problem3;

public class Document {
    private static int numEnreg=0;
    private int numRec;
    private String title;
    public Document(String title){
        this.numRec=numEnreg;
        this.title=title;
        numEnreg++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }
}
