/** Empleado temporal: salario fijo, sin bonos ni beneficios adicionales. */
public class TemporaryEmployee extends Employee {

    public TemporaryEmployee(String nombre, String idEmpleado, double salarioBase, int anosEmpresa) {
        super(nombre, idEmpleado, salarioBase, anosEmpresa);
    }

    @Override
    public double calcularSalarioBruto() { return salarioBase; }

    @Override
    public double calcularBeneficios() { return 0.0; }
}
