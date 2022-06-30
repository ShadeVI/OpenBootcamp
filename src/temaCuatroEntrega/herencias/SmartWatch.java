package temaCuatroEntrega.herencias;

import temaCuatroEntrega.clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    protected boolean llamadas;

    public SmartWatch(){};

    public SmartWatch(boolean nfc, boolean bluetooth, boolean wifi, String fabricante, String modelo, String procesador, int nNucleos, double pantalla, boolean llamadas) {
        super(nfc, bluetooth, wifi, fabricante, modelo, procesador, nNucleos, pantalla);
        this.llamadas = llamadas;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "\nllamadas=" + llamadas +
                ",\nnfc=" + nfc +
                ",\nbluetooth=" + bluetooth +
                ",\nwifi=" + wifi +
                ",\nfabricante='" + fabricante + '\'' +
                ",\nmodelo='" + modelo + '\'' +
                ",\nprocesador='" + procesador + '\'' +
                ",\nnNucleos=" + nNucleos +
                ",\npantalla=" + pantalla +
                "\n}";
    }
}
