
package p_generica;

public class Jefe extends Empleado {
    
    private double incentivo;
    
    public Jefe(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.incentivo = 0.0;
    }
    
    public Jefe(String nombre, int edad, double salario, double incentivo) {
        super(nombre, edad, salario);
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        String aux = super.toString().substring(8, super.toString().length() - 1);
        return "Jefe" + aux + " incentivo=" + incentivo + '}';
    }
    
    
}
