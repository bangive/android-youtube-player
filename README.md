# Android Youtube Player
Android Youtube Player provides an easy way to play a Youtube video in your Android application.

## Usage

### 1. Add OpenYouTubeActivity activity declaration in your AndroidManifest.xml
```xml
<activity
    android:name="com.github.booknara.youtube.OpenYouTubePlayerActivity"
    android:configChanges="orientation" >
</activity>
```

### 2. Add two permissions in your AndroidManifest.xml
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
```

### 3. Call OpenYoutubePlayerActivity in your activity or fragment
```java
Intent videoIntent = new Intent(null, Uri.parse("ytv://" + YOUTUBE_VIDEO_ID), this, OpenYouTubePlayerActivity.class);
startActivity(videoIntent);
```

## Download

You can depend on the library through Maven:
```xml
<dependency>
  <groupId>com.github.booknara</groupId>
  <artifactId>android-youtube-player</artifactId>
  <version>1.0.0</version>
</dependency>
```
or Gradle:
```groovy
compile 'com.github.booknara:android-youtube-player:1.0.0'
```

## Acknowledgements

* Thanks to all developers and contributers for [android-youtube-player][1] project.


## License

    Copyright 2015 Daehee Han

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


---

[1]: https://code.google.com/p/android-youtube-player/
