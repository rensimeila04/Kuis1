package handphone;

public class DemoHp {
    public static void main(String[] args) {
        HandPhone hp = new HandPhone("121238371", "Iphone 15", "IOS 18");
        hp.info();

        System.out.println();
        hp.tambahVolume();

        System.out.println();
        hp.power();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.info();

        System.out.println();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.kurangVolume();
        hp.info();

        System.out.println();
        hp.tambahVolume();
        hp.tambahVolume();
        hp.mute();
        hp.info();

        System.out.println();
        hp.mute();
        hp.info();
    }
}
