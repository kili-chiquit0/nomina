Sistema de Nómina en Java

## Descripción del Proyecto
Este proyecto corresponde a la **Unidad 3 de la asignatura de Análisis y Diseño de Software**, y consiste en el desarrollo de un **sistema de nómina** implementado en **Java**, aplicando los principios de la **Programación Orientada a Objetos (POO)**, los **principios SOLID** y las **buenas prácticas de programación**.

El sistema permite gestionar distintos tipos de empleados (asalariados, por horas, por comisión y temporales) y calcular automáticamente su salario, beneficios y deducciones según las reglas de negocio establecidas.

---

## ⚙️ Tecnologías Utilizadas
- Lenguaje: **Java SE**
- Entorno de desarrollo: **Visual Studio Code**
- Control de versiones: **Git y GitHub**
- Paradigma: **Programación Orientada a Objetos (POO)**
- Principios de diseño: **SOLID**

---

## Estructura del Sistema
- **Employee.java:** Clase abstracta base con los atributos y métodos comunes.
- **SalariedEmployee.java:** Empleado asalariado con bono por antigüedad.
- **HourlyEmployee.java:** Empleado por horas con pago de horas extra.
- **CommissionEmployee.java:** Empleado por comisión con bonificaciones por ventas.
- **TemporaryEmployee.java:** Empleado temporal sin beneficios adicionales.
- **DeductionCalculator.java:** Calcula las deducciones (seguridad social, pensión, ARL, fondo de ahorro).
- **PayrollPrinter.java:** Imprime el resumen de nómina.
- **Main.java:** Clase principal para ejecutar y probar el sistema.

---

## Principios SOLID Aplicados
- **S - Responsabilidad Única:** Cada clase cumple una única función.
- **O - Abierto/Cerrado:** Se pueden agregar nuevos tipos de empleados sin modificar las clases existentes.
- **L - Sustitución de Liskov:** Las subclases pueden reemplazar a la clase `Employee` sin problemas.
- **I - Segregación de Interfaces:** Solo se implementan los métodos necesarios.
- **D - Inversión de Dependencias:** `Employee` depende de abstracciones, no de clases concretas.
--
## Reglas de Negocio
- **Asalariado:** Bono del 10% si > 5 años, más bono de alimentación de $1.000.000.
- **Por Horas:** Horas extra al 150%, fondo de ahorro opcional del 2%.
- **Por Comisión:** Bono adicional del 3% si ventas > $20.000.000.
- **Temporal:** Sin bonos ni beneficios adicionales.
- **Deducciones:** 4% (seguro/pensión) + 1.5% (ARL).
---
##Pruebas y Ejecución
### Compilación:
java Main
Ana Perez (E-001) - Años: 6 - Base: 4000000,00
Salario Bruto: 4000000,00
Beneficios: 1400000,00
Deducciones: 220000,00
Salario Neto: 5180000,00
--------------------------------------------------
--------------------------------------------------
Luis Gomez (E-002) - Años: 2 - Base: 0,00
Salario Bruto: 1187500,00
Beneficios: 0,00
Deducciones: 89062,50
Salario Neto: 1098437,50
--------------------------------------------------
--------------------------------------------------
María Ruiz (E-003) - Años: 3 - Base: 1500000,00
Salario Bruto: 2750000,00
Beneficios: 1750000,00
Deducciones: 151250,00
Salario Neto: 4348750,00
--------------------------------------------------
--------------------------------------------------
Pablo Toro (E-004) - Años: 0 - Base: 2200000,00
Salario Bruto: 2200000,00
Beneficios: 0,00
Deducciones: 121000,00
Salario Neto: 2079000,00
--------------------------------------------------
