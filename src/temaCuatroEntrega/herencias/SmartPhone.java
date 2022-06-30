package temaCuatroEntrega.herencias;

import temaCuatroEntrega.clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    protected double pxCamaraFrontal;
    protected double pxCamaraTrasera;
    protected String usbTipo;
    private String tipoDatos;
    private boolean llamadaEnCurso;
    private Integer numeroLlamada = null;

    public SmartPhone() {
    }

    public SmartPhone(boolean nfc, boolean bluetooth, boolean wifi, String tipoDatos, String fabricante, String modelo, String procesador, int nNucleos, double pantalla, double pxCamaraFrontal, double pxCamaraTrasera, String usbTipo) {
        super(nfc, bluetooth, wifi, fabricante, modelo, procesador, nNucleos, pantalla);
        this.pxCamaraFrontal = pxCamaraFrontal;
        this.pxCamaraTrasera = pxCamaraTrasera;
        this.usbTipo = usbTipo;
        this.tipoDatos = tipoDatos;
    }

    public void llamada(int numero){
        this.numeroLlamada = numero;
        if(this.llamadaEnCurso){
            System.out.println("Actualmente hay una llamada en curso. Colgar primero");
        } else {
            System.out.println("Llamando el numero " + numero + "...");
            this.llamadaEnCurso = true;
        }
    };

    public void colgar(){
        if(!this.llamadaEnCurso){
            System.out.println("No hay ninguna llamada en curso...");
        } else {
            this.llamadaEnCurso = false;
            System.out.println("llamada terminada con el numero " + this.numeroLlamada);
        }
    }

    @Override
    public String toString() {
        return "SmartPhone{\n" +
                "pxCamaraFrontal=" + pxCamaraFrontal +
                ",\npxCamaraTrasera=" + pxCamaraTrasera +
                ",\nusbTipo='" + usbTipo + '\'' +
                ",\nllamadaEnCurso=" + llamadaEnCurso +
                ",\nnfc=" + nfc +
                ",\nbluetooth=" + bluetooth +
                ",\nwifi=" + wifi +
                ",\ntipoDatos='" + tipoDatos + '\'' +
                ",\nfabricante='" + fabricante + '\'' +
                ",\nmodelo='" + modelo + '\'' +
                ",\nprocesador='" + procesador + '\'' +
                ",\nnNucleos=" + nNucleos +
                ",pantalla=" + pantalla +
                "\n}";
    }
}
