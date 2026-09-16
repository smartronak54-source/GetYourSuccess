# Setup Guide

## Prerequisites
- Android Studio (2022.1 or higher)
- Java 11+
- Firebase Account
- Minimum SDK: 24 (Android 7.0)

## Installation Steps

### 1. Clone Repository
```bash
git clone https://github.com/smartronak54-source/GetYourSuccess.git
cd GetYourSuccess
```

### 2. Firebase Setup

1. Go to [Firebase Console](https://console.firebase.google.com/)
2. Create new project → "GetYourSuccess"
3. Add Android app
4. Download `google-services.json`
5. Place in `app/` directory

### 3. Configure Project

1. Open `local.properties`
2. Set SDK path: `sdk.dir=/path/to/android/sdk`

### 4. Build and Run

```bash
./gradlew build
./gradlew installDebug
```

## Configuration

### Firebase Rules
```json
{
  "rules": {
    "users": {
      "$uid": {
        ".read": "$uid === auth.uid",
        ".write": "$uid === auth.uid"
      }
    },
    "tests": {
      ".read": true,
      ".write": "root.child('users').child(auth.uid).exists()"
    }
  }
}
```

## Troubleshooting

### Build Errors
- Clear cache: `./gradlew clean`
- Rebuild: `./gradlew build`

### Firebase Connection Issues
- Check `google-services.json` is in correct location
- Verify Firebase project settings
- Check internet connection
