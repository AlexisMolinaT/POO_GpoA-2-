package polimorfismo;

import POL.*;
public class SistemaNomina {

    
    public static void main(String[] args) {
        System.out.println("Se procesan empleados por separado");

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Alexis"," Molina","123",800.00);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision ("Ricardo"," Molina","720",2000,0.2,1900);
        EmpleadoPorComision empleadoPorComisiom = new EmpleadoPorComision ("Fernando"," Esparza","930",600,0.3);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras ("Valeria"," Perez","321",16.75,40);
        
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoAsalariado,"ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoBaseMasComision,"ingresos",empleadoBaseMasComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorComisiom,"ingresos",empleadoPorComisiom.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorHoras,"ingresos",empleadoPorHoras.ingresos());
        
        Empleado[] empleados = new Empleado[4];

    }
    }
    

