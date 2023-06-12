# ProyectoAvance Idea en lo que se basa el primer codigo (commit).
//Clase Vehiculo
-La clase Vehiculo contará con atributos básicos (color, marca, patente, tipoVehiculo, horaLlegada) para poder identificar fácilmente cada vehículo en caso de que se necesite, dentro de estos atributos, el más importante será la patente, ya que esta será la que nos ayude a identificar y validar que los vehículos registrados sean únicos (no hay dos vehículos que tengan la misma patente), este dato será primordial para hacer llamado del vehículo de forma fácil. También es importante el atributo horaLlegada, ya que nos dejará un registro de cuando llegó el vehículo, de esta forma cuando salga el vehículo, al ingresar la horaSalida, será fácilmente calculado el tiempo que estuvo en el estacionamiento.
-La clase Vehiculo contará también con métodos de apoyo que nos ayudará para la funcionalidad del programa, dentro de ellas encontramos “validarVehiculo()”, que nos permitirá tener vehículos únicos a través de la patente.


//Clase Encargado
-La clase Encargado cuenta con una consola en la que tiene una serie de opciones para el correcto funcionamiento del estacionamiento, en este caso contará con las opciones de, agregar vehículo (se añade a una lista), asociar un vehículo a una persona, quitar vehículo, ver estacionamientos disponibles, ver la lista de vehículos con su respectiva información (en caso de alguna emergencia).
-En la opción de asociar un vehículo a persona, nos será pedido la patente del vehículo, y se nos registrará en otra lista.
-Cabe recalcar que en la opción de quitar vehículo, será pedida la información de horaSalida, esto nos permitirá hacer el cálculo final de cuanto se le cobrará al usuario por el tiempo en que hizo uso del estacionamiento.


 //Clase Persona
-La clase Persona existe por si ocurre algún problema dentro del estacionamiento, y se necesita la información del usuario, es por ello que será necesario de atributos como nombre, apellido y número de contacto.
-Al estar asociado a un vehículo, en especialmente la patente, no será necesario alguna validación, ya que previamente la patente ya fué validada.

