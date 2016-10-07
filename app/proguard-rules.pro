# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /home/user/apps/android-sdk-linux/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
-dontwarn java.lang.invoke.* #retrolambda

-dontwarn sun.misc.**

#region moxy
-keep class **$$PresentersBinder
-keep class **$$State
-keep class **$$ParamsHolder
-keep class **$$ViewStateClassNameProvider
-keepnames class * extends com.arellomobile.mvp.*
-dontwarn  com.arellomobile.mvp.MvpAppCompatFragment
#endregion

#rxJava
-keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
   long producerIndex;
   long consumerIndex;
}

-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef {
    rx.internal.util.atomic.LinkedQueueNode producerNode;
}

-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef {
    rx.internal.util.atomic.LinkedQueueNode consumerNode;
}

-dontwarn com.squareup.picasso.**
-dontwarn okio.**

-dontwarn retrofit2.**
-keep class retrofit2.** { *; }
-keepattributes Signature
-keepattributes Exceptions

-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
}