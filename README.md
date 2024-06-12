# Achromatic Material

## Philosophy

Achromatic Material is an Android library that complements the Material Design 3 library for Jetpack Compose. It provides color scheme based only on shades of gray (the exception is red for errors).

<img src="documentation-resources/Color palettes.png"/>

This approach is easier to understand and allows you to create a user interface that does not conflict with content colors. The disadvantages are the lack of the ability to create a contrast in shade and the lack of support for dynamic themes.

## Installation

1. Add support of JitPack repository in `settings.gradle.kts` file:

```kotlin
dependencyResolutionManagement {  
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)  
    repositories {  
        google()  
        mavenCentral()  
        maven { setUrl("https://jitpack.io") }  // Add jitpack  
    }  
}
```

2. Add dependency to your module `build.gradle.kts` file:

```kotlin
dependencies {
    implementation("com.github.yaroslavzghoba:AchromaticMaterial:2.0.0")
}
```

Or using version catalog add library to `libs.versions.toml` file:

```toml
[versions]  
achromatic = "2.0.0" 
  
[libraries]  
achromatic-material = { group = "com.github.yaroslavzghoba", name = "AchromaticMaterial", version.ref = "achromatic" }
```

And implement it in module `build.gradle.kts` file:

```kotlin
dependencies {
    implementation(libs.achromatic.material)
}
```

## Usage

Replace `MaterialTheme` function call with `AchromaticTheme` in `Theme.kt` file:

```kotlin
@Composable  
fun ApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Doesn't work while you use achromatic colors
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,  
) {
    // Original Material Design 3 color scheme
    // By default, it will be ignored. Pass false in the useAchromaticColors argument to switch to this color scheme  
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    } 
  
    AchromaticTheme(
        colorScheme = colorScheme,
        typography = Typography,  
        content = content,  
    )  
}
```

Optionally, you can also define your own achromatic palette and provide a preference to specify should the theme use the standard Material Design 3 color scheme or an achromatic scheme.

```kotlin
@Composable  
fun ApplicationTheme(
    useAchromaticColors: Boolean = true,
    darkTheme: Boolean = isSystemInDarkTheme(),  
    // Doesn't work while you use achromatic colors
    dynamicColor: Boolean = true,  
    content: @Composable () -> Unit,  
) {  
    // Original Material Design 3 color scheme
    // Will be applied if useAchromaticColors is false
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    
    // Achromatic color scheme
    // Will be applied if useAchromaticColors is true
    val achromaticScheme = when {  
        darkTheme -> lightAchromaticScheme()  
        else -> darkAchromaticScheme()  
    }  
  
    AchromaticTheme(  
        useAchromaticColors = useAchromaticColors,
        colorScheme = colorScheme,
        achromaticScheme = achromaticScheme,
        typography = Typography,  
        content = content,  
    )  
}
```

Achromatic Material doesn't provide any custom types. It just replace colors in exists ColorScheme from Material Design 3 library. So, you don't need to change your code anymore.

To check is the theme using achromatic colors use `areUsingAchromaticColors` function.

```kotlin
ApplicationTheme(
    useAchromaticColors = true,
) {
    println(areUsingAchromaticColors)  // true 
}
```
