# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 프로젝트 개요

**todaktodak**은 Kotlin과 Jetpack Compose를 사용하여 Material 3 디자인으로 구축된 Android 애플리케이션입니다.

- **패키지명**: `com.example.todaktodak`
- **최소 SDK**: 26 (Android 8.0)
- **타겟 SDK**: 36
- **Java 버전**: 11

## 빌드 명령어

프로젝트 빌드:
```bash
./gradlew build
```

단위 테스트 실행:
```bash
./gradlew test
```

계측 테스트 실행:
```bash
./gradlew connectedAndroidTest
```

특정 단위 테스트 실행:
```bash
./gradlew test --tests com.example.todaktodak.클래스명.메서드명
```

클린 후 재빌드:
```bash
./gradlew clean build
```

연결된 기기에 디버그 APK 설치:
```bash
./gradlew installDebug
```

## 아키텍처

### UI 프레임워크
- **Jetpack Compose**와 Material 3 디자인 시스템 사용
- 단일 Activity 아키텍처 (`MainActivity`)
- Compose BOM 버전: 2024.09.00

### 프로젝트 구조
- **메인 소스**: `app/src/main/java/com/example/todaktodak/`
- **단위 테스트**: `app/src/test/java/com/example/todaktodak/`
- **계측 테스트**: `app/src/androidTest/java/com/example/todaktodak/`

### 테마 시스템
테마는 `ui/theme/` 패키지에 정의되어 있습니다:
- `Theme.kt`: 동적 색상(Android 12+) 및 다크/라이트 모드를 지원하는 메인 테마 컴포저블
- `Color.kt`: 색상 정의
- `Type.kt`: 타이포그래피 정의

메인 테마: `TodaktodakTheme` 컴포저블이 모든 UI 콘텐츠를 감쌉니다.

### 의존성 관리
모든 의존성은 Gradle 버전 카탈로그(`gradle/libs.versions.toml`)를 통해 관리됩니다. 빌드 파일에서 `libs.` 접두사를 사용하여 의존성을 참조하세요.

## 테스트
- **단위 테스트**: JUnit 4 사용
- **계측 테스트**: Espresso 및 Compose UI Test가 포함된 AndroidX Test 사용
- 테스트 러너: `androidx.test.runner.AndroidJUnitRunner`
