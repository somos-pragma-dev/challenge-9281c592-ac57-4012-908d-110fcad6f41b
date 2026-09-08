# Desarrollo de una API REST para Gestión de Clientes

La empresa de fintech 'Fintech Solutions' necesita una API REST para gestionar la información de sus clientes. La API debe permitir la creación, lectura, actualización y eliminación de clientes. Los clientes tienen un identificador único, nombre, email y fecha de registro. La API debe asegurar que los emails sean únicos y válidos. Además, debe manejar adecuadamente los errores de validación y proporcionar documentación mediante Swagger.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot REST API |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del Modelo de Cliente

**Objetivo:** Definir el modelo de datos para los clientes y asegurar la unicidad y validez del email.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Crea un modelo de datos para representar a un cliente con los atributos mencionados.
- Asegura que el email sea único y válido antes de permitir la creación o actualización de un cliente.

**Entregable:** Modelo de datos de cliente con validaciones de unicidad y formato de email.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo representar y validar datos únicos en una base de datos.
- Piensa en cómo manejar errores de validación de forma efectiva.

</details>

### Fase 2: Implementación de los Endpoints REST

**Objetivo:** Implementar los endpoints REST para CRUD de clientes y asegurar que sigan las convenciones RESTful.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa los endpoints para crear, leer, actualizar y eliminar clientes.
- Asegura que los endpoints sigan las convenciones RESTful y manejen adecuadamente los errores.

**Entregable:** Endpoints REST funcionales para CRUD de clientes con manejo de errores.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre las mejores prácticas para el diseño de APIs RESTful.
- Considera cómo manejar diferentes tipos de errores y devolver respuestas apropiadas.

</details>

### Fase 3: Documentación con Swagger

**Objetivo:** Documentar la API utilizando Swagger para proporcionar una documentación clara y accesible.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configura Swagger para documentar la API.
- Asegura que la documentación sea clara, concisa y accesible para los usuarios de la API.

**Entregable:** Documentación completa de la API utilizando Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre la importancia de una documentación clara y accesible para las APIs.
- Considera cómo hacer que la documentación sea útil y fácil de entender para los usuarios.

</details>

### Fase 4: Pruebas y Mejoras

**Objetivo:** Realizar pruebas y mejorar la API basándose en los resultados de las pruebas.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Realiza pruebas exhaustivas de la API para asegurar que funcione correctamente.
- Identifica áreas de mejora y realiza las modificaciones necesarias.

**Entregable:** API mejorada y documentada, lista para su uso.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre la importancia de las pruebas en el desarrollo de APIs.
- Considera cómo identificar y abordar áreas de mejora en la API.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un modelo de datos y por qué es importante en el desarrollo de una API REST?
- **paraQueSirve**: ¿Para qué sirven los endpoints REST y cómo se utilizan en una API?
- **comoSeUsa**: ¿Cómo se usa Swagger para documentar una API y por qué es importante?
- **erroresComunes**: ¿Cuáles son los errores comunes al desarrollar una API REST y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el desarrollo de una API REST y cómo se pueden tomar de forma efectiva?

## Criterios de Evaluacion

- Definición correcta del modelo de datos para los clientes.
- Implementación de endpoints REST funcionales y que sigan las convenciones RESTful.
- Manejo adecuado de errores en los endpoints.
- Documentación clara y accesible de la API utilizando Swagger.
- Realización de pruebas exhaustivas y mejoras basadas en los resultados.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
