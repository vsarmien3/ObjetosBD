
package clases1;


public class Persona {
    private long identificacion;
    private String primer_nombre;
    private String primer_apellido;
    private String sexo;
    
    public Persona(long identificacion, String primer_nombre, String primer_apellido, String sexo){
    this.identificacion = identificacion;
    this.primer_nombre = primer_apellido;
    this.primer_apellido = primer_apellido;
    this.sexo = sexo;
    
    
}
    
    public long getIdentificacion(){
        return this.identificacion;
        }
    
    public String getPrimer_nombre(){
        return this.primer_apellido;
    }
    
    public String getPrimer_apellido(){
        return this.primer_apellido;
    }

    public String getSexo() {
        return sexo;
    }
   
    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }
    
    public void setPrimer_nombre(String primer_nombre){
        this.primer_nombre = primer_nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
