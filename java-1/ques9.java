public class ques9 {
    enum houses{
        HOUSE1(2000),HOUSE2(1900);
private int price;
        houses(int p) {
            this.price=p;
        }
        int getPrice(){
            return this.price;
        }
    }
    public static void main(String[] args) {

    System.out.println("all house pricesare:");
    for(houses h: houses.values()){
        System.out.println("house name:"+h+"\tcost:"+h.getPrice());

    }

    }
}
