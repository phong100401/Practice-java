package Practice.Ex2;

public class Flight {
    private int number;
    private String destinnation;

    public Flight(){
        number = 0;
        destinnation ="";
    }
    public Flight(int number, String destinnation){
        this.number = number;
        this.destinnation = destinnation;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestinnation() {
        return destinnation;
    }

    public void setDestinnation(String destinnation) {
        this.destinnation = destinnation;
    }
    public void display(){
        if(number > 0 ){
            System.out.println("Flight number is: "+number);
            System.out.println("Flight Destination is: "+destinnation);
        }else {
            number = 0;
            destinnation = "";
            System.out.println("Flight number is: "+number);
            System.out.println("Flight Destination is: "+destinnation);
        }
    }
}
