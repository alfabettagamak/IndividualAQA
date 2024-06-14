public abstract class MultiPagesPublication implements Publication {

    protected int pages;
    protected String name;

    public MultiPagesPublication(){
        System.out.println("This is MultiPagesPublication");
    }

    public void open(int pageNUmber) {
        System.out.println("Open on page class MultiPagesPublication" + pageNUmber);
    }
}


