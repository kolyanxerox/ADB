package com.ironsource.mediationsdk.integration;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IntegrationData;
import com.unity3d.mediation.LevelPlay;

@Deprecated
/* loaded from: classes2.dex */
public class IntegrationHelper {

    /* renamed from: a */
    private static final String f9859a = "IntegrationHelper";

    /* renamed from: b */
    private static final String f9860b = "4.1";

    /* renamed from: c */
    private static final String f9861c = "4.3";

    /* renamed from: com.ironsource.mediationsdk.integration.IntegrationHelper$a */
    public class C3392a extends Thread {

        /* renamed from: a */
        final /* synthetic */ Context f9862a;

        public C3392a(Context context) {
            this.f9862a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(IntegrationHelper.f9859a, "--------------- Google Play Services --------------");
                if (!this.f9862a.getPackageManager().getApplicationInfo(this.f9862a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(IntegrationHelper.f9859a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(IntegrationHelper.f9859a, "Google Play Services - VERIFIED");
                String advertiserId = C3404p.m10470j().getAdvertiserId(this.f9862a);
                if (TextUtils.isEmpty(advertiserId)) {
                    return;
                }
                Log.i(IntegrationHelper.f9859a, "GAID is: " + advertiserId + " (use this for test devices)");
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                Log.e(IntegrationHelper.f9859a, "Google Play Services - MISSING");
            }
        }
    }

    /* renamed from: a */
    private static IntegrationData m10331a(Context context, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Context.class).invoke(null, context);
            Log.i(f9859a, "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException e) {
            C3551q9.m11517d().m11519a(e);
            str2 = "Adapter - MISSING";
            Log.e(f9859a, str2);
            return null;
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            str2 = "Adapter version - NOT VERIFIED";
            Log.e(f9859a, str2);
            return null;
        }
    }

    /* renamed from: b */
    private static void m10335b(Context context) {
        Log.i(f9859a, "*** Permissions ***");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            Log.i(f9859a, "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e(f9859a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            Log.i(f9859a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e(f9859a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b2  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void validateIntegration(android.content.Context r32) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(android.content.Context):void");
    }

    /* renamed from: a */
    private static void m10332a(Context context) {
        new C3392a(context).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0042  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m10336b(android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "IntegrationHelper"
            java.lang.String r1 = "com.ironsource.adapters."
            java.lang.String r2 = "--------------- "
            r3 = 0
            java.lang.String r4 = com.ironsource.environment.StringUtils.toLowerCase(r10)     // Catch: java.lang.Exception -> L2b
            int r5 = r4.hashCode()     // Catch: java.lang.Exception -> L2b
            r6 = -805296079(0xffffffffd0002831, float:-8.600471E9)
            r7 = 2
            r8 = 1
            if (r5 == r6) goto L38
            r6 = 92668925(0x58603fd, float:1.2602765E-35)
            if (r5 == r6) goto L2e
            r6 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r5 == r6) goto L21
            goto L42
        L21:
            java.lang.String r5 = "facebook"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L42
            r4 = r3
            goto L43
        L2b:
            r9 = move-exception
            goto L9d
        L2e:
            java.lang.String r5 = "admob"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L42
            r4 = r8
            goto L43
        L38:
            java.lang.String r5 = "vungle"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L42
            r4 = r7
            goto L43
        L42:
            r4 = -1
        L43:
            if (r4 == 0) goto L61
            if (r4 == r8) goto L5e
            if (r4 == r7) goto L5b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r4.<init>(r2)     // Catch: java.lang.Exception -> L2b
            r4.append(r10)     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = " --------------"
            r4.append(r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L2b
            goto L63
        L5b:
            java.lang.String r2 = "--------------- Liftoff Monetization --------------"
            goto L63
        L5e:
            java.lang.String r2 = "--------------- Google (AdMob and Ad Manager) --------------"
            goto L63
        L61:
            java.lang.String r2 = "--------------- Meta --------------"
        L63:
            android.util.Log.i(r0, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r2.<init>(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = com.ironsource.environment.StringUtils.toLowerCase(r10)     // Catch: java.lang.Exception -> L2b
            r2.append(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "."
            r2.append(r1)     // Catch: java.lang.Exception -> L2b
            r2.append(r10)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "Adapter"
            r2.append(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L2b
            com.ironsource.mediationsdk.IntegrationData r9 = m10331a(r9, r1)     // Catch: java.lang.Exception -> L2b
            if (r9 != 0) goto L8a
            return r3
        L8a:
            java.lang.String r2 = "IronSource"
            boolean r2 = r10.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L2b
            if (r2 != 0) goto L99
            boolean r9 = m10334a(r9)     // Catch: java.lang.Exception -> L2b
            if (r9 != 0) goto L99
            return r3
        L99:
            m10333a(r1)     // Catch: java.lang.Exception -> L2b
            return r8
        L9d:
            com.ironsource.q9 r1 = com.ironsource.C3551q9.m11517d()
            r1.m11519a(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isAdapterValid "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.e(r0, r10, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.m10336b(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m10333a(String str) {
        try {
            Log.i(f9859a, "SDK Version - " + ((String) Class.forName(str).getMethod("getAdapterSDKVersion", null).invoke(null, null)));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            Log.w("validateSDKVersion", "Unable to get SDK version");
        }
    }

    /* renamed from: a */
    private static boolean m10334a(IntegrationData integrationData) {
        if (integrationData.version.startsWith(f9860b) || integrationData.version.startsWith(f9861c)) {
            Log.i(f9859a, "Adapter - VERIFIED");
            return true;
        }
        Log.e(f9859a, integrationData.name + " adapter " + integrationData.version + " is incompatible with SDK version " + LevelPlay.getSdkVersion() + ", please update your adapter to version 4.1.*");
        return false;
    }
}
