/**
 * Empleado por comisión:
 * - Salario base + comisión sobre ventas.
 * - Si ventas > 20.000.000 => bono adicional del 3% sobre ventas.
 * - Bono de alimentacion por ser empleado permanente.
 */
public class CommissionEmployee extends Employee {
    private double ventas;
    private double porcentajeComision;
    private static final double BONO_ALIMENTACION = 1_000_000.0;

    public CommissionEmployee(String nombre, String idEmpleado, double salarioBase, int anosEmpresa,
                              double ventas, double porcentajeComision) {
        super(nombre, idEmpleado, salarioBase, anosEmpresa);
        if (ventas < 0) throw new IllegalArgumentException("ventas no puede ser negativa");
        if (porcentajeComision < 0) throw new IllegalArgumentException("porcentajeComision no puede ser negativo");
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalarioBruto() {
        double comision = porcentajeComision * ventas;
        return salarioBase + comision;
    }

    @Override
    public double calcularBeneficios() {
        double bono = BONO_ALIMENTACION;
        if (ventas > 20_000_000.0) {
            bono += 0.03 * ventas;
        }
        return bono;
    }

    public double getVentas() { return ventas; }
}
