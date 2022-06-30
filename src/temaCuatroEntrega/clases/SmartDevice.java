package temaCuatroEntrega.clases;

public abstract class SmartDevice {
    protected boolean nfc;
    protected boolean bluetooth;
    protected boolean wifi;

    protected String fabricante;
    protected String modelo;
    protected String procesador;
    protected int nNucleos;
    protected double pantalla;

    public SmartDevice(){

    };

    public SmartDevice(boolean nfc, boolean bluetooth, boolean wifi, String fabricante, String modelo, String procesador, int nNucleos, double pantalla) {
        this.nfc = nfc;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.procesador = procesador;
        this.nNucleos = nNucleos;
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "nfc=" + nfc +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", nNucleos=" + nNucleos +
                ", pantalla=" + pantalla +
                '}';
    }
}
