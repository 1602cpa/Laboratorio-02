import java.util.Scanner;

public class SNACKWELL {
	
	private int moneda=0;
	private int precio=0;
	private int opcion=0;
	

	public void addMoneda()
	{
		@SuppressWarnings("resource")
		Scanner ja = new Scanner(System.in);
		
		System.out.println(">> >> BIENVENIDO A TU MAQUINA SNACKWELL << <<");
		System.out.println(">> > Inserte Monedas de 10.00 & 25.00 < <<");
				moneda=ja.nextInt();
				
			
	}
	
	public void menu(){
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

				addMoneda();
				int aux=moneda;
				 if(moneda<10)
				 {
					 
					 System.out.println("Inserte Monedas\n");
			 
			addMoneda();
			moneda=moneda+aux;
				 }
				
				do{
				System.out.println("Monedas Disponibles: "+ moneda);
				
		System.out.println("\tSNACKWELL");
		System.out.println("TIPO DE ARTICULO     | Precio\n");
		System.out.println("1.Platanitos         | RD$30.00");
		System.out.println("2.Yuquitas	     | RD$35.00");
		System.out.println("3.M & M 	     | RD$60.00");
		System.out.println("4.Mas Mas 	     | RD$25.00");
		System.out.println("5.Salir");
		System.out.print("Elija un articulo: ");opcion=sc.nextInt();
	switch (opcion)
			{
				case 1 :
				if(moneda<30)
				{
				System.out.println("no tiene moneda suficiente");
				menu();			
				}
				System.out.println("Ha Elegido Platanitos");
				precio =30;
				moneda=moneda-precio;
				System.out.println("\nPuedes disfrutar de tu articulo");
				System.out.println("Gracias por elegirnos\n");	
				break;
				case 2 :
				if(moneda<35)
				{
				System.out.println("no tiene moneda suficiente");
				menu();			
				}
				System.out.println("Ha Elegido Yuquitas");
				precio =35;
				
				moneda=moneda-precio;		
				System.out.println("\nPuedes disfrutar de tu articulo");
					System.out.println("Gracias por elegirnos\n");
				break;
				case 3 :
				if(moneda<60)
				{
				System.out.println("no tiene moneda suficiente");
				addMoneda();
				moneda=moneda+aux;			
				}
				System.out.println("Ha Elegido M & M");
				precio =60;
				moneda=moneda-precio;
				System.out.println("\nPuedes disfrutar de tu articulo");
				System.out.println("Gracias por elegirnos\n");
				break;
				case 4 :
				if(moneda<25)
				{
				System.out.println("no tiene moneda suficiente");
				menu();			
				}
	            System.out.println("Ha Elegido Mas Mas");
				precio =25;
				moneda=moneda-precio;
						System.out.println("\nPuedes disfrutar de tu articulo");
						System.out.println("Gracias por elegirnos\n");
					break;
					
				case 5 :
					menu();
						break;
					
					
				default:
				System.out.println("opcion invalida");	
				break;
			}
				}while(moneda>0);
	}
	


	public static void main(String[] args) {
	
		SNACKWELL Objs = new SNACKWELL();
		Objs.menu();
		
	}
	
}