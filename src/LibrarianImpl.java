public class LibrarianImpl extends User implements Librarian, Administrator{

    public LibrarianImpl(String name) {
        super(name);
    }

    @Override
    public void order(){
        System.out.println(getName() + " orders a book");
    }

    @Override
    public void find(){
        System.out.println(getName() + " finds a book");
    }

    @Override
    public void give(){
        System.out.println(getName() + " gives a book");
    }




    @Override
    public void overdueNotification(){
        System.out.println(getName() + " notes about deadline");
    }

    @Override
    public String getName(){
        return name;
    }
}
