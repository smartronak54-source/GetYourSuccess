# Architecture Documentation

## Project Structure

```
GetYourSuccess/
├── activities/          # UI Activities
├── fragments/           # Fragment components
├── models/              # Data models
├── database/            # Room Database DAOs
├── services/            # Background services
├── receivers/           # Broadcast receivers
├── adapters/            # RecyclerView/ListView adapters
├── utils/               # Utility classes
└── res/                 # Resources
```

## Key Components

### 1. LockdownService
- Keeps app in foreground
- Blocks non-whitelisted apps
- Enforces study mode

### 2. AlarmService
- Plays forced alarm (3 times)
- Cannot be muted
- Vibration enabled

### 3. Room Database
- Local offline storage
- Syncs with Firebase
- Tracks performance data

### 4. Firebase Integration
- Real-time database
- Authentication
- Cloud functions

## Data Flow

1. User Login → Firebase Auth
2. Load Notes → Firebase + Local DB
3. Take Test → Process → AI Feedback
4. Performance → Analytics → Dashboard
5. Study Plan → Generate Routine → Alarms

## Security Features

- End-to-end encryption
- Device admin integration
- Mandatory lockdown
- App-level permissions
