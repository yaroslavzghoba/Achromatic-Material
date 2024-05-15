# Achromatic Material

## Philosophy
Achromatic Material is an Android library that complements the Material Design 3 library for Jetpack Compose. Unlike the latter, Achromatic Material uses only shades of gray for design (the exception is red for errors). 
![[Color palettes.png]]
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
Achromatic Material provides achromatic alternatives for many [components](https://m3.material.io/components) from the Material Design 3 catalog. See [[README#Components catalog|achromatic components catalog]].

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
## Roadmap
- [ ] Update API documentation
- [ ] Add cover for README.md file
- [ ] Release library
	- [ ] Publish to JitPack
	- [ ] Publish to Maven
### Components catalog
<table style="width: 100%; border-collapse: separate; border-spacing: 0; border-radius: 12px; overflow: hidden; border: 1px solid #ddd;">
	<tr style="background-color: #303030; color: #fff;">
		<th style="text-align: center; padding: 8px; border-right: 1px solid #ddd; width: 50%;">Component</th>
		<th style="text-align: center; padding: 8px; border-left: 1px solid #ddd;">Status</th>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Badges</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Not planned" src="https://img.shields.io/badge/Not_planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Bottom app bar</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Bottom sheets</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Cards</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Carousel</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Not planned" src="https://img.shields.io/badge/Not_planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Checkbox</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Chips</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Common buttons</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Date pickers</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Dialogs</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Dividers</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Extended FAB</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Floating action buttons</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Icon buttons</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Lists</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Menus</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Navigation bar</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Navigation drawer</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Navigation rail</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Progress indicators</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Radio button</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Search</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Not planned" src="https://img.shields.io/badge/Not_planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Segmented button</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Side sheets</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Sliders</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Snackbar</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Switch</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="In process" src="https://img.shields.io/badge/In_process-FFE085">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Tabs</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Text fields</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Time pickers</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Tooltips</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Planned" src="https://img.shields.io/badge/Planned-E2E2E2">
		</td>
	</tr>
	<tr>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-right: 1px solid #ddd;">Top app bars</td>
		<td style="text-align: center; padding: 8px; border-top: 1px solid #ddd; border-left: 1px solid #ddd;">
			<img alt="Available" src="https://img.shields.io/badge/Available-C5F185">
		</td>
	</tr>
</table>
