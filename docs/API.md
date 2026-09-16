# API Reference

## Authentication

### Sign Up
```java
firebaseAuth.createUserWithEmailAndPassword(email, password)
    .addOnCompleteListener(task -> {
        if (task.isSuccessful()) {
            // Success
        }
    });
```

### Login
```java
firebaseAuth.signInWithEmailAndPassword(email, password)
    .addOnCompleteListener(task -> {
        if (task.isSuccessful()) {
            // Success
        }
    });
```

## Database Operations

### Insert Note
```java
Note note = new Note("Title", "Content", "Category");
FirebaseHelper.getInstance().getNotesRef().push().setValue(note);
```

### Get Notes
```java
FirebaseHelper.getInstance().getNotesRef()
    .addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot snapshot) {
            List<Note> notes = new ArrayList<>();
            for (DataSnapshot child : snapshot.getChildren()) {
                Note note = child.getValue(Note.class);
                notes.add(note);
            }
        }
    });
```

## Services

### Start Lockdown Service
```java
Intent intent = new Intent(context, LockdownService.class);
context.startService(intent);
```

### Start Alarm Service
```java
Intent intent = new Intent(context, AlarmService.class);
context.startService(intent);
```

## Utils

### Format Date
```java
String formatted = DateTimeUtils.formatDate(System.currentTimeMillis());
```

### Get Days Left
```java
int daysLeft = DateTimeUtils.getDaysLeft(targetDate);
```

### Show Notification
```java
NotificationHelper helper = new NotificationHelper(context);
helper.showNotification(1, "Title", "Message");
```
