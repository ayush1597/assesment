public class ques11 {

    public static void main(String[] args) {
    ques11 main_bank=new ques11();
    main_bank.getDetails();
        SBI_bank sbi=new SBI_bank();
        ICICI_bank icici=new ICICI_bank();
        BOI_bank boi=new BOI_bank();
        sbi.getDetails();
        icici.getDetails();
        boi.getDetails();
    }
    private void getDetails() {
        System.out.println("\t\tbank name:default ");
        System.out.println("rate of interest: 4%");
        System.out.println("ifsc:SBIS");


    }
}





