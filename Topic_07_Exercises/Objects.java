/* 
 * Exercise 1
 * Objects Example
*/


public class Objects {
	// define the shout method
	public static void Garage() {

        String [] Cars = { "Lamborghini Veneno Roadster" , "Bugatti Veyron 16.4 Grand Sport Vitesse", "Koenigsegg Agera S",
        "Hennessey Venom GT", "Porsche 918 Spyder", "Rolls-Royce Phantom Extended Wheelbase","Ferrari F12berlinetta",
        "Bentley Mulsanne", "Aston Martin Vanquish", "Mercedes-Benz CL65 AMG Coupe" };
        System.out.println("The List of Cars");
        int [] Speed = new int[10];
        for ( int i=0; i<10; i++ ) {
            Speed[i]=i*5;
            if ( (i % 2)==0 ){
                System.out.println("\033[31m" + Cars[i] + " \t: Speed = " + Speed[i] );
            }
            else {
                System.out.println("\033[33m" + Cars[i] + " \t: Speed = " + Speed[i] );
            }
        }
        System.out.print("\033[0m");
    }

	public static void main(String[] args) {
		Garage();
	}
}
