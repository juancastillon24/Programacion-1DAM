public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



    @Override
    public double getSalePrice(){
        if (length>20)
            return regularPrice*0.95;
        else return regularPrice*0.9;
    }

}
