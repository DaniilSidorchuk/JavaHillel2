package Task22;

import java.util.ArrayList;

public class Payment {

  private int amount = 0;
  private int id;
  private String payer;
  private ArrayList <Product> list = new ArrayList();

    public Payment() {
        id = (int) (Math.random() * 1000000);
    }

    public void printPayment (){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1 + ") " + list.get(i).getName() + " " + list.get(i).getQtty() + "PC " + list.get(i).getPrice() + " for each " + " amount: "
                    + list.get(i).getPrice()*list.get(i).getQtty()  );
        }
        System.out.println("Total amount of the payment " + amount);
    }

    public void paymentInfo(){
        System.out.println("Payer: " + payer);
        System.out.println("Payment ID: " + id);
        System.out.println("Paymant amount: " + amount);
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public void add (Product product){
        this.amount+=product.getPrice()*product.getQtty();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(product)){
                this.list.get(i).setQtty( this.list.get(i).getQtty()+product.getQtty());
                return;
            }

        }
        this.list.add(product);
    }

    public void remove (Product product){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getQtty()<=product.getQtty()){
                amount -= list.get(i).getPrice()*list.get(i).getQtty();
                list.remove(i);
                return;
            } else {
                amount -= list.get(i).getPrice()*product.getQtty();
                list.get(i).setQtty(list.get(i).getQtty()-product.getQtty());
            }
        }
    }

    static class Product {
       private String name;
       private String id;
       private int price;
       private int qtty;

       public Product(String name, int qtty, int price) {
           this.name = name;
           this.qtty = qtty;
           this.price = price;
       }

       public String getName() {
           return name;
       }

       public String getId() {
           return id;
       }

       public int getPrice() {
           return price;
       }

       public int getQtty() {
           return qtty;
       }

        public void setQtty(int qtty) {
            this.qtty = qtty;
        }

        @Override
       public boolean equals(Object obj) {
           if (obj==null) return false;
           if (obj instanceof Product){
               obj = (Product) obj;
           } else return false;

           return ((Product) obj).getName().equals(this.getName())&&((Product) obj).getId().equals(this.getId())&&((Product) obj).getPrice()==this.getPrice()?true:false;
       }
   }

    public static void main(String[] args) {
        Payment list = new Payment();
        list.add(new Product("Ball", 14, 55));
        list.add(new Product("doll", 8, 79));
        list.add(new Product("disc", 4, 7));
        list.add(new Product("shirt", 5, 19));
        list.printPayment();
        list.remove(new Product("Ball", 14, 55));
        list.printPayment();
        list.paymentInfo();
    }

}

