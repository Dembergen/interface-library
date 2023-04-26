public class SupplierImpl extends User implements Supplier, Reader, Administrator{

    public SupplierImpl(String name) {
        super(name);
    }

    @Override
    public void take(){
        System.out.println(getName() + " takes a book");
    }

    @Override
    public void bringBack(){
        System.out.println(getName() + " returns a book");
    }

    @Override
    public void find(){
        System.out.println(getName() + "finds a book");
    }

    @Override
    public void give() {
        System.out.println(getName() + " gives a book to another reader");
    }

    @Override
    public void overdueNotification() {
        System.out.println(getName() + " notes about deadline");
    }

    @Override
    public void supply(){
        System.out.println( getName() + " supplies a book");
    }

    @Override
    public String getName(){
        return name;
    }
}
