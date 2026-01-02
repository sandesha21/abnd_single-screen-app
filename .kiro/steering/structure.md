# Project Structure

## Root Level
- **app/**: Main application module
- **gradle/**: Gradle wrapper files
- **screenshots/**: App screenshots for documentation
- **build.gradle**: Project-level build configuration
- **settings.gradle**: Project settings and module declarations

## App Module Structure

### Source Code (`app/src/`)
```
app/src/
├── main/
│   ├── java/com/example/lisasitalianrestaurant/
│   │   └── MainActivity.java              # Single activity entry point
│   ├── res/
│   │   ├── drawable*/                     # Image assets (multiple densities)
│   │   ├── layout/                        # XML layout files
│   │   ├── mipmap*/                       # App icons (multiple densities)
│   │   └── values/                        # String resources, colors, styles
│   └── AndroidManifest.xml                # App configuration
├── androidTest/                           # Instrumented tests
└── test/                                  # Unit tests
```

### Resource Organization

#### Drawable Assets
- **Multiple density support**: hdpi, mdpi, xhdpi, xxhdpi, xxxhdpi
- **Food images**: `italianfood.png`, `italianfood1.png`, `pizzaemoji.png`
- **App icons**: Launcher icons in mipmap directories

#### Values Resources
- **strings.xml**: All user-facing text (externalized for localization)
- **colors.xml**: App color palette
- **styles.xml**: Material Design theme customization
- **dimens.xml**: Dimension values for consistent spacing

## Package Structure
- **Base package**: `com.example.lisasitalianrestaurant`
- **Single activity**: MainActivity handles all UI logic
- **Simple architecture**: No complex patterns needed for single-screen app

## Naming Conventions
- **Package**: lowercase with dots
- **Classes**: PascalCase (e.g., MainActivity)
- **Resources**: snake_case (e.g., italian_food.png)
- **String keys**: snake_case (e.g., app_name, contact_phone)

## Key Files
- **MainActivity.java**: App entry point and UI controller
- **activity_main.xml**: Main layout file (in res/layout/)
- **strings.xml**: Centralized text resources
- **AndroidManifest.xml**: App permissions and configuration