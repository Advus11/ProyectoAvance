import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Encargado {
    private List<Vehiculo> listaVehiculos;
    private List<String> listaPatentes;

    public Encargado() {
        listaVehiculos = new ArrayList<>();
        listaPatentes = new ArrayList<>();
    }

    public void agregarVehiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el color: ");
        String color = scanner.next();
        System.out.print("Ingrese la marca: ");
        String marca = scanner.next();
        System.out.print("Ingrese la patente: ");
        String patente = scanner.next();
        System.out.print("Ingrese el tipo de vehiculo: ");
        String tipoVehiculo = scanner.next();
        System.out.print("Ingrese la hora de llegada: ");
        String horaLlegada = scanner.next();

        Vehiculo vehiculo = new Vehiculo(color, marca, patente, tipoVehiculo, horaLlegada);
        listaVehiculos.add(vehiculo);

        System.out.println("Vehiculo agregado correctamente.");
    }

    public void asociarVehiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la patente del vehiculo: ");
        String patenteAsociar = scanner.next();
        // Buscar el vehiculo en la lista de vehiculos
        // Supongamos que lo encontramos y lo almacenamos en una variable llamada "vehiculoEncontrado"
        Vehiculo vehiculoEncontrado = buscarVehiculoPorPatente(patenteAsociar);

        if (vehiculoEncontrado != null) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el apellido de la persona: ");
            String apellido = scanner.next();
            System.out.print("Ingrese el numero de contacto de la persona: ");
            String numeroContacto = scanner.next();

            Persona persona = new Persona(nombre, apellido, numeroContacto);
            listaPatentes.add(vehiculoEncontrado.getPatente());

            System.out.println("Vehiculo asociado a persona correctamente.");
        } else {
            System.out.println("Vehiculo no encontrado.");
        }
    }

    public void quitarVehiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la patente del vehiculo a quitar: ");
        String patenteQuitar = scanner.next();
        // Buscar el vehiculo en la lista de vehiculos
        // Supongamos que lo encontramos y lo almacenamos en una variable llamada "vehiculoEncontrado"
        Vehiculo vehiculoEncontrado = buscarVehiculoPorPatente(patenteQuitar);

        if (vehiculoEncontrado != null) {
            listaVehiculos.remove(vehiculoEncontrado);
            System.out.println("Vehiculo eliminado correctamente.");
        } else {
            System.out.println("Vehiculo no encontrado.");
            return;
        }
    }

    private Vehiculo buscarVehiculoPorPatente(String patente) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                return vehiculo;
            }
        }
        return null;
    }

    public void verEstacionamientosDisponibles() {
        System.out.println("Estacionamientos disponibles: 10");
    }

    public void verListaVehiculos() {
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("------------------------------");
            System.out.println("Patente: " + vehiculo.getPatente());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Tipo vehiculo: " + vehiculo.getTipoVehiculo());
            System.out.println("------------------------------");
        }
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("------ Menu del Encargado ------");
            System.out.println("1. Agregar vehiculo");
            System.out.println("2. Asociar vehiculo a persona");
            System.out.println("3. Quitar vehiculo");
            System.out.println("4. Ver estacionamientos disponibles");
            System.out.println("5. Ver lista de vehiculos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarVehiculo();
                    break;
                case 2:
                    asociarVehiculo();
                    break;
                case 3:
                    quitarVehiculo();
                    break;
                case 4:
                    verEstacionamientosDisponibles();
                    break;
                case 5:
                    verListaVehiculos();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion inválida. Intente nuevamente.");
            }

            System.out.println();
        } while (opcion != 6);

        scanner.close();
    }
}

