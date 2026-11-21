# VitroGlass Icon Pack — Guía para generar el archivo .APK

Este paquete contiene el proyecto completo de Android listo para compilar en **.apk**, incluyendo todos los iconos PNG transparentes estilo vidrio minimalista (192x192 px), los SVG vectoriales y los filtros `appfilter.xml` compatibles con Nova, Lawnchair, Niagara, Hyperion, Smart Launcher, Action Launcher y Theme Park.

## Opción 1: Android Studio (Local)
1. Descomprime esta carpeta y ábrela en **Android Studio** (`File -> Open`).
2. Espera a que Gradle sincronice automáticamente.
3. Ve a `Build -> Build Bundle(s) / APK(s) -> Build APK(s)`.
4. Instala el archivo `app-debug.apk` generado en tu teléfono Android.

## Opción 2: Sin instalar nada (GitHub Actions)
1. Sube esta carpeta a un repositorio privado o público en GitHub.
2. El archivo `.github/workflows/build-apk.yml` compilará automáticamente tu **.apk** en la nube.
3. Descarga el artefacto `VitroGlass-IconPack-APK` desde la pestaña **Actions**.
