package temaCuatroEntrega;

import temaCuatroEntrega.clases.SmartDevice;
import temaCuatroEntrega.herencias.SmartPhone;
import temaCuatroEntrega.herencias.SmartWatch;

public class TemaCuatroMain {
    public static void main(String[] args) {
        SmartPhone p20 = new SmartPhone(true, true, true, "5G", "Huawei", "P20", "Snapdragon",4,13.2,18,12,"TypeC");
        System.out.println(p20);
        p20.llamada(55555555);
        p20.llamada(66666666);
        p20.colgar();
        p20.llamada(66666666);
        p20.colgar();

        SmartWatch miBand5 = new SmartWatch(true, true, false, "Xiaomi", "6", "SDx2", 4, 6, false);
        System.out.println(miBand5);
    }
}
