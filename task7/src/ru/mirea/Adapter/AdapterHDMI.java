package Adapter;


public class AdapterHDMI extends HDMI {
    private USB plug;

    public AdapterHDMI(USB plug){
        this.plug = plug;
    }

}
