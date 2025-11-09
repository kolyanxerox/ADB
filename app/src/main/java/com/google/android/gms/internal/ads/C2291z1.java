package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.z1 */
/* loaded from: classes2.dex */
public final class C2291z1 extends BroadcastReceiver {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f26062OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ Object f26063OooO0O0;

    public /* synthetic */ C2291z1(Object obj, int i) {
        this.f26062OooO00o = i;
        this.f26063OooO0O0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void OooO00o(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 0
            r1 = 5
            if (r10 != 0) goto Ld
            goto L4e
        Ld:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
            r2 = 1
            if (r10 == 0) goto L1a
            boolean r3 = r10.isConnected()
            if (r3 != 0) goto L1c
        L1a:
            r0 = r2
            goto L4e
        L1c:
            int r3 = r10.getType()
            r4 = 2
            r5 = 9
            r6 = 6
            r7 = 4
            if (r3 == 0) goto L3a
            if (r3 == r2) goto L38
            if (r3 == r7) goto L3a
            if (r3 == r1) goto L3a
            if (r3 == r6) goto L36
            if (r3 == r5) goto L34
            r0 = 8
            goto L4e
        L34:
            r0 = 7
            goto L4e
        L36:
            r0 = r1
            goto L4e
        L38:
            r0 = r4
            goto L4e
        L3a:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L4d;
                case 2: goto L4d;
                case 3: goto L4b;
                case 4: goto L4b;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4b;
                case 8: goto L4b;
                case 9: goto L4b;
                case 10: goto L4b;
                case 11: goto L4b;
                case 12: goto L4b;
                case 13: goto L36;
                case 14: goto L4b;
                case 15: goto L4b;
                case 16: goto L41;
                case 17: goto L4b;
                case 18: goto L38;
                case 19: goto L41;
                case 20: goto L43;
                default: goto L41;
            }
        L41:
            r0 = r6
            goto L4e
        L43:
            int r10 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r2 = 29
            if (r10 < r2) goto L4e
            r0 = r5
            goto L4e
        L4b:
            r0 = r7
            goto L4e
        L4d:
            r0 = 3
        L4e:
            int r10 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r2 = 31
            java.lang.Object r3 = r8.f26063OooO0O0
            com.google.android.gms.internal.ads.b40 r3 = (com.google.android.gms.internal.ads.b40) r3
            if (r10 < r2) goto L7a
            if (r0 != r1) goto L7a
            java.lang.String r10 = "phone"
            java.lang.Object r10 = r9.getSystemService(r10)     // Catch: java.lang.RuntimeException -> L76
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.RuntimeException -> L76
            if (r10 == 0) goto L74
            com.google.android.gms.internal.ads.r20 r0 = new com.google.android.gms.internal.ads.r20     // Catch: java.lang.RuntimeException -> L76
            r0.<init>(r3)     // Catch: java.lang.RuntimeException -> L76
            java.util.concurrent.Executor r9 = r9.getMainExecutor()     // Catch: java.lang.RuntimeException -> L76
            r10.registerTelephonyCallback(r9, r0)     // Catch: java.lang.RuntimeException -> L76
            r10.unregisterTelephonyCallback(r0)     // Catch: java.lang.RuntimeException -> L76
            return
        L74:
            r9 = 0
            throw r9     // Catch: java.lang.RuntimeException -> L76
        L76:
            com.google.android.gms.internal.ads.b40.OooO0o(r3, r1)
            return
        L7a:
            com.google.android.gms.internal.ads.b40.OooO0o(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2291z1.OooO00o(android.content.Context, android.content.Intent):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f26062OooO00o) {
            case 0:
                ((ViewOnAttachStateChangeListenerC1370a2) this.f26063OooO0O0).OooO0OO();
                break;
            case 1:
                ((ViewOnAttachStateChangeListenerC1517e3) this.f26063OooO0O0).OooO0OO(3);
                break;
            case 2:
                OooO00o(context, intent);
                break;
            default:
                if (!isInitialStickyBroadcast()) {
                    C1643hi c1643hi = (C1643hi) this.f26063OooO0O0;
                    c1643hi.OooOO0(q61.OooO0OO(context, intent, (j50) c1643hi.f19793OooOooO, (pd0) c1643hi.f19791OooOoo));
                    break;
                }
                break;
        }
    }
}
