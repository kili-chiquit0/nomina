/**
 * Clase abstracta que define la estructura común para todos los empleados.
 * Implementa las operaciones principales que las subclases deben sobrescribir.
 */
public abstract class Employee {
    protected String nombre;
    protected String idEmpleado;
    protected double salarioBase;
    protected int anosEmpresa;

    public Employee(String nombre, String idEmpleado, double salarioBase, int anosEmpresa) {
        if (salarioBase < 0) throw new IllegalArgumentException("salarioBase no puede ser negativo");
        if (anosEmpresa < 0) throw new IllegalArgumentException("años en la empresa no puede ser negativo");
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
        this.anosEmpresa = anosEmpresa;
    }

    public String getNombre() { return nombre; }
    public String getIdEmpleado() { return idEmpleado; }
    public double getSalarioBase() { return salarioBase; }
    public int getAnosEmpresa() { return anosEmpresa; }

    public abstract double calcularSalarioBruto();
    public abstract double calcularBeneficios();

    public double calcularDeducciones() {
        double bruto = calcularSalarioBruto();
        return DeductionCalculator.calcularDeduccionesObligatorias(bruto);
    }

    public double calcularSalarioNeto() {
        double bruto = calcularSalarioBruto();
        double beneficios = calcularBeneficios();
        double deducciones = calcularDeducciones();
        double neto = bruto + beneficios - deducciones;
        if (neto < 0) {
            throw new IllegalStateException("El salario neto no puede ser negativo para el empleado " + idEmpleado);
        }
        return neto;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - Años: %d - Base: %.2f", nombre, idEmpleado, anosEmpresa, salarioBase);
    }
}
