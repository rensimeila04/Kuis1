package handphone;

/**
 * HandPhone
 */
public class HandPhone {
    private String noSeri;
    private String model;
    private String versiOs;
    private boolean on = false;
    private int volume = 0;
    private boolean isMuted;
    private int tmpVolume;

    public HandPhone() {
    }

    public HandPhone(String noSeri, String model, String versiOs) {
        this.noSeri = noSeri;
        this.model = model;
        this.versiOs = versiOs;
    }

    public void power() {
        if (on == false) {
            this.on = true;
            System.out.println("Handphone dinyalakan");
        } else {
            this.on = false;
            System.out.println("Handphone dimatikan");
        }
    }

    public void tambahVolume() {
        if (on == true) {
            if (this.volume <= 80) {
                this.volume += 20;
                System.out.println("Volume bertambah");
                System.out.println("Volume sekarang : " + this.volume);
            }else{
                this.volume = 100;
                System.out.println("Volume sudah maksimal");
            }
        } else {
            System.out.println("Handphone dalam keadaan mati, nyalakan terlebih dahulu!");
        }
    }

    public void kurangVolume() {
        if (on == true) {
            if (this.volume > 0) {
                this.volume -= 20;
                System.out.println("Volume berkurang");
                System.out.println("Volume sekarang: "+ this.volume);
            } else {
                this.volume = 0;
                System.out.println("Volume sudah nol");
            }
        } else {
            System.out.println("Handphone dalam keadaan mati, nyalakan terlebih dahulu!");
        }
    }

    public void mute() {
        if (!isMuted) {
            tmpVolume = this.volume;
            volume = 0;
            isMuted = true;
        } else {
            volume = tmpVolume;
            isMuted = false;
        }
    }

    public void info() {
        System.out.println("Nomor seri : " + this.noSeri);
        System.out.println("Model : " + this.model);
        System.out.println("Versi OS : " + this.versiOs);
        System.out.println("Status power : " + this.on);
        System.out.println("Volume : " + this.volume);
    }
}
