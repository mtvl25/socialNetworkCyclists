package com.example.socialnetworkcyclists.domain.repository
import com.example.socialnetworkcyclists.domain.model.CyclingType
import com.example.socialnetworkcyclists.domain.model.RegistrationFormState
import com.example.socialnetworkcyclists.domain.model.Route
import com.example.socialnetworkcyclists.domain.model.User

/*

 aquí definimos la interfaz del repositorio (por ejemplo UserRepository),
 que declara qué operaciones se pueden realizar (obtener usuarios, agregar amigo, etc.).
 Esta capa representa la lógica de negocio o reglas de la app, y no debe depender de detalles
 de infraestructura. Solo define contratos.



 IMPLEMENTACION DE CRUD

 CREATE
 READ
 UPDATE
 DELETE


 */
interface UserRepository {

    // CREATE
    fun createUser(form: RegistrationFormState):Boolean

    //READ
    //Evalua si existe un usuario ya registrado con el mismo username
    fun existsUserByUsername(username:String):Boolean

    fun findUserById(userId: String): User?

    /* BUSCAR POR POR  INTERES*/


    // --- Por Nombre ---
    /**
     * Devuelve  un Object con todos los usuarios filtrados por ´name´.
     *
     * @param name  String
     */
    fun findUserByName(name: String): User?

    // --- Por Ubicacion ---
    /**
     * Devuelve  un List con todos los usuarios filtrados por ´location´.
     *
     * @param location  String
     */
    fun findUsersByLocation(location: String): List<User>

    // --- Por Tipo de ciclismo ---
    /**
     * Devuelve  un List con todos los usuarios filtrados por ´cyclingType´.
     *
     * @param cyclingType  CyclingType
     */
    fun findUsersByPreferredCyclingType(cyclingType: CyclingType):List<User>

    // --- Por ruta favorita ---
    /**
     * Devuelve   un List con todos los usuarios filtrados por tipo de ´route´.
     *
     * @param route Route
     */
    fun findUsersByFavoriteRoute(route: Route): List<User>


    /* ORDENAR POR DE MAYOR A MENOR*/
    // --- Edad ---
    /**
     * Devuelve todos los usuarios ordenados por 'age'.
     *
     * @param ascending  true para orden ascendente, false para descendente
     */
    fun getAllUsersSortedByAge(ascending: Boolean = true): List<User>

    // --- Nombre ---
    /**
     * Devuelve todos los usuarios ordenados por 'username'.
     *
     * @param ascending  true para orden ascendente, false para descendente
     */
    fun getAllUsersSortedByUsername(ascending: Boolean = true): List<User>




    //UPDATE PENDING


    //DELETE
    fun deleteUser(userId: String):Boolean




}