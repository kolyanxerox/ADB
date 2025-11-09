package com.google.android.gms.ads.internal.util;

import OooO0oO.OooOo;
import OooOooo.o000O;
import Oooo0OO.o00oO0o;
import Oooo0o0.OooOO0;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1497dj;
import com.google.android.gms.internal.ads.AbstractC1965q8;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1539ep;
import com.google.android.gms.internal.ads.C1548ey;
import com.google.android.gms.internal.ads.C1853n7;
import com.google.android.gms.internal.ads.C1927p7;
import com.google.android.gms.internal.ads.C2148v6;
import com.google.android.gms.internal.ads.InterfaceC1722jo;
import com.google.android.gms.internal.ads.RunnableC1442c1;
import com.google.android.gms.internal.ads.a41;
import com.google.android.gms.internal.ads.g20;
import com.google.android.gms.internal.ads.gl0;
import com.google.android.gms.internal.ads.h20;
import com.google.android.gms.internal.ads.hl0;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.md0;
import com.google.android.gms.internal.ads.ni0;
import com.google.android.gms.internal.ads.nq0;
import com.google.android.gms.internal.ads.p10;
import com.google.android.gms.internal.ads.pj0;
import com.google.android.gms.internal.ads.uk0;
import com.google.android.gms.internal.ads.xh0;
import com.ironsource.C3034d9;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o00000oO.OooOOO;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzs {
    public static final pj0 zza = new zzf(Looper.getMainLooper());

    /* renamed from: OooO0oO */
    public String f16317OooO0oO;

    /* renamed from: OooO0oo */
    public volatile String f16318OooO0oo;

    /* renamed from: OooO00o */
    public final AtomicReference f16311OooO00o = new AtomicReference(null);

    /* renamed from: OooO0O0 */
    public final AtomicReference f16312OooO0O0 = new AtomicReference(null);

    /* renamed from: OooO0OO */
    public final AtomicReference f16313OooO0OO = new AtomicReference(new Bundle());

    /* renamed from: OooO0Oo */
    public final AtomicBoolean f16314OooO0Oo = new AtomicBoolean();

    /* renamed from: OooO0o0 */
    public boolean f16316OooO0o0 = true;

    /* renamed from: OooO0o */
    public final Object f16315OooO0o = new Object();

    /* renamed from: OooO */
    public boolean f16310OooO = false;

    /* renamed from: OooOO0 */
    public boolean f16319OooOO0 = false;

    /* renamed from: OooOO0O */
    public final ExecutorService f16320OooOO0O = Executors.newSingleThreadExecutor();

    public static Bundle OooO00o(Context context) {
        try {
            return OooOO0.OooO00o(context).OooO0O0(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    public static String OooO0O0(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static boolean OooO0OO(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final String OooO0Oo(final Context context, String str) {
        String strOooO0o0;
        if (str == null) {
            return OooO0o0();
        }
        try {
            zzcg zzcgVarZza = zzcg.zza();
            if (TextUtils.isEmpty(zzcgVarZza.f16262OooO00o)) {
                final Context contextOooO00o = o000O.OooO00o(context);
                zzcgVarZza.f16262OooO00o = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        SharedPreferences sharedPreferences;
                        Context context2 = contextOooO00o;
                        Context context3 = context;
                        boolean z = false;
                        if (context2 != null) {
                            zze.zza("Attempting to read user agent from Google Play Services.");
                            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                        } else {
                            zze.zza("Attempting to read user agent from local cache.");
                            sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                            z = true;
                        }
                        String string = sharedPreferences.getString("user_agent", "");
                        if (!TextUtils.isEmpty(string)) {
                            return string;
                        }
                        zze.zza("Reading user agent from WebSettings");
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                        if (z) {
                            sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                            zze.zza("Persisting user agent.");
                        }
                        return defaultUserAgent;
                    }
                });
            }
            strOooO0o0 = zzcgVarZza.f16262OooO00o;
        } catch (Exception unused) {
            strOooO0o0 = null;
        }
        if (TextUtils.isEmpty(strOooO0o0)) {
            strOooO0o0 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strOooO0o0)) {
            strOooO0o0 = OooO0o0();
        }
        String strOooOoo = OooOo.OooOoo(strOooO0o0, " (Mobile; ", str);
        try {
            if (OooOO0.OooO00o(context).OooO0Oo()) {
                strOooOoo = strOooOoo + ";aia";
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdUtil.getUserAgent", e);
        }
        return strOooOoo.concat(")");
    }

    public static final String OooO0o0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(StringUtils.SPACE);
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    @Nullable
    public static final zzbr zzA(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("Failed to instantiate WorkManagerUtil", e);
            return null;
        }
    }

    public static final boolean zzB(Context context, String str) {
        int i = AbstractC1497dj.f18262OooO00o;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return OooOO0.OooO00o(context).f13505OooO00o.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean zzC(Context context) {
        try {
            if (o00oO0o.f13851OooO0oo == null) {
                o00oO0o.f13851OooO0oo = Boolean.valueOf(o00oO0o.OooO() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return o00oO0o.f13851OooO0oo.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0066 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzD(java.lang.String r6) {
        /*
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzl.zzk()
            r1 = 0
            if (r0 != 0) goto L8
            goto L6b
        L8:
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.o00o0oO0
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.OooO00o(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1b
            goto L6b
        L1b:
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.o00o0oOO
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.OooO00o(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = ";"
            if (r2 != 0) goto L43
            java.lang.String[] r0 = r0.split(r3)
            int r2 = r0.length
            r4 = r1
        L35:
            if (r4 >= r2) goto L43
            r5 = r0[r4]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L40
            goto L6b
        L40:
            int r4 = r4 + 1
            goto L35
        L43:
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.o00o0oO
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.OooO00o(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L56
            goto L66
        L56:
            java.lang.String[] r0 = r0.split(r3)
            int r2 = r0.length
            r3 = r1
        L5c:
            if (r3 >= r2) goto L6b
            r4 = r0[r3]
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L68
        L66:
            r6 = 1
            return r6
        L68:
            int r3 = r3 + 1
            goto L5c
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzD(java.lang.String):boolean");
    }

    public static final boolean zzE(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
        return keyguardManager != null && keyguardManager.isKeyguardLocked();
    }

    public static final boolean zzF(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean zzG() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzH(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        try {
            Bundle bundleOooO00o = OooO00o(context);
            String string = bundleOooO00o.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(OooO0O0(bundleOooO00o))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzJ(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzK(View view, int i, MotionEvent motionEvent) {
        String strOooO00o;
        int i2;
        int iHeight;
        int iWidth;
        String str;
        kd0 kd0VarOooO0OO;
        md0 md0VarO0ooOoO;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof p10) {
                childAt = ((p10) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzj) || (childAt instanceof NativeAdView)) {
                strOooO00o = "NATIVE";
                i2 = 1;
            } else {
                strOooO00o = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            long jZzx = zzx(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof InterfaceC1722jo) || (md0VarO0ooOoO = ((InterfaceC1722jo) childAt).o0ooOoO()) == null) {
                str = "none";
            } else {
                str = md0VarO0ooOoO.f21205OooO0O0;
                childAt.setContentDescription(str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + childAt.hashCode());
            }
            if ((childAt instanceof InterfaceC1722jo) && (kd0VarOooO0OO = ((InterfaceC1722jo) childAt).OooO0OO()) != null) {
                strOooO00o = kd0.OooO00o(kd0VarOooO0OO.f20488OooO0O0);
                i2 = kd0VarOooO0OO.f20492OooO0o0;
                str2 = kd0VarOooO0OO.f20514OooOooo;
            }
            Locale locale = Locale.US;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str2 + ", gwsQueryId=" + str + ", format=" + strOooO00o + ", impType=" + i2 + ", class=" + childAt.getClass().getName() + ", x=" + i3 + ", y=" + i4 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jZzx + ", state=" + Integer.toString(i, 2) + ">");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzL(Context context) {
        com.google.android.gms.ads.internal.zzv.zzr();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzM(Context context, String str, String str2) {
        new zzbw(context, str, str2, null, null).zzb();
    }

    public static final void zzN(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) AbstractC1965q8.f23537OooO0O0.OooOOO()).booleanValue()) {
                o00oO0o.OooO00o(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final int zzO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    @Nullable
    public static final Map zzP(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.f17723OooOOOo)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] zzQ(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzR(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArr[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArr[1])};
    }

    public static final boolean zzS(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzv.zzq().f16316OooO0o0 || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long jZzx = zzx(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.f17825o000Oo0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0o0O)).booleanValue()) {
                    if (jZzx < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0oO0)).intValue()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void zzT(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOO0)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (SecurityException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
                com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdUtil.startActivityWithUnknownContext", e);
            }
        } catch (Throwable unused2) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final void zzU(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzp(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            com.google.android.gms.ads.internal.util.client.zzo.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzV(Activity activity) {
        int[] iArrZzQ = zzQ(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzQ[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzQ[1])};
    }

    public static final boolean zzW(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return zzS(view, powerManager, keyguardManager);
    }

    public static final void zzX(Context context, Intent intent, @Nullable h20 h20Var, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OOoo)).booleanValue() || !(context instanceof C1539ep)) {
            zzT(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0o0Oo0O))) {
                    ((C1539ep) context).OooO00o(intent);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0o0Oo0)).booleanValue() || h20Var == null) {
                        return;
                    }
                    C1548ey c1548eyOooO00o = h20Var.OooO00o();
                    c1548eyOooO00o.OooO0oO("action", "hila");
                    if (str == null) {
                        str = "";
                    }
                    c1548eyOooO00o.OooO0oO("gqi", str);
                    ((h20) c1548eyOooO00o.f18706OooOo).f19526OooO0O0.execute(new g20(c1548eyOooO00o, 2));
                    return;
                }
            }
            zzT(context, intent);
        } catch (ActivityNotFoundException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdUtil.startActivityForResult", e);
            zzT(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdUtil.startActivityForResult", e);
            zzT(context, intent);
        } catch (Exception e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdUtil.startActivityForResult", e3);
            zzT(context, intent);
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static List zzd() {
        C2148v6 c2148v6 = AbstractC1448c7.f17710OooO00o;
        ArrayList arrayListOooO0O0 = com.google.android.gms.ads.internal.client.zzbe.zza().OooO0O0();
        ArrayList arrayList = new ArrayList();
        int size = arrayListOooO0O0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooO0O0.get(i);
            i++;
            String str = (String) obj;
            ni0 ni0VarOooO0O0 = ni0.OooO0O0(new uk0(','));
            str.getClass();
            Iterator itOooO0Oo = ((hl0) ni0VarOooO0O0.f21493OooOo0o).OooO0Oo(ni0VarOooO0O0, str);
            while (true) {
                gl0 gl0Var = (gl0) itOooO0Oo;
                if (gl0Var.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) gl0Var.next()));
                    } catch (NumberFormatException unused) {
                        zze.zza("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            AbstractC2200wl.f25321OooO00o.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzo(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzo(android.view.View):boolean");
    }

    public static final void zzp(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzq(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return OooO0O0(OooO00o(context));
    }

    public static final String zzs() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : OooOo.OooOoo(str, StringUtils.SPACE, str2);
    }

    @Nullable
    public static final Integer zzt(Context context) {
        Object systemService = context.getSystemService(C3034d9.h.f8099d);
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzu(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final Map zzw(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdUtil.getMapOfFileNamesToKeysFromJsonString", e);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzx(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    @Nullable
    public static final WebResourceResponse zzy(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzz() {
        Resources resourcesOooO0O0 = com.google.android.gms.ads.internal.zzv.zzp().OooO0O0();
        return resourcesOooO0O0 != null ? resourcesOooO0O0.getString(com.google.android.gms.ads.impl.R.string.f3441s7) : "Test Ad";
    }

    public final OooOOO zzb(final Uri uri) {
        nq0 nq0Var = new nq0(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pj0 pj0Var = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                return zzs.zzP(uri);
            }
        });
        this.f16320OooOO0O.execute(nq0Var);
        return nq0Var;
    }

    public final String zzc(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOoo0)).booleanValue()) {
            if (this.f16318OooO0oo != null) {
                return this.f16318OooO0oo;
            }
            this.f16318OooO0oo = OooO0Oo(context, str);
            return this.f16318OooO0oo;
        }
        synchronized (this.f16315OooO0o) {
            try {
                String str2 = this.f16317OooO0oO;
                if (str2 != null) {
                    return str2;
                }
                String strOooO0Oo = OooO0Oo(context, str);
                this.f16317OooO0oO = strOooO0Oo;
                return strOooO0Oo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iZza = zza(i);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void zzi(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzv.zzq();
        bundle.putString(C3034d9.h.f8068G, zzs());
        C2148v6 c2148v6 = AbstractC1448c7.f17710OooO00o;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().OooO00o()));
        if (bundle.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0Ooo);
            boolean andSet = this.f16314OooO0Oo.getAndSet(true);
            AtomicReference atomicReference = this.f16313OooO0OO;
            if (!andSet) {
                atomicReference.set(zzad.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.f16313OooO0OO.set(zzad.zzb(context, str3));
                    }
                }));
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        com.google.android.gms.ads.internal.util.client.zzf.zzw(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                pj0 pj0Var = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                zzs.zzM(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.zza;
            }
        });
    }

    public final boolean zzj(String str) {
        return OooO0OO(str, this.f16311OooO00o, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.f17918o00Ooo));
    }

    public final boolean zzk(String str) {
        return OooO0OO(str, this.f16312OooO0O0, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.f17919o00o0O));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context) {
        if (this.f16319OooOO0) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC1448c7.OooO00o(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOoO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(), intentFilter, 4);
        }
        this.f16319OooOO0 = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzm(Context context) {
        if (this.f16310OooO) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC1448c7.OooO00o(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOoO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzq(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this), intentFilter, 4);
        }
        this.f16310OooO = true;
        return true;
    }

    public final int zzn(Context context, Uri uri) {
        String strOooOOO;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o00oO)).booleanValue()) {
            C1853n7 c1853n7Zzf = com.google.android.gms.ads.internal.zzv.zzf();
            if (c1853n7Zzf.f21427OooOoO0 == null) {
                AbstractC2200wl.f25321OooO00o.execute(new RunnableC1442c1(c1853n7Zzf, 9));
            }
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder(c1853n7Zzf.f21427OooOoO0).build();
            customTabsIntentBuild.intent.setPackage(xh0.OooOOO(context));
            customTabsIntentBuild.launchUrl(context, uri);
            return 5;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o00o0)).booleanValue()) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(uri);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return 9;
        }
        C1927p7 c1927p7 = new C1927p7();
        c1927p7.f23238OooO0Oo = new zzo(c1927p7, context, uri);
        Activity activity = (Activity) context;
        if (c1927p7.f23236OooO0O0 == null && (strOooOOO = xh0.OooOOO(activity)) != null) {
            a41 a41Var = new a41(c1927p7);
            c1927p7.f23237OooO0OO = a41Var;
            CustomTabsClient.bindCustomTabsService(activity, strOooOOO, a41Var);
        }
        return 5;
    }
}
