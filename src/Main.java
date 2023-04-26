public class Main {
    public static void main(String[] args) {
//        LibrarianImpl librarianImpl = new LibrarianImpl("John");
//        librarianImpl.overdueNotification();
//        librarianImpl.find();

        ReaderImpl readerImpl = new ReaderImpl("Carol");
        LibrarianImpl librarianImpl = new LibrarianImpl("John");
        librarianImpl.overdueNotification();
        librarianImpl.find();

        SupplierImpl supplierImpl = new SupplierImpl("Karen");
        supplierImpl.supply();
    }
}