## README: Planet List Project with RecyclerView in Kotlin

### Description

This project demonstrate the implementation of a planet list using Android's RecyclerView component, with Kotlin as the primary language. When clicking on a list item, detailed information about the selected planet is displayed.

### Features

* **Planet List:** Displays a list of planets in a RecyclerView.
* **Planet Details:** When clicking on a list item, navigates to a new screen displaying detailed information about the selected planet, such as name, mean diameter, surface gravity, etc.
* **Custom Layout:** Uses a custom layout for each list item, customizing the appearance of the list.

### Technologies Used

* **Kotlin:** Primary programming language of the project.
* **Android Studio:** Integrated development environment used.
* **RecyclerView:** Android component for efficiently displaying long lists.
* **XML Layout:** Creation of layouts for the user interface.

### Project Structure

* **MainActivity.kt:** Main activity layout, containing the RecyclerView.
* **planet_item.xml:** Custom layout for each list item.
* **PlanetAdapter.kt:** RecyclerView adapter to map planet data to list items.
* **Planet.kt:** Model class representing a planet.
* **InfoActivity.kt:** Activity to display planet details.
* **SolarSystemDatabase** A list of planets to represents database 

### How to Run the Project

1. **Clone the repository:**
   ```bash
   git clone https://github.com/huggoparcelly/solarsystem.git

2. **Open the project in Android Studio:**
    Open the cloned project folder in Android Studio.
3. **Configure the emulator or connect a physical device:**
    Choose a device to run the app.
4. **Run the app:**
    Click the "Run" button in Android Studio.