/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncasafix;

/**
 *
 * @author Administrator
 */
public class aireAcondicionado {
    private float materiales;
    private float mano_obra;
    private float mts_cañeria;
    private String localidad;
    private boolean choice_mintegral;
    private boolean choice_inselectrica;
    private boolean choice_mensula;
    
    private boolean choice_mttointegral;
    private boolean choice_mttointerna;
    private boolean choice_cGas;
    private boolean choice_cCapacitor;
    private boolean choice_cComp;
    private boolean choice_cPlaca;
    private boolean choice_cRemoto;
    private boolean choice_Orep;

    public boolean isChoice_cGas() {
        return choice_cGas;
    }

    public void setChoice_cGas(boolean choice_cGas) {
        this.choice_cGas = choice_cGas;
    }

    public boolean isChoice_cCapacitor() {
        return choice_cCapacitor;
    }

    public void setChoice_cCapacitor(boolean choice_cCapacitor) {
        this.choice_cCapacitor = choice_cCapacitor;
    }

    public boolean isChoice_cComp() {
        return choice_cComp;
    }

    public void setChoice_cComp(boolean choice_cComp) {
        this.choice_cComp = choice_cComp;
    }

    public boolean isChoice_cPlaca() {
        return choice_cPlaca;
    }

    public void setChoice_cPlaca(boolean choice_cPlaca) {
        this.choice_cPlaca = choice_cPlaca;
    }

    public boolean isChoice_cRemoto() {
        return choice_cRemoto;
    }

    public void setChoice_cRemoto(boolean choice_cRemoto) {
        this.choice_cRemoto = choice_cRemoto;
    }

    public boolean isChoice_Orep() {
        return choice_Orep;
    }

    public void setChoice_Orep(boolean choice_Orep) {
        this.choice_Orep = choice_Orep;
    }
            

    public boolean isChoice_mttointerna() {
        return choice_mttointerna;
    }

    public void setChoice_mttointerna(boolean choice_mttointerna) {
        this.choice_mttointerna = choice_mttointerna;
    }

    public boolean isChoice_mttointegral() {
        return choice_mttointegral;
    }

    public void setChoice_mttointegral(boolean choice_mttointegral) {
        this.choice_mttointegral = choice_mttointegral;
    }

    public boolean isChoice_mensula() {
        return choice_mensula;
    }

    public void setChoice_mensula(boolean choice_mensula) {
        this.choice_mensula = choice_mensula;
    }

    public boolean isChoice_mintegral() {
        return choice_mintegral;
    }

    public void setChoice_mintegral(boolean choice_mintegral) {
        this.choice_mintegral = choice_mintegral;
    }

    public boolean isChoice_inselectrica() {
        return choice_inselectrica;
    }

    public void setChoice_inselectrica(boolean choice_inselectrica) {
        this.choice_inselectrica = choice_inselectrica;
    }

   
    
    public aireAcondicionado(){
        materiales= 0.0f;
        mano_obra= 0.0f;
        mts_cañeria= 0.0f;
        localidad= "";
    }

    public float getMateriales() {
        return materiales;
    }

    public void setMateriales(float materiales) {
        this.materiales = materiales;
    }

    public float getMano_obra() {
        return mano_obra;
    }

    public void setMano_obra(float mano_obra) {
        this.mano_obra = mano_obra;
    }

    public float getMts_cañeria() {
        return mts_cañeria;
    }

