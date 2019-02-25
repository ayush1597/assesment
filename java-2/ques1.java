//1. Create Java classes having suitable attributesfor Library management system.
// Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
import java.util.Calendar;
import java.util.Date;
abstract class Library {
        protected String lib_name;
        protected String lib_address;
        public Library() {
        lib_name="India Library";
        lib_address="Noida Sector 127";
    }
    abstract void getLibraryInfo();
}
interface LibraryProp {
    long lib_seatcap=5000;
    void issueBook();
    void returnBook();
}
class Lib extends Library implements LibraryProp {
    private String Member_name;
    private String Member_mobile;
    private String book_name;
    private Date issue_date;
    private Date return_date;

    public Lib(String m_name, String m_no, String b_name) {
        Member_name = m_name;
        Member_mobile = m_no;
        book_name = b_name;
    }

    @Override
    public void getLibraryInfo() {
        System.out.println("--------Library Details----------");
        System.out.println("Library Name: " + lib_name);
        System.out.println("Library Address: " + lib_address);
        System.out.println("Library Seating Capacity: " + lib_seatcap);
    }

    @Override
    public void issueBook() {
        Date curr_date = new Date();
        issue_date = curr_date;
        Calendar C = Calendar.getInstance();
        C.add(Calendar.DATE, 7);//--------
        return_date = C.getTime();
        System.out.println("Success! Book issued to " + Member_name + " on " + curr_date.toString() + " return date is on " + return_date);
    }

    @Override
    public void returnBook() {
        if (issue_date == null || return_date == null) {
            System.out.println("\nNo book has been issued!");
        } else {
            issue_date = null;
            return_date = null;
            System.out.println("Book has been returned successfully!");
        }
    }

    public void getMemberDetails() {
        if (issue_date == null || return_date == null) {
            System.out.println("Member Name: " + Member_name);
            System.out.println("Member Mobile: " + Member_mobile);
            System.out.println("Book Name: " + book_name);
            System.out.println("\nNo Book Has Been Issued!");
        } else {
            System.out.println("Member Name: " + Member_name);
            System.out.println("Member Mobile: " + Member_mobile);
            System.out.println("Book Name: " + book_name);
            System.out.println("Book Issue Date: " + issue_date);
            System.out.println("Book Return Date: " + return_date);
        }
    }
}
    class ques1 {
        public static void main(String[] args) {
            Lib l = new Lib("ayush", "9690665522", "Book1");
            Lib l2 = new Lib("arjit", "9643218533", "Book2");
            l.issueBook();
            l.returnBook();
            l.getMemberDetails();
            l2.issueBook();
            l2.returnBook();
            l2.getMemberDetails();
        }
    }

