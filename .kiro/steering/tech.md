# Technology Stack

## Build System
- **Gradle**: Android Gradle Plugin 3.5.0
- **Gradle Wrapper**: Used for consistent builds across environments

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

# Run instrumented tests
./gradlew connectedAndroidTest

# Run all tests
./gradlew check
```

## Development Notes
- Uses legacy Android Support Library (pre-AndroidX)
- Single activity architecture with MainActivity as entry point
- Material Design theming applied through styles.xml
- String externalization for localization support