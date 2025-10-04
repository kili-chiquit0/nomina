/**
 * Empleado por horas.
 * - Paga horas normales hasta 40.
 * - Horas extras (más de 40) a 1.5x tarifa.
 * - Puede aceptar acceso a fondo de ahorro (2% del salario) si tiene >1 año.
 */
public class HourlyEmployee extends Employee {
    private double horasTrabajadas;
    private double tarifaHora;
    private boolean aceptaFondoAhorro;

    public HourlyEmployee(String nombre, String idEmpleado, double tarifaHora, double horasTrabajadas,
                          int anosEmpresa, boolean aceptaFondoAhorro) {
        super(nombre, idEmpleado, 0.0, anosEmpresa);
        if (horasTrabajadas < 0) throw new IllegalArgumentException("horasTrabajadas no puede ser negativo");
        if (tarifaHora < 0) throw new IllegalArgumentException("tarifaHora no puede ser negativa");
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.aceptaFondoAhorro = aceptaFondoAhorro;
    }

    @Override
    public double calcularSalarioBruto() {
        double normales = Math.min(40.0, horasTrabajadas) * tarifaHora;
        double extra = 0.0;
        if (horasTrabajadas > 40.0) {
            extra = (horasTrabajadas - 40.0) * tarifaHora * 1.5;
        }
        return normales + extra;
    }

    @Override
    public double calcularBeneficios() {
        return 0.0;
    }

    public boolean aceptaFondoAhorro() { return aceptaFondoAhorro; }
    public double getHorasTrabajadas() { return horasTrabajadas; }
    public double getTarifaHora() { return tarifaHora; }
}
