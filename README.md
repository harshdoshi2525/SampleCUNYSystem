# SampleCUNYSystem

A small Java-based course registration system built around a simple student/registrar workflow. The project includes a browser-based UI for managing classes and a Java console app for the underlying registration logic.

## Overview

The Lunar System simulates a course registration experience for students at a university. It allows:

- Student login using a WebID
- Registrar login to register and deregister students
- Adding and dropping courses
- Viewing a student's courses sorted by course name or semester
- Seeing course enrollment by course code
- Saving browser state locally for demo use

A demo student login is available with WebID `123`, and the registrar login is `Registrar`.

## Project structure

- `src/LunarSystem.java` – Java entry point for the registration system
- `src/Student.java` – student model
- `src/Course.java` – course model
- `src/CourseNameComparator.java` – sorts by course name/department
- `src/SemesterComparator.java` – sorts by semester
- `src/lunar-system-baruch.html` – browser UI for the demo experience

## Prerequisites

- Java JDK 8 or newer
- A modern browser
- Optional: Python 3 for serving the HTML locally

## Run the Java project

From the project root:

```bash
cd /workspaces/SampleCUNYSystem
javac -d out src/*.java
java -cp out LunarSystem
```

## Run the browser UI

You can either:

1. Open `src/lunar-system-baruch.html` directly in a browser,
2. Open via Figma link: 'https://www.figma.com/make/G2JhQn5p8RaEobxHfeKrlJ/Improve-design-aesthetics?t=MuLDZ6o0oBuMC4fw-20&fullscreen=1', or
3. Serve the project locally:

```bash
cd /workspaces/SampleCUNYSystem
python3 -m http.server 8000
```

Then open:

- `http://localhost:8000/src/lunar-system-baruch.html`

## Demo usage

- Log in as `123` to view the student dashboard
- Log in as `Registrar` to register or remove students and check enrollment
- Use the UI to add classes, drop classes, and sort your schedule

## Notes

- The browser demo stores data in `localStorage`.
- The Java console version is a simplified version of the same registration workflow.
- This project is intended as a learning/demo application rather than a production-grade registration platform.
