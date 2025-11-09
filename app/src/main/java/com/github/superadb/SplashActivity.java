package com.github.superadb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemProperties;
import android.util.Log;
import com.github.superadb.SplashActivity;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o000Ooo.o00oO0o;
import o000oo00.Oooo000;
import o000oo00.o000oOoO;
import o000oo00.o00O0O;
import o000oo00.o00Oo0;

/* loaded from: classes2.dex */
public class SplashActivity extends FlutterActivity {
    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public final void configureFlutterEngine(FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        o00Oo0 o00oo0 = o000oOoO.f31097OooO0O0;
        final int i = 0;
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "AndroidHelper").setMethodCallHandler(new MethodChannel.MethodCallHandler(this) { // from class: o000oo00.o0OoOo0

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ SplashActivity f31102OooOo0o;

            {
                this.f31102OooOo0o = this;
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) throws NoSuchAlgorithmException {
                switch (i) {
                    case 0:
                        boolean zEquals = "g1".equals(methodCall.method);
                        SplashActivity splashActivity = this.f31102OooOo0o;
                        if (!zEquals) {
                            if (!"g2".equals(methodCall.method)) {
                                if (!"g3".equals(methodCall.method)) {
                                    String strOooO0O0 = null;
                                    if (!"g4".equals(methodCall.method)) {
                                        if (!"g5".equals(methodCall.method)) {
                                            if (!"g6".equals(methodCall.method)) {
                                                if (!"g7".equals(methodCall.method)) {
                                                    if (!"p1".equals(methodCall.method)) {
                                                        if (!"systemPropertiesGet".equals(methodCall.method)) {
                                                            if (!"isIgnoringBatteryOptimizations".equals(methodCall.method)) {
                                                                if (!"requestIgnoreBatteryOptimizations".equals(methodCall.method)) {
                                                                    result.notImplemented();
                                                                    break;
                                                                } else {
                                                                    Context applicationContext = splashActivity.getApplicationContext();
                                                                    Intent intent = new Intent();
                                                                    intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                                                                    intent.addFlags(268435456);
                                                                    if (applicationContext != null) {
                                                                        if (applicationContext instanceof Application) {
                                                                            intent.addFlags(268435456);
                                                                        }
                                                                        try {
                                                                            applicationContext.startActivity(intent);
                                                                        } catch (Exception e) {
                                                                            e.printStackTrace();
                                                                        }
                                                                    }
                                                                    result.success(Boolean.TRUE);
                                                                    break;
                                                                }
                                                            } else {
                                                                Context applicationContext2 = splashActivity.getApplicationContext();
                                                                result.success(Boolean.valueOf(((PowerManager) applicationContext2.getSystemService("power")).isIgnoringBatteryOptimizations(applicationContext2.getPackageName())));
                                                                break;
                                                            }
                                                        } else {
                                                            String str = (String) methodCall.argument("key");
                                                            if (str == null || str.isEmpty()) {
                                                                result.success("");
                                                                break;
                                                            } else {
                                                                try {
                                                                    result.success(SystemProperties.get(str));
                                                                    break;
                                                                } catch (Exception unused) {
                                                                    result.success("");
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (splashActivity.getApplicationContext().getClass().equals(Application.class)) {
                                                            if (Build.VERSION.SDK_INT >= 30) {
                                                                Intent intent2 = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                                                                intent2.addFlags(268435456);
                                                                try {
                                                                    splashActivity.startActivity(intent2);
                                                                } catch (Exception e2) {
                                                                    e2.printStackTrace();
                                                                }
                                                            } else {
                                                                try {
                                                                    Intent intent3 = new Intent();
                                                                    intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                                    intent3.setData(Uri.parse("package:" + splashActivity.getPackageName()));
                                                                    intent3.addFlags(268435456);
                                                                    splashActivity.startActivity(intent3);
                                                                } catch (Exception e3) {
                                                                    e3.printStackTrace();
                                                                }
                                                            }
                                                        }
                                                        result.success(Boolean.TRUE);
                                                        break;
                                                    }
                                                } else {
                                                    try {
                                                        result.success(o00Ooo.OooO00o(splashActivity.getPackageManager().getPackageInfo(splashActivity.getPackageName(), 0)).toString());
                                                        break;
                                                    } catch (Exception unused2) {
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Signature[] signatureArrOooO0o0 = o000oOoO.OooO0o0(splashActivity);
                                                    if (signatureArrOooO0o0 == null || signatureArrOooO0o0.length == 0) {
                                                        Log.w("SignatureSHA256Utils", "No signatures found for package: " + splashActivity.getPackageName());
                                                    } else {
                                                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                                        messageDigest.update(signatureArrOooO0o0[0].toByteArray());
                                                        strOooO0O0 = o000oOoO.OooO0O0(messageDigest.digest());
                                                    }
                                                } catch (PackageManager.NameNotFoundException e4) {
                                                    Log.e("SignatureSHA256Utils", "Package not found: " + splashActivity.getPackageName(), e4);
                                                } catch (NoSuchAlgorithmException e5) {
                                                    Log.e("SignatureSHA256Utils", "SHA-256 algorithm not available", e5);
                                                } catch (Exception e6) {
                                                    Log.e("SignatureSHA256Utils", "Unexpected error getting package signature", e6);
                                                }
                                                result.success(strOooO0O0);
                                                break;
                                            }
                                        } else {
                                            Log.w("SignatureSHAUtils", "WARNING: SHA-1 algorithm is deprecated due to security vulnerabilities. Please migrate to SHA-256 or other secure algorithms.");
                                            try {
                                                Signature[] signatureArrOooO0o = o000oOoO.OooO0o(splashActivity);
                                                if (signatureArrOooO0o == null || signatureArrOooO0o.length == 0) {
                                                    Log.w("SignatureSHAUtils", "No signatures found for package: " + splashActivity.getPackageName());
                                                } else {
                                                    MessageDigest messageDigest2 = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
                                                    messageDigest2.update(signatureArrOooO0o[0].toByteArray());
                                                    strOooO0O0 = o000oOoO.OooO0OO(messageDigest2.digest());
                                                }
                                            } catch (PackageManager.NameNotFoundException e7) {
                                                Log.e("SignatureSHAUtils", "Package not found: " + splashActivity.getPackageName(), e7);
                                            } catch (NoSuchAlgorithmException e8) {
                                                Log.e("SignatureSHAUtils", "SHA-1 algorithm not available", e8);
                                            } catch (Exception e9) {
                                                Log.e("SignatureSHAUtils", "Unexpected error getting package signature", e9);
                                            }
                                            result.success(strOooO0O0);
                                            break;
                                        }
                                    } else {
                                        try {
                                            Signature[] signatureArrOooO0Oo = o000oOoO.OooO0Oo(splashActivity);
                                            if (signatureArrOooO0Oo == null || signatureArrOooO0Oo.length == 0) {
                                                Log.w("SignatureMd5Utils", "No signatures found for package: " + splashActivity.getPackageName());
                                            } else {
                                                MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
                                                messageDigest3.update(signatureArrOooO0Oo[0].toByteArray());
                                                strOooO0O0 = o000oOoO.OooO00o(messageDigest3.digest());
                                            }
                                        } catch (PackageManager.NameNotFoundException e10) {
                                            Log.e("SignatureMd5Utils", "Package not found: " + splashActivity.getPackageName(), e10);
                                        } catch (NoSuchAlgorithmException e11) {
                                            Log.e("SignatureMd5Utils", "MD5 algorithm not available", e11);
                                        } catch (Exception e12) {
                                            Log.e("SignatureMd5Utils", "Unexpected error getting package signature", e12);
                                        }
                                        result.success(strOooO0O0);
                                        break;
                                    }
                                } else if (splashActivity.getApplication().getClass().equals(Application.class)) {
                                    result.success(splashActivity.getCacheDir().getPath().replaceAll("\\$", "").replaceAll("/$", ""));
                                    break;
                                }
                            } else if (splashActivity.getApplication().getClass().equals(Application.class)) {
                                result.success(splashActivity.getFilesDir().getPath().replaceAll("\\$", "").replaceAll("/$", ""));
                                break;
                            }
                        } else {
                            String str2 = splashActivity.getApplicationContext().getApplicationInfo().nativeLibraryDir;
                            if (!splashActivity.getApplicationContext().getClass().equals(Application.class)) {
                                result.success(str2.replaceAll("64", ""));
                                break;
                            } else {
                                result.success(str2.replaceAll("\\$", "").replaceAll("/$", ""));
                                break;
                            }
                        }
                        break;
                    default:
                        o00Oo0.OooO00o(this.f31102OooOo0o, methodCall, result);
                        break;
                }
            }
        });
        final int i2 = 1;
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "foreground_service_channel").setMethodCallHandler(new MethodChannel.MethodCallHandler(this) { // from class: o000oo00.o0OoOo0

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ SplashActivity f31102OooOo0o;

            {
                this.f31102OooOo0o = this;
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) throws NoSuchAlgorithmException {
                switch (i2) {
                    case 0:
                        boolean zEquals = "g1".equals(methodCall.method);
                        SplashActivity splashActivity = this.f31102OooOo0o;
                        if (!zEquals) {
                            if (!"g2".equals(methodCall.method)) {
                                if (!"g3".equals(methodCall.method)) {
                                    String strOooO0O0 = null;
                                    if (!"g4".equals(methodCall.method)) {
                                        if (!"g5".equals(methodCall.method)) {
                                            if (!"g6".equals(methodCall.method)) {
                                                if (!"g7".equals(methodCall.method)) {
                                                    if (!"p1".equals(methodCall.method)) {
                                                        if (!"systemPropertiesGet".equals(methodCall.method)) {
                                                            if (!"isIgnoringBatteryOptimizations".equals(methodCall.method)) {
                                                                if (!"requestIgnoreBatteryOptimizations".equals(methodCall.method)) {
                                                                    result.notImplemented();
                                                                    break;
                                                                } else {
                                                                    Context applicationContext = splashActivity.getApplicationContext();
                                                                    Intent intent = new Intent();
                                                                    intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                                                                    intent.addFlags(268435456);
                                                                    if (applicationContext != null) {
                                                                        if (applicationContext instanceof Application) {
                                                                            intent.addFlags(268435456);
                                                                        }
                                                                        try {
                                                                            applicationContext.startActivity(intent);
                                                                        } catch (Exception e) {
                                                                            e.printStackTrace();
                                                                        }
                                                                    }
                                                                    result.success(Boolean.TRUE);
                                                                    break;
                                                                }
                                                            } else {
                                                                Context applicationContext2 = splashActivity.getApplicationContext();
                                                                result.success(Boolean.valueOf(((PowerManager) applicationContext2.getSystemService("power")).isIgnoringBatteryOptimizations(applicationContext2.getPackageName())));
                                                                break;
                                                            }
                                                        } else {
                                                            String str = (String) methodCall.argument("key");
                                                            if (str == null || str.isEmpty()) {
                                                                result.success("");
                                                                break;
                                                            } else {
                                                                try {
                                                                    result.success(SystemProperties.get(str));
                                                                    break;
                                                                } catch (Exception unused) {
                                                                    result.success("");
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (splashActivity.getApplicationContext().getClass().equals(Application.class)) {
                                                            if (Build.VERSION.SDK_INT >= 30) {
                                                                Intent intent2 = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                                                                intent2.addFlags(268435456);
                                                                try {
                                                                    splashActivity.startActivity(intent2);
                                                                } catch (Exception e2) {
                                                                    e2.printStackTrace();
                                                                }
                                                            } else {
                                                                try {
                                                                    Intent intent3 = new Intent();
                                                                    intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                                    intent3.setData(Uri.parse("package:" + splashActivity.getPackageName()));
                                                                    intent3.addFlags(268435456);
                                                                    splashActivity.startActivity(intent3);
                                                                } catch (Exception e3) {
                                                                    e3.printStackTrace();
                                                                }
                                                            }
                                                        }
                                                        result.success(Boolean.TRUE);
                                                        break;
                                                    }
                                                } else {
                                                    try {
                                                        result.success(o00Ooo.OooO00o(splashActivity.getPackageManager().getPackageInfo(splashActivity.getPackageName(), 0)).toString());
                                                        break;
                                                    } catch (Exception unused2) {
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Signature[] signatureArrOooO0o0 = o000oOoO.OooO0o0(splashActivity);
                                                    if (signatureArrOooO0o0 == null || signatureArrOooO0o0.length == 0) {
                                                        Log.w("SignatureSHA256Utils", "No signatures found for package: " + splashActivity.getPackageName());
                                                    } else {
                                                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                                        messageDigest.update(signatureArrOooO0o0[0].toByteArray());
                                                        strOooO0O0 = o000oOoO.OooO0O0(messageDigest.digest());
                                                    }
                                                } catch (PackageManager.NameNotFoundException e4) {
                                                    Log.e("SignatureSHA256Utils", "Package not found: " + splashActivity.getPackageName(), e4);
                                                } catch (NoSuchAlgorithmException e5) {
                                                    Log.e("SignatureSHA256Utils", "SHA-256 algorithm not available", e5);
                                                } catch (Exception e6) {
                                                    Log.e("SignatureSHA256Utils", "Unexpected error getting package signature", e6);
                                                }
                                                result.success(strOooO0O0);
                                                break;
                                            }
                                        } else {
                                            Log.w("SignatureSHAUtils", "WARNING: SHA-1 algorithm is deprecated due to security vulnerabilities. Please migrate to SHA-256 or other secure algorithms.");
                                            try {
                                                Signature[] signatureArrOooO0o = o000oOoO.OooO0o(splashActivity);
                                                if (signatureArrOooO0o == null || signatureArrOooO0o.length == 0) {
                                                    Log.w("SignatureSHAUtils", "No signatures found for package: " + splashActivity.getPackageName());
                                                } else {
                                                    MessageDigest messageDigest2 = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
                                                    messageDigest2.update(signatureArrOooO0o[0].toByteArray());
                                                    strOooO0O0 = o000oOoO.OooO0OO(messageDigest2.digest());
                                                }
                                            } catch (PackageManager.NameNotFoundException e7) {
                                                Log.e("SignatureSHAUtils", "Package not found: " + splashActivity.getPackageName(), e7);
                                            } catch (NoSuchAlgorithmException e8) {
                                                Log.e("SignatureSHAUtils", "SHA-1 algorithm not available", e8);
                                            } catch (Exception e9) {
                                                Log.e("SignatureSHAUtils", "Unexpected error getting package signature", e9);
                                            }
                                            result.success(strOooO0O0);
                                            break;
                                        }
                                    } else {
                                        try {
                                            Signature[] signatureArrOooO0Oo = o000oOoO.OooO0Oo(splashActivity);
                                            if (signatureArrOooO0Oo == null || signatureArrOooO0Oo.length == 0) {
                                                Log.w("SignatureMd5Utils", "No signatures found for package: " + splashActivity.getPackageName());
                                            } else {
                                                MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
                                                messageDigest3.update(signatureArrOooO0Oo[0].toByteArray());
                                                strOooO0O0 = o000oOoO.OooO00o(messageDigest3.digest());
                                            }
                                        } catch (PackageManager.NameNotFoundException e10) {
                                            Log.e("SignatureMd5Utils", "Package not found: " + splashActivity.getPackageName(), e10);
                                        } catch (NoSuchAlgorithmException e11) {
                                            Log.e("SignatureMd5Utils", "MD5 algorithm not available", e11);
                                        } catch (Exception e12) {
                                            Log.e("SignatureMd5Utils", "Unexpected error getting package signature", e12);
                                        }
                                        result.success(strOooO0O0);
                                        break;
                                    }
                                } else if (splashActivity.getApplication().getClass().equals(Application.class)) {
                                    result.success(splashActivity.getCacheDir().getPath().replaceAll("\\$", "").replaceAll("/$", ""));
                                    break;
                                }
                            } else if (splashActivity.getApplication().getClass().equals(Application.class)) {
                                result.success(splashActivity.getFilesDir().getPath().replaceAll("\\$", "").replaceAll("/$", ""));
                                break;
                            }
                        } else {
                            String str2 = splashActivity.getApplicationContext().getApplicationInfo().nativeLibraryDir;
                            if (!splashActivity.getApplicationContext().getClass().equals(Application.class)) {
                                result.success(str2.replaceAll("64", ""));
                                break;
                            } else {
                                result.success(str2.replaceAll("\\$", "").replaceAll("/$", ""));
                                break;
                            }
                        }
                        break;
                    default:
                        o00Oo0.OooO00o(this.f31102OooOo0o, methodCall, result);
                        break;
                }
            }
        });
        MethodChannel methodChannel = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "android_flutter_callback");
        o00oo0.f31098OooO00o = methodChannel;
        methodChannel.setMethodCallHandler(new o00O0O());
        if (getApplicationContext().getClass().equals(Application.class)) {
            return;
        }
        o00oo0.f31098OooO00o.setMethodCallHandler(null);
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o00oO0o o00oo0o = o000oOoO.f31096OooO00o;
        Handler handler = new Handler();
        if (Build.VERSION.SDK_INT >= 30) {
            o00oo0o.f30487OooOo0o = new Oooo000(this, "_adb-tls-connect._tcp", new o00oO0o(handler, 4));
        }
        if (System.currentTimeMillis() < 0) {
            System.loadLibrary("adb");
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo000 oooo000 = (Oooo000) o000oOoO.f31096OooO00o.f30487OooOo0o;
        if (oooo000 == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        oooo000.OooO0OO();
    }
}
