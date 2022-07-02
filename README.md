## Despliegue de apps Spring Boot en Heroku

Crear archivo `system.properties` en el proyecto con el contenido:

```
java.runtime.version=15
```

1. Crear cuente en heroku.com y github.com
2. Tener configurado git en ele ordenador
   1. `git config --global user.name`
   2. `git config --global user.email`
3. Subir el proyecto a GitHub desde Intellij IDEA desde la opción: VSC > Share project on GitHub
4. Desde Heroku, crear app y elegir método GitHub y buscar el repositorio subido
5. Habilitar deploy autimático y ejecutar el deploy

