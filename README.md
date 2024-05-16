# Achromatic Material

## Philosophy
Achromatic Material is an Android library that complements the Material Design 3 library for Jetpack Compose. Unlike the latter, Achromatic Material uses only shades of gray for design (the exception is red for errors). 
<img src="documentation-resources/Color palettes.png" />
This approach is easier to understand and allows you to create a user interface that does not conflict with content colors. The disadvantages are the lack of the ability to create a contrast in shade and the lack of support for dynamic themes.
## Installation (Not released yet)
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
    implementation("GROUP:NAME:VERSION")
}
```
Or using version catalog add library to `libs.versions.toml` file:
```toml
[versions]  
achromatic = "VERSION" 
  
[libraries]  
achromatic-material = { group = "GROUP", name = "NAME", version.ref = "achromatic" }
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
import androidx.compose.foundation.isSystemInDarkTheme  
import androidx.compose.runtime.Composable  
import com.yzghoba.achromatic.AchromaticTheme  
import com.yzghoba.achromatic.color.darkAchromaticColorScheme  
import com.yzghoba.achromatic.color.lightAchromaticColorScheme

@Composable  
fun ApplicationTheme(  
    darkTheme: Boolean = isSystemInDarkTheme(),  
    // Cannot be applied while you use Achromatic Material
    dynamicColor: Boolean = true,  
    content: @Composable () -> Unit,  
) {  
    val colorScheme = when {  
        darkTheme -> darkAchromaticColorScheme()  
        else -> lightAchromaticColorScheme()  
    }  
  
    AchromaticTheme(  
        colorScheme = colorScheme,  
        typography = Typography,  
        content = content,  
    )  
}
```
Optionally, you can also pass a Material `ColorScheme` as the `colorfulColorScheme` argument to the `AchromaticTheme` function if you can't opt out of using the standard Material Design 3 color scheme.
```kotlin
val colorfulColorScheme = when {
    dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {  
        val context = LocalContext.current  
        if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)  
    }

    darkTheme -> darkColorScheme()  
    else -> lightColorScheme()
}
  
AchromaticTheme(  
    colorScheme = colorScheme,
    colorfulColorScheme = colorfulColorScheme,  
    typography = Typography,  
    content = content,  
) 
```
To get an achromatic color scheme in your code, call the `colorScheme` function of the `AchromaticTheme` object:
```kotlin
Button(  
    onClick = { /*TODO*/ },  
    colors = ButtonDefaults.buttonColors(  
        containerColor = AchromaticTheme.colorScheme.achromatic,  
        contentColor = AchromaticTheme.colorScheme.onAchromatic,  
    ),  
) {  
    Text(text = "Submit")  
}
```
Achromatic Material provides achromatic alternatives for many [components](https://m3.material.io/components) from the Material Design 3 catalog. See achromatic components catalog below.
## Roadmap
- [ ] Update API documentation
- [ ] Add cover for README.md file
- [ ] Release library
    - [ ] Publish to JitPack
    - [ ] Publish to Maven
### Components catalog
<table>
    <tr>
        <th>Component</th>
        <th>Status</th>
    </tr>
    <tr>
        <td>Badges</td>
        <td>
            <img alt="Not planned" src="https://img.shields.io/badge/Not_planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Bottom app bar</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Bottom sheets</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Cards</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Carousel</td>
        <td>
            <img alt="Not planned" src="https://img.shields.io/badge/Not_planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Checkbox</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Chips</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Common buttons</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Date pickers</td>
        <td>
            <img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Dialogs</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Dividers</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Extended FAB</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Floating action buttons</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Icon buttons</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Lists</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Menus</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Navigation bar</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Navigation drawer</td>
        <td>
            <img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Navigation rail</td>
        <td>
            <img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Progress indicators</td>
        <td>
            <img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Radio button</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Search</td>
        <td>
            <img alt="Not planned" src="https://img.shields.io/badge/Not_planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Segmented button</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Side sheets</td>
        <td>
            <img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Sliders</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Snackbar</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Switch</td>
        <td>
            <img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
        </td>
    </tr>
    <tr>
        <td>Tabs</td>
        <td>
            <img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Text fields</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
    <tr>
        <td>Time pickers</td>
        <td>
            <img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Tooltips</td>
        <td>
            <img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
        </td>
    </tr>
    <tr>
        <td>Top app bars</td>
        <td>
            <img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
        </td>
    </tr>
</table>

