
package bst;

public class Empleado implements Comparable<Empleado> {
    
    private int id;
    private String nombre;
    private String puesto;
    private String despacho;

    public Empleado(int id, String nombre, String puesto, String despacho) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.despacho = despacho;
    }

    public int getId() { return id; }

    public String getNombre() { return nombre; }

    public String getPuesto() { return puesto; }

    public String getDespacho() { return despacho; }

    public void setId(int id) { this.id = id; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setPuesto(String puesto) { this.puesto = puesto; }

    public void setDespacho(String despacho) { this.despacho = despacho; }

    @Override
    public int compareTo(Empleado empl) {
        if (id == empl.id) {
            return 0;
        } else if (id < empl.id) {
            return -1;
        } else {
            return 1;
        }
    }
    
    @Override
    public String toString() { 
        return String.format("ID:%-6d Nombre:%-20s Puesto:%-20s Despacho:%-20s", id, nombre, puesto, despacho);
    }
    
} // fin clase Empleado
