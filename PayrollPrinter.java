/** Imprime el resumen de nómina de cada empleado. */
public class PayrollPrinter {
    public static void imprimirResumen(Employee e) {
        System.out.println("--------------------------------------------------");
        System.out.println(e.toString());
        double bruto = e.calcularSalarioBruto();
        double beneficios = e.calcularBeneficios();
        double deducciones = DeductionCalculator.calcularTotalDeducciones(e);
        double neto = bruto + beneficios - deducciones;
        System.out.printf("Salario Bruto: %.2f%n", bruto);
        System.out.printf("Beneficios: %.2f%n", beneficios);
        System.out.printf("Deducciones: %.2f%n", deducciones);
        System.out.printf("Salario Neto: %.2f%n", neto);
        System.out.println("--------------------------------------------------");
    }
}
