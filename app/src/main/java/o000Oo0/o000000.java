package o000oo0;

import OoooO0O.o0000O00;
import OoooO0O.o0000O0O;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.ironsource.C3007ch;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public class o000000 implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: OooOoo, reason: collision with root package name */
    public static String f31024OooOoo;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static o0OOO0o f31029Oooo00O;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Context f31030OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public MethodChannel f31031OooOo0o;

    /* renamed from: OooOo, reason: collision with root package name */
    public static final HashMap f31020OooOo = new HashMap();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final HashMap f31022OooOoO0 = new HashMap();

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final Object f31021OooOoO = new Object();

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final Object f31023OooOoOO = new Object();

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static int f31025OooOoo0 = 0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public static int f31026OooOooO = 0;

    /* renamed from: OooOooo, reason: collision with root package name */
    public static int f31027OooOooo = 1;

    /* renamed from: Oooo000, reason: collision with root package name */
    public static int f31028Oooo000 = 0;

    public static void OooO00o(o000000 o000000Var, oo000o oo000oVar) {
        try {
            if (oo000oVar.f31066OooO0Oo >= 1) {
                Log.d("Sqflite", oo000oVar.OooO() + "closing database ");
            }
            oo000oVar.OooO0O0();
        } catch (Exception e) {
            Log.e("Sqflite", "error " + e + " while closing database " + f31028Oooo000);
        }
        synchronized (f31021OooOoO) {
            try {
                if (f31022OooOoO0.isEmpty() && f31029Oooo00O != null) {
                    if (oo000oVar.f31066OooO0Oo >= 1) {
                        Log.d("Sqflite", oo000oVar.OooO() + "stopping thread");
                    }
                    f31029Oooo00O.OooO0OO();
                    f31029Oooo00O = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static oo000o OooO0O0(MethodCall methodCall, MethodChannel.Result result) {
        Integer num = (Integer) methodCall.argument(C3007ch.f7763x);
        int iIntValue = num.intValue();
        oo000o oo000oVar = (oo000o) f31022OooOoO0.get(num);
        if (oo000oVar != null) {
            return oo000oVar;
        }
        result.error("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    public static HashMap OooO0OO(int i, boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put(C3007ch.f7763x, Integer.valueOf(i));
        if (z) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z2) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.f31030OooOo0O = applicationContext;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f31031OooOo0o = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f31030OooOo0O = null;
        this.f31031OooOo0o.setMethodCallHandler(null);
        this.f31031OooOo0o = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(final MethodCall methodCall, final MethodChannel.Result result) {
        int i;
        int i2;
        int i3;
        oo000o oo000oVar;
        int i4;
        boolean zExists;
        final int i5;
        oo000o oo000oVar2;
        byte b;
        i = 5;
        i2 = 2;
        i3 = 4;
        String str = methodCall.method;
        str.getClass();
        oo000oVar = null;
        i4 = 1;
        zExists = false;
        b = 0;
        switch (str) {
            case "execute":
                oo000o oo000oVarOooO0O0 = OooO0O0(methodCall, result);
                if (oo000oVarOooO0O0 == null) {
                    return;
                }
                f31029Oooo00O.OooO00o(oo000oVarOooO0O0, new o0OO00O(methodCall, result, oo000oVarOooO0O0, i3));
                return;
            case "closeDatabase":
                Integer num = (Integer) methodCall.argument(C3007ch.f7763x);
                int iIntValue = num.intValue();
                oo000o oo000oVarOooO0O02 = OooO0O0(methodCall, result);
                if (oo000oVarOooO0O02 == null) {
                    return;
                }
                if (oo000oVarOooO0O02.f31066OooO0Oo >= 1) {
                    Log.d("Sqflite", oo000oVarOooO0O02.OooO() + "closing " + iIntValue + StringUtils.SPACE + oo000oVarOooO0O02.f31064OooO0O0);
                }
                String str2 = oo000oVarOooO0O02.f31064OooO0O0;
                synchronized (f31021OooOoO) {
                    try {
                        f31022OooOoO0.remove(num);
                        if (oo000oVarOooO0O02.f31063OooO00o) {
                            f31020OooOo.remove(str2);
                        }
                    } finally {
                    }
                }
                f31029Oooo00O.OooO00o(oo000oVarOooO0O02, new o0O0O00(this, oo000oVarOooO0O02, result));
                return;
            case "options":
                Object objArgument = methodCall.argument("androidThreadPriority");
                if (objArgument != null) {
                    f31026OooOooO = ((Integer) objArgument).intValue();
                }
                Object objArgument2 = methodCall.argument("androidThreadCount");
                if (objArgument2 != null && !objArgument2.equals(Integer.valueOf(f31027OooOooo))) {
                    f31027OooOooo = ((Integer) objArgument2).intValue();
                    o0OOO0o o0ooo0o = f31029Oooo00O;
                    if (o0ooo0o != null) {
                        o0ooo0o.OooO0OO();
                        f31029Oooo00O = null;
                    }
                }
                Integer num2 = (Integer) methodCall.argument("logLevel");
                if (num2 != null) {
                    f31025OooOoo0 = num2.intValue();
                }
                result.success(null);
                return;
            case "insert":
                oo000o oo000oVarOooO0O03 = OooO0O0(methodCall, result);
                if (oo000oVarOooO0O03 == null) {
                    return;
                }
                f31029Oooo00O.OooO00o(oo000oVarOooO0O03, new o0OO00O(methodCall, result, oo000oVarOooO0O03, i4));
                return;
            case "update":
                oo000o oo000oVarOooO0O04 = OooO0O0(methodCall, result);
                if (oo000oVarOooO0O04 == null) {
                    return;
                }
                f31029Oooo00O.OooO00o(oo000oVarOooO0O04, new o0OO00O(methodCall, result, oo000oVarOooO0O04, i));
                return;
            case "androidSetLocale":
                oo000o oo000oVarOooO0O05 = OooO0O0(methodCall, result);
                if (oo000oVarOooO0O05 == null) {
                    return;
                }
                f31029Oooo00O.OooO00o(oo000oVarOooO0O05, new o0OO00O(methodCall, oo000oVarOooO0O05, result));
                return;
            case "deleteDatabase":
                String str3 = (String) methodCall.argument("path");
                synchronized (f31021OooOoO) {
                    try {
                        if (o0OoOo0.OooO00o(f31025OooOoo0)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f31020OooOo.keySet());
                        }
                        HashMap map = f31020OooOo;
                        Integer num3 = (Integer) map.get(str3);
                        if (num3 != null) {
                            HashMap map2 = f31022OooOoO0;
                            oo000o oo000oVar3 = (oo000o) map2.get(num3);
                            if (oo000oVar3 != null && oo000oVar3.f31062OooO.isOpen()) {
                                if (o0OoOo0.OooO00o(f31025OooOoo0)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(oo000oVar3.OooO());
                                    sb.append("found single instance ");
                                    sb.append(oo000oVar3.OooOO0O() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(StringUtils.SPACE);
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                map2.remove(num3);
                                map.remove(str3);
                                oo000oVar = oo000oVar3;
                            }
                        }
                    } finally {
                    }
                }
                o000OOo o000ooo2 = new o000OOo(this, oo000oVar, str3, result);
                o0OOO0o o0ooo0o2 = f31029Oooo00O;
                if (o0ooo0o2 != null) {
                    o0ooo0o2.OooO00o(oo000oVar, o000ooo2);
                    return;
                } else {
                    o000ooo2.run();
                    return;
                }
            case "debugMode":
                boolean zEquals = Boolean.TRUE.equals(methodCall.arguments());
                if (!zEquals) {
                    f31025OooOoo0 = 0;
                } else if (zEquals) {
                    f31025OooOoo0 = 1;
                }
                result.success(null);
                return;
            case "openDatabase":
                final String str4 = (String) methodCall.argument("path");
                final Boolean bool = (Boolean) methodCall.argument("readOnly");
                boolean z = str4 == null || str4.equals(":memory:");
                boolean z2 = (Boolean.FALSE.equals(methodCall.argument("singleInstance")) || z) ? false : true;
                if (z2) {
                    synchronized (f31021OooOoO) {
                        try {
                            if (o0OoOo0.OooO00o(f31025OooOoo0)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f31020OooOo.keySet());
                            }
                            Integer num4 = (Integer) f31020OooOo.get(str4);
                            if (num4 != null && (oo000oVar2 = (oo000o) f31022OooOoO0.get(num4)) != null) {
                                if (oo000oVar2.f31062OooO.isOpen()) {
                                    if (o0OoOo0.OooO00o(f31025OooOoo0)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(oo000oVar2.OooO());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(oo000oVar2.OooOO0O() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(StringUtils.SPACE);
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    result.success(OooO0OO(num4.intValue(), true, oo000oVar2.OooOO0O()));
                                    return;
                                }
                                if (o0OoOo0.OooO00o(f31025OooOoo0)) {
                                    Log.d("Sqflite", oo000oVar2.OooO() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f31021OooOoO;
                synchronized (obj) {
                    i5 = f31028Oooo000 + 1;
                    f31028Oooo000 = i5;
                }
                final oo000o oo000oVar4 = new oo000o(this.f31030OooOo0O, str4, i5, f31025OooOoo0, z2);
                synchronized (obj) {
                    try {
                        if (f31029Oooo00O == null) {
                            int i6 = f31027OooOooo;
                            int i7 = f31026OooOooO;
                            o0OOO0o o0000o00 = i6 == 1 ? new o0000O00(i7, 4) : new o0000O0O(i6, i7);
                            f31029Oooo00O = o0000o00;
                            o0000o00.start();
                            if (oo000oVar4.f31066OooO0Oo >= 1) {
                                Log.d("Sqflite", oo000oVar4.OooO() + "starting worker pool with priority " + f31026OooOooO);
                            }
                        }
                        oo000oVar4.f31070OooO0oo = f31029Oooo00O;
                        if (oo000oVar4.f31066OooO0Oo >= 1) {
                            Log.d("Sqflite", oo000oVar4.OooO() + "opened " + i5 + StringUtils.SPACE + str4);
                        }
                        final boolean z3 = z;
                        final boolean z4 = z2;
                        f31029Oooo00O.OooO00o(oo000oVar4, new Runnable() { // from class: o000oo0.oo0o0Oo
                            /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x004b, Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:17:0x004e, B:19:0x0057, B:20:0x0065), top: B:45:0x004e, outer: #2 }] */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x004b, Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:17:0x004e, B:19:0x0057, B:20:0x0065), top: B:45:0x004e, outer: #2 }] */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void run() {
                                /*
                                    r12 = this;
                                    boolean r0 = r1
                                    java.lang.String r1 = r2
                                    io.flutter.plugin.common.MethodChannel$Result r2 = r3
                                    java.lang.Boolean r3 = r4
                                    o000oo0.oo000o r4 = r5
                                    io.flutter.plugin.common.MethodCall r5 = r6
                                    boolean r6 = r7
                                    int r7 = r8
                                    java.lang.String r8 = "open_failed "
                                    java.lang.Object r9 = o000oo0.o000000.f31023OooOoOO
                                    monitor-enter(r9)
                                    r10 = 0
                                    if (r0 != 0) goto L4e
                                    java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4b
                                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r0 = r0.getParent()     // Catch: java.lang.Throwable -> L4b
                                    r11.<init>(r0)     // Catch: java.lang.Throwable -> L4b
                                    boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    boolean r0 = r11.mkdirs()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    java.lang.String r0 = "sqlite_error"
                                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
                                    r3.<init>(r8)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L4b
                                    r2.error(r0, r1, r10)     // Catch: java.lang.Throwable -> L4b
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    return
                                L4b:
                                    r0 = move-exception
                                    goto Lc3
                                L4e:
                                    java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r3 = 1
                                    if (r0 == 0) goto L65
                                    o000oo0.o00Ooo r0 = new o000oo0.o00Ooo     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r0.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    java.lang.String r8 = r4.f31064OooO0O0     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r8, r10, r3, r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r4.f31062OooO = r0     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    goto L68
                                L65:
                                    r4.OooOO0o()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                L68:
                                    java.lang.Object r0 = o000oo0.o000000.f31021OooOoO     // Catch: java.lang.Throwable -> L4b
                                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L4b
                                    if (r6 == 0) goto L79
                                    java.util.HashMap r5 = o000oo0.o000000.f31020OooOo     // Catch: java.lang.Throwable -> L77
                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L77
                                    r5.put(r1, r6)     // Catch: java.lang.Throwable -> L77
                                    goto L79
                                L77:
                                    r1 = move-exception
                                    goto Lb6
                                L79:
                                    java.util.HashMap r5 = o000oo0.o000000.f31022OooOoO0     // Catch: java.lang.Throwable -> L77
                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L77
                                    r5.put(r6, r4)     // Catch: java.lang.Throwable -> L77
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                                    int r0 = r4.f31066OooO0Oo     // Catch: java.lang.Throwable -> L4b
                                    if (r0 < r3) goto Lac
                                    java.lang.String r0 = "Sqflite"
                                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
                                    r3.<init>()     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = r4.OooO()     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = "opened "
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r7)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = " "
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L4b
                                    android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L4b
                                Lac:
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    r0 = 0
                                    java.util.HashMap r0 = o000oo0.o000000.OooO0OO(r7, r0, r0)
                                    r2.success(r0)
                                    return
                                Lb6:
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                                    throw r1     // Catch: java.lang.Throwable -> L4b
                                Lb8:
                                    r0 = move-exception
                                    o000oo0O.oo0o0Oo r1 = new o000oo0O.oo0o0Oo     // Catch: java.lang.Throwable -> L4b
                                    r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L4b
                                    r4.OooOO0(r0, r1)     // Catch: java.lang.Throwable -> L4b
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    return
                                Lc3:
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: o000oo0.oo0o0Oo.run():void");
                            }
                        });
                    } finally {
                    }
                }
                return;
            case "batch":
                oo000o oo000oVarOooO0O06 = OooO0O0(methodCall, result);
                if (oo000oVarOooO0O06 == null) {
                    return;
                }
                f31029Oooo00O.OooO00o(oo000oVarOooO0O06, new o0OO00O(oo000oVarOooO0O06, methodCall, result));
                return;
            case "debug":
                String str5 = (String) methodCall.argument("cmd");
                HashMap map3 = new HashMap();
                if ("get".equals(str5)) {
                    int i8 = f31025OooOoo0;
                    if (i8 > 0) {
                        map3.put("logLevel", Integer.valueOf(i8));
                    }
                    HashMap map4 = f31022OooOoO0;
                    if (!map4.isEmpty()) {
                        HashMap map5 = new HashMap();
                        for (Map.Entry entry : map4.entrySet()) {
                            oo000o oo000oVar5 = (oo000o) entry.getValue();
                            HashMap map6 = new HashMap();
                            map6.put("path", oo000oVar5.f31064OooO0O0);
                            map6.put("singleInstance", Boolean.valueOf(oo000oVar5.f31063OooO00o));
                            int i9 = oo000oVar5.f31066OooO0Oo;
                            if (i9 > 0) {
                                map6.put("logLevel", Integer.valueOf(i9));
                            }
                            map5.put(((Integer) entry.getKey()).toString(), map6);
                        }
                        map3.put("databases", map5);
                    }
                }
                result.success(map3);
                return;
            case "query":
                oo000o oo000oVarOooO0O07 = OooO0O0(methodCall, result);
                if (oo000oVarOooO0O07 == null) {
                    return;
                }
                f31029Oooo00O.OooO00o(oo000oVarOooO0O07, new o0OO00O(methodCall, result, oo000oVarOooO0O07, i2));
                return;
            case "databaseExists":
                try {
                    zExists = new File((String) methodCall.argument("path")).exists();
                } catch (Exception unused) {
                }
                result.success(Boolean.valueOf(zExists));
                return;
            case "queryCursorNext":
                oo000o oo000oVarOooO0O08 = OooO0O0(methodCall, result);
                if (oo000oVarOooO0O08 == null) {
                    return;
                }
                f31029Oooo00O.OooO00o(oo000oVarOooO0O08, new o0OO00O(methodCall, result, oo000oVarOooO0O08, b == true ? 1 : 0));
                return;
            case "getPlatformVersion":
                result.success("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f31024OooOoo == null) {
                    f31024OooOoo = this.f31030OooOo0O.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                result.success(f31024OooOoo);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
