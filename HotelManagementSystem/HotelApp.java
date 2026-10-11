public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValet("RCH-420");
        frontDesk.requestHouseKeeping("Room 420");
        frontDesk.requestCart(2);
    }
}