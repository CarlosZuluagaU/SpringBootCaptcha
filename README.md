# SpringBootCaptcha
Esta aplicación también cuenta con un fronted para mejor visualización donde se ve en la primera isntancia un espacio con el contenido que se encuentra en la base de datos, don todos los usuarios, después otra interfaz para poder registrar el nuevo usuario y automáticamente aparece en la base de datos.
Gestión de Empleados con Spring Boot y Google reCAPTCHA
Este es un proyecto de demostración que implementa un CRUD básico (Crear y Leer) para la gestión de empleados, construido con Spring Boot en el backend y Thymeleaf para la renderización de las vistas. La aplicación cuenta con una interfaz de usuario moderna y responsiva creada con Tailwind CSS y está asegurada con Google reCAPTCHA v3 para proteger el envío de formularios.

✨ Características Principales
Listar Empleados: Muestra una lista de todos los empleados registrados.

Crear Nuevos Empleados: Un formulario moderno para registrar nuevos empleados en el sistema.

Interfaz Moderna: Diseño oscuro, profesional y totalmente responsivo utilizando Tailwind CSS.

Integración Segura con reCAPTCHA: El formulario de creación está protegido por Google reCAPTCHA v3 para prevenir el spam y el abuso por parte de bots.

Validación en el Backend: El token de reCAPTCHA se valida en el servidor antes de procesar cualquier dato.

📸 Capturas de Pantalla
Vista Principal (Listado de Empleados)
Formulario de Creación de Usuario
🛠️ Tecnologías Utilizadas
Backend
Java 17

Spring Boot 3

Spring Web: Para crear la aplicación web y los endpoints REST.

Spring Data JPA: Para la persistencia de datos.

Thymeleaf: Como motor de plantillas para las vistas del servidor.

H2 Database: Base de datos en memoria para fines de demostración.

Maven / Gradle: Como gestor de dependencias y construcción del proyecto.

Frontend
HTML5

Tailwind CSS: Para un diseño moderno y responsivo.

Font Awesome: Para los iconos.

JavaScript: Para la lógica del lado del cliente.

Seguridad
Google reCAPTCHA v3

🚀 Puesta en Marcha y Configuración
Sigue estos pasos para ejecutar el proyecto en tu entorno local.

1. Prerrequisitos
Tener instalado JDK 17 o superior.

Tener instalado Maven o Gradle.

Tener una cuenta de Google para generar las claves de reCAPTCHA.

2. Clonar el Repositorio
git clone https://github.com/CarlosZuluagaU/SpringBootCaptcha.git
cd https://github.com/CarlosZuluagaU/SpringBootCaptcha.git

3. Configurar Google reCAPTCHA
Este es el paso más importante para que la aplicación funcione correctamente.

Ve a la Consola de Administración de Google reCAPTCHA.

Crea una nueva propiedad para tu sitio:

Etiqueta: Nombre que usted quiera

Tipo de reCAPTCHA: Selecciona reCAPTCHA v3.

Dominios: Añade localhost para poder hacer pruebas locales.

Acepta los términos y condiciones y haz clic en "Enviar".

Copia la Clave del sitio y la Clave secreta.

Actualizar el código con tus claves:
Clave Secreta (Backend):
Abre el archivo src/main/java/com/google/SpringBootRecaptcha/service/Impl/RecaptchaServiceImpl.java y reemplaza la clave en la siguiente línea:

private final String RECAPTCHA_SECRET = "TU_CLAVE_SECRETA_AQUI";

Clave del Sitio (Frontend):
Abre el archivo de tu formulario (form.html o similar) y reemplaza la clave en el botón de envío:

<button
    class="g-recaptcha ..."
    th:attr="data-sitekey='TU_CLAVE_DEL_SITIO_AQUI'"
    ...>
    Enviar
</button>

(Nota: En el código que generamos, la clave es 6LfPDo0rAAAAAE1LTUdKoexaX6gLAmMqGW6bZl_R. Debes reemplazarla por la tuya).

4. Ejecutar la Aplicación
Usando Maven:

mvn spring-boot:run

Usando Gradle:

./gradlew bootRun

5. Acceder a la Aplicación
Una vez que la aplicación se esté ejecutando, abre tu navegador y ve a:
http://localhost:8080

INFORMACION IMPORTANTE 
la clave que se encuentra en el poyecto para realizar el captcha ya no es fucniona, por terminos de privacidad y de google terms, pero si quieres que funcione en tu pc
tu debes crear la clave del captcha y reemplazar los valores existentes, esto hará que funcione correctamente, como los valores que yo tenía pertenecian al captcha que yo cree 
ahora los modificqué porque no puedo compartir ningún tipo de clave por normas de GitHub 

👤 Autor
Carlos Andrés Zuluaga Amaya

GitHub: CarlosZuluagaU

LinkedIn: www.linkedin.com/in/carlos-andres-zuluaga-699296307

📄 Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
