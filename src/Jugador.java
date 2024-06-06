public class Jugador {
    private String usuario;
    private String clave;
    private String nombre;
    
    public Jugador (){
        setUsuario("mxavc");
        setClave("1234");
        setNombre("marlon");
        // this.usuario = "";
        // this.clave = "";
        // this.nombre = "";
    }

    public Boolean Login(){
        String usuario = "";
        String clave   = "";
        System.out.println("Ingreso al juego");
        System.out.print("Ingresa usuario: ");
        usuario = App.sc.nextLine();
        System.out.print("Ingresa la clave: ");
        clave = App.sc.nextLine();
        if(getUsuario().equals(usuario) && getClave().equals(clave))
            return true;
        
        return false;
    }
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