    public void setMts_cañeria(float mts_cañeria) {
        this.mts_cañeria = mts_cañeria;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public float calcularMantenimientoIntegral(){
        float costo_mintegral;
        
        if (choice_mintegral==true){
            costo_mintegral=1000.0f;
            
        }else{
            costo_mintegral=0;
        }
        return costo_mintegral;
    }
    public float calcularMaterialesxmetro(){
        float costo_materiales;
        float costo_m;
        costo_m=1200;
        costo_materiales= mts_cañeria*costo_m;
        
        return costo_materiales;
    }
    public float calcularInstalacionElectrica(){
        
        float costo_instalacion;
        costo_instalacion=800.0f;
       
        if(choice_inselectrica==true){
            return costo_instalacion;
        }else{
            costo_instalacion=0;
            return costo_instalacion;
        }
    }
    public float calcularViaticos(){
        float viaticos;
        
        switch(localidad){
            case "Rio Ceballos":
            case "Unquillo":
            case "Malagueño":
                viaticos=100.0f;
                break;
            case "Alta Gracia":
            case "Carlos Paz":
                viaticos= 700.0f;
                break;
            case "Santa Rosa de Calamuchita":
            case "Villa General Belgrano":
                viaticos=1600.0f;
                break;
            default:
                viaticos=0.0f;
                 break;
        }
        return viaticos;
    }
    
    public float calcularManodeObraInstalacion(){
        float obra_instalacion;
        obra_instalacion= 4500.0f;
        return obra_instalacion;
    }
    public float calcularMensula(){
        float costo_mensula;
        if(choice_mensula==true){
            costo_mensula=600;
            return costo_mensula;
        }else{
            costo_mensula=0;
            return costo_mensula;
        }
    }
    public float presupuestoTotalInstalacion(){
        float pTotalInstalacion;
        pTotalInstalacion= calcularMaterialesxmetro()+ calcularInstalacionElectrica()+ calcularViaticos() + calcularManodeObraInstalacion() +calcularMensula();
        return pTotalInstalacion;
    }
    public float calcularMtto(){
        float costo_mtto;
        if(choice_mttointegral==true && choice_mttointerna==false){
            costo_mtto=1500;
        }else{
            costo_mtto=0;
        }
        return costo_mtto;
                
    }
    public float calcularMttointerna(){
        float costo_mtto;
        if(choice_mttointegral==false && choice_mttointerna==true){
            costo_mtto=1000;
        }else{
            costo_mtto=0;
        }
        return costo_mtto;
                
    }
    public String informarErrorMtto(){
        String error_mtto;
        error_mtto="";
        if(choice_mttointegral==true && choice_mttointerna==true){
            error_mtto="Error, solo puede elegir como 'SI' una sola opción";
        }
        return error_mtto;
    }
    public float calcularPresMtto(){
    float pres_mtto;
    pres_mtto=calcularMttointerna()+calcularMtto();
    return pres_mtto;
}
    public float calcularcGas(){
        float carga_gas;
        if(choice_cGas==true){
            carga_gas=2800;
        }else{
            carga_gas=0;
        }
        return carga_gas;
    }
    public float calcularcCapacitor(){
        float cambio_capacitor;
        if(choice_cCapacitor==true){
            cambio_capacitor=2500;
        }else{
            cambio_capacitor=0;
        }
        return cambio_capacitor;
            
    }
    public float calcularcCompresor(){
        float cambio_cm;
        if(choice_cComp==true){
            cambio_cm=8500;
        }else{
            cambio_cm=0;
        }
        return cambio_cm;
            
    }
    public float calcularcRemoto(){
        float c_remoto;
        if(choice_cRemoto==true){
            c_remoto=1000;
        }else{
            c_remoto=0;
        }
        return c_remoto;
    }
    public float calcularcPlaca(){
        float c_placa;
        if(choice_cPlaca==true){
            c_placa=3500;
        }else{
            c_placa=0;
        }
        return c_placa;
    }
    public String solicitarPresupuesto(){
    String s_pres;
    s_pres="";
    if(choice_Orep==true){
        s_pres="Otras Reparaciones: Solicite un presupuesto a domicilio";
    }
    return s_pres;
}
    public float presupuestoReparacion(){
        float pres_rep;
        pres_rep= calcularcGas()+ calcularcCapacitor()+ calcularcCompresor()+ calcularcPlaca()+ calcularcRemoto();
        return pres_rep;
                
    }
    
}//Fin de la clase
