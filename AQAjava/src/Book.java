public class Book extends MultiPagesPublication{

    public int pages;
    public String name;

    public Book(String name, int page){
        super();
        this.name = name;
        this.pages = page;
    }

    @Override
    public void open(int pageNUmber){
        System.out.println("Open on page class Book " + pageNUmber);
        System.out.println("Ostatok " + (this.pages - pageNUmber));
    }

    @Override
    public String toString() {
        return super.toString() + "OLOLOLO";
    }
}
