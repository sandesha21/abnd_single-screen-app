# Technology Stack

## Build System
- **Gradle**: Android Gradle Plugin 8.1.4
- **Gradle Wrapper**: 8.5 (supports Java 21)

## Android Configuration
- **Compile SDK**: 28 (Android 9.0 API level 28)
- **Min SDK**: 16 (Android 4.1 Jelly Bean)
- **Target SDK**: 28 (Android 9.0 API level 28)
- **Package**: `com.example.lisasitalianrestaurant`

## Dependencies
- **AppCompat**: `com.android.support:appcompat-v7:28.0.0` (Support library)
- **ConstraintLayout**: `com.android.support.constraint:constraint-layout:1.1.3`
- **JUnit**: `junit:junit:4.12` (Unit testing)
- **Espresso**: `com.android.support.test.espresso:espresso-core:3.0.2` (UI testing)

## Common Commands

### Build Commands
```bash
# Clean build
./gradlew clean

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Install debug build on connected device
./gradlew installDebug
```

### Testing Commands
```bash
# Run unit tests
./gradlew test

# Run instrumented tests (requires connected device/emulator)
./gradlew connectedAndroidTest

# Run all tests
./gradlew check
```

## Development Notes
- Uses legacy Android Support Library (pre-AndroidX) for educational consistency
- Single activity architecture with MainActivity as entry point
- Material Design theming applied through styles.xml
- String externalization for localization support
- Modern Gradle 8.5 with Java 21 compatibility
- Namespace defined in build.gradle instead of AndroidManifest.xml
- Lint checks configured to allow legacy library usage for student project