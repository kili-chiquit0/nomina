/** Empleado asalariado (salario fijo mensual). */
public class SalariedEmployee extends Employee {
    private static final double BONO_ALIMENTACION = 1_000_000.0;

    public SalariedEmployee(String nombre, String idEmpleado, double salarioBase, int anosEmpresa) {
        super(nombre, idEmpleado, salarioBase, anosEmpresa);
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioBase;
    }

    @Override
    public double calcularBeneficios() {
        double bono = 0.0;
        if (anosEmpresa > 5) {
            bono += 0.10 * salarioBase; // bono mensual 10% si > 5 años
        }
        bono += BONO_ALIMENTACION;
        return bono;
    }
}
