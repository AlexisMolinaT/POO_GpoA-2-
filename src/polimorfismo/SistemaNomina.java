package polimorfismo;

import POL.*;
public class SistemaNomina {

    
    public static void main(String[] args) {
        /*
        System.out.println("----->Se procesan empleados por separado<-----");

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Alexis"," Molina","123",800.00);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision ("Ricardo"," Molina","720",2000,0.2,1900);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision ("Fernando"," Esparza","930",600,0.3);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras ("Valeria"," Perez","321",1000,40);
        
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoAsalariado,"ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoBaseMasComision,"ingresos",empleadoBaseMasComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorComision,"ingresos",empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorHoras,"ingresos",empleadoPorHoras.ingresos());
        
        Empleado[] empleados = new Empleado[4];
        empleados[0]=empleadoAsalariado;
        empleados[1]=empleadoBaseMasComision;
        empleados[2]=empleadoPorComision;
        empleados[3]=empleadoPorHoras;
        
        
        for(Empleado empleadoActual:empleados){
            //se invoca el metodo toString (ayuda a obetener los valores del objeto)
            System.out.println(empleadoActual);
            if(empleadoActual instanceof EmpleadoBaseMasComision){
            EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision)empleadoActual;
            empleado.establecerSalarioBase(1.10*empleado.obtenerSalarioBase());
            System.out.printf("El nuevo salario base con 10%% de incremento es: $%,.2f\n",empleado.obtenerSalarioBase());
        }
            System.out.printf("Ingresos $%,.2f\n\n",empleadoActual.ingresos());
        }
        //se crea un for para obtener el nombre del tipo de cada objeto en el arreglo empleados
        
        System.out.println("----->Se procesan empleados (en un arreglo)<-----");
        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("El empleado %d es un %s\n",j,empleados[j].getClass().getName());
        }*/
        
        //uso de nterface por pagar
      PorPagar[] objetosPorPagar = new PorPagar[4]; 
   
  // se llama al arreglo con objetos que implementan la interfaz: "PorPagar" 

  objetosPorPagar[0]= new Factura("0123","silla",2,375.00); 
  objetosPorPagar[1]= new Factura("01234","escritorio",3,79.55); 

   

  objetosPorPagar[2]= new EmpleadoAsalariado("Alexis ","Molina ","1111",800.00); 
  objetosPorPagar[3]= new EmpleadoAsalariado("Valeria "," Perez ","2222",1800.00); 

   

        System.out.println("Facturas y Empleados procesados en forma polimorfica: \n"); 
  // se procesan de forma generica cada elemento del arreglo "objetosPorPagar". 

   

    for(PorPagar porPagarActual:objetosPorPagar){ 
        // se imprime por Pagar Actual y su  monto de pago apropiado 
        
        System.out.printf("%s \n%s: $%,.2f\n\n",porPagarActual.toString(),"Pago vencido",porPagarActual.obtenerMontoPago()); 

    } 
                    
        }
        
      
    }

    
    
    

