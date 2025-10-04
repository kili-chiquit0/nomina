/**
 * Clase Main con ejemplos de ejecución.
 */
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new SalariedEmployee("Ana Perez", "E-001", 4_000_000.0, 6);
        PayrollPrinter.imprimirResumen(emp1);

        Employee emp2 = new HourlyEmployee("Luis Gomez", "E-002", 25_000.0, 45.0, 2, true);
        PayrollPrinter.imprimirResumen(emp2);

        Employee emp3 = new CommissionEmployee("María Ruiz", "E-003", 1_500_000.0, 3, 25_000_000.0, 0.05);
        PayrollPrinter.imprimirResumen(emp3);

        Employee emp4 = new TemporaryEmployee("Pablo Toro", "E-004", 2_200_000.0, 0);
        PayrollPrinter.imprimirResumen(emp4);
    }
}
