package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.applovin.applovin_max.AppLovinMAX;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import io.flutter.plugins.inapppurchase.InAppPurchasePlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import o000o0oO.o000oOoO;
import o000oOoo.o000O0o;
import o000oo0.o000000;
import o00O00.OooO00o;
import o00O00OO.OooO0O0;
import o00O00o.OooO0OO;

@Keep
/* loaded from: classes3.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new OooO00o());
        } catch (Exception e) {
            Log.m13460e(TAG, "Error registering plugin android_intent_plus, dev.fluttercommunity.plus.androidintent.AndroidIntentPlugin", e);
        }
        try {
            flutterEngine.getPlugins().add(new AppLovinMAX());
        } catch (Exception e2) {
            Log.m13460e(TAG, "Error registering plugin applovin_max, com.applovin.applovin_max.AppLovinMAX", e2);
        }
        try {
            flutterEngine.getPlugins().add(new o00O00O.OooO00o());
        } catch (Exception e3) {
            Log.m13460e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e3);
        }
        try {
            flutterEngine.getPlugins().add(new OooO0OO());
        } catch (Exception e4) {
            Log.m13460e(TAG, "Error registering plugin dynamic_color, io.material.plugins.dynamic_color.DynamicColorPlugin", e4);
        }
        try {
            flutterEngine.getPlugins().add(new o000O0o());
        } catch (Exception e5) {
            Log.m13460e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e5);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAnalyticsPlugin());
        } catch (Exception e6) {
            Log.m13460e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e6);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCorePlugin());
        } catch (Exception e7) {
            Log.m13460e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e7);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e8) {
            Log.m13460e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e8);
        }
        try {
            flutterEngine.getPlugins().add(new FirebaseRemoteConfigPlugin());
        } catch (Exception e9) {
            Log.m13460e(TAG, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", e9);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterAndroidLifecyclePlugin());
        } catch (Exception e10) {
            Log.m13460e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new o000oOoO());
        } catch (Exception e11) {
            Log.m13460e(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new InAppPurchasePlugin());
        } catch (Exception e12) {
            Log.m13460e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new OooOO0O.OooO00o());
        } catch (Exception e13) {
            Log.m13460e(TAG, "Error registering plugin open_file_android, com.crazecoder.openfile.OpenFilePlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new oOO00O.OooO00o());
        } catch (Exception e14) {
            Log.m13460e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e15) {
            Log.m13460e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new OooO.OooO0OO());
        } catch (Exception e16) {
            Log.m13460e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add(new OooO0O0());
        } catch (Exception e17) {
            Log.m13460e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e18) {
            Log.m13460e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new o000000());
        } catch (Exception e19) {
            Log.m13460e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e20) {
            Log.m13460e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add(new OooOO0.OooO0OO());
        } catch (Exception e21) {
            Log.m13460e(TAG, "Error registering plugin vibration, com.benjaminabel.vibration.VibrationPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new WebViewFlutterPlugin());
        } catch (Exception e22) {
            Log.m13460e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e22);
        }
    }
}
