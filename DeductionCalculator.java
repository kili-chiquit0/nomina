/**
 * Clase utilitaria para calcular deducciones obligatorias y otras deducciones.
 */
public class DeductionCalculator {
    public static final double PORC_SEG_SOC_PENSION = 0.04; // 4%
    public static final double ARL_RATE = 0.015; // 1.5%
    public static final double FONDO_AHORRO_RATE = 0.02; // 2%

    public static double calcularDeduccionesObligatorias(double salarioBruto) {
        double seguroYPension = PORC_SEG_SOC_PENSION * salarioBruto;
        double arl = ARL_RATE * salarioBruto;
        return seguroYPension + arl;
    }

    public static double calcularTotalDeducciones(Employee emp) {
        double bruto = emp.calcularSalarioBruto();
        double base = calcularDeduccionesObligatorias(bruto);

        if (emp instanceof HourlyEmployee) {
            HourlyEmployee h = (HourlyEmployee) emp;
            if (h.getAnosEmpresa() > 1 && h.aceptaFondoAhorro()) {
                base += FONDO_AHORRO_RATE * bruto;
            }
        }
        return base;
    }
}
