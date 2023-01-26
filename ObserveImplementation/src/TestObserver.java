public class TestObserver {
    public static void main(String[] args) {
        System.out.println("testowanie wzorca projektowego observator");
        Klient klient = new Klient("michał","kowlski","666325323");
        Klient klient2 = new Klient("maciej","nowak","66637423");

        ParkingSpot p1 = new ParkingSpot();
    p1.addObserver(klient);
    p1.addObserver(klient2);
    p1.removeObserver(klient2);
//    p1.notifyObservers("zmiana stanu miejsca " );
        System.out.println(klient.getMessage() + klient.getImie());
        System.out.println(klient2.getMessage() + klient2.getImie());


        ParkingSpot p2 = new ParkingSpot();
        p2.addObserver(klient);
        p2.addObserver(klient2);


    }
}
