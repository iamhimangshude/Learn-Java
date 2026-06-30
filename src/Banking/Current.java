package Banking;

//public class Current {
//    private double overdraftLimit;
//
//    public Current(double overdraftLimit){
//        this.overdraftLimit = overdraftLimit;
//    }
//
//    @Override
//    public String toString(){
//        return "Current { overdraftLimit=" + overdraftLimit + '}';
//    }
//}


public record Current(double overdraftLimit){
    @Override
    public String toString() {
        return "Current{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
};