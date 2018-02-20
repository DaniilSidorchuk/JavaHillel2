package Task7;

public class Vehicle {

    private String maker;
    private String model;
    private String type;
    private String wayOfTransport;
    private int speed;
    private int capactity;

    public void move (){
        speed = 1;
        System.out.println("Is moving with speed " + speed);
    }

    void changeSpeed(char direction){
        if (direction == '+'){
            speedRaise();
        }
        if (direction == '-'){
            speedReduce();
        }

        System.out.println("Is moving with speed " + speed);

    };

    private void speedReduce (){
        speed--;
    }

    private void speedRaise (){
        speed++;
    }

    protected void signal (){

    }


    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWayOfTransport() {
        return wayOfTransport;
    }

    public void setWayOfTransport(String wayOfTransport) {
        this.wayOfTransport = wayOfTransport;
    }

    public int getCapactity() {
        return capactity;
    }

    public void setCapactity(int capactity) {
        this.capactity = capactity;
    }
}
