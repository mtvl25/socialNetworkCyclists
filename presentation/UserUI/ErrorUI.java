package presentation.UserUI;

public class ErrorUI {

    public static final String ERROR_INVALID_NAME = """
        ╔══════════════════════════════════════════════╗
        ║                   ¡ERROR!                    ║
        ╠══════════════════════════════════════════════╣
        ║ El nombre no puede estar vacío o inválido    ║
        ╚══════════════════════════════════════════════╝
        """;

    public static final String ERROR_INVALID_AGE = """
        ╔══════════════════════════════════════════════════╗
        ║                   ¡ERROR!                        ║
        ╠══════════════════════════════════════════════════╣
        ║ La edad debe ser un número entero positivo(15-90)║
        ╚══════════════════════════════════════════════════╝
        """;

    public static final String ERROR_INVALID_CYCLING_TYPE = """
        ╔══════════════════════════════════════════════╗
        ║                   ¡ERROR!                    ║
        ╠══════════════════════════════════════════════╣
        ║ Seleccione una opción válida (1–4)           ║
        ╚══════════════════════════════════════════════╝
        """;

    public static final String ERROR_INVALID_LOCATION = """
        ╔══════════════════════════════════════════════╗
        ║                   ¡ERROR!                    ║
        ╠══════════════════════════════════════════════╣
        ║ La ubicación no puede quedar vacía           ║
        ╚══════════════════════════════════════════════╝
        """;

    public static final String ERROR_CREATING_USER = """
        ╔═════════════════════════════════════════════╗
        ║                   ¡ERROR!                   ║
        ╠═════════════════════════════════════════════╣
        ║ Se presentó un error creando el usuario     ║
        ╚═════════════════════════════════════════════╝
        """;

    public static final String ERROR_UPDATING_USER = """
        ╔══════════════════════════════════════════════╗
        ║                   ¡ERROR!                    ║
        ╠══════════════════════════════════════════════╣
        ║ Se presentó un error Actualizando el usuario ║
        ╚══════════════════════════════════════════════╝
        """;
}
