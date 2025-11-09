package OoooOOO;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.o000O00;
import com.ironsource.C3007ch;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO0OOo0o implements Application.ActivityLifecycleCallbacks {

    /* renamed from: OooOo0O */
    public final /* synthetic */ oO0O0OoO f14750OooOo0O;

    public oO0OOo0o(oO0O0OoO oo0o0ooo) {
        this.f14750OooOo0O = oo0o0ooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0046 A[Catch: all -> 0x0025, RuntimeException -> 0x0028, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:55:0x0002, B:57:0x0016, B:59:0x001c, B:74:0x0046, B:77:0x004d, B:79:0x0060, B:81:0x0068, B:87:0x0078, B:92:0x0085, B:67:0x002b, B:69:0x0032, B:71:0x003e), top: B:101:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(com.google.android.gms.internal.measurement.o000O00 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            OoooOOO.oO0O0OoO r1 = r8.f14750OooOo0O
            java.lang.Object r0 = r1.f14574OooOo0O     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            OoooOOO.o0OO0oO0 r0 = (OoooOOO.o0OO0oO0) r0     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            OoooOOO.o0O0O0o0 r2 = r0.f14520OooOoOO     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            OoooOOO.o0OO0oO0.OooOOO0(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            OoooOOO.o0O0oo0o r2 = r2.f14398Oooo0     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.OooO0O0(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r9.zzc     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L94
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2b
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L23
            goto L2b
        L23:
            r5 = r3
            goto L44
        L25:
            r0 = move-exception
            goto Lbe
        L28:
            r0 = move-exception
            goto La1
        L2b:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L43
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L43
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            goto L23
        L43:
            r5 = r4
        L44:
            if (r5 == 0) goto L94
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4d
            goto L94
        L4d:
            OoooOOO.oOO00OO r3 = r0.f14523OooOooO     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            OoooOOO.o0OO0oO0.OooOO0O(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L75
            java.lang.String r3 = "https://www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L75
            java.lang.String r3 = "android-app://com.google.appcrawler"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L71
            goto L75
        L71:
            java.lang.String r2 = "auto"
        L73:
            r6 = r2
            goto L78
        L75:
            java.lang.String r2 = "gs"
            goto L73
        L78:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r10 != 0) goto L83
            r2 = 1
        L81:
            r4 = r2
            goto L85
        L83:
            r2 = 0
            goto L81
        L85:
            OoooOOO.o0OO0o00 r0 = r0.f14522OooOoo0     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            OoooOOO.o0OO0oO0.OooOOO0(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            OoooOOO.oO0Ooooo r2 = new OoooOOO.oO0Ooooo     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r0.OooOo00(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            goto Lb1
        L94:
            java.lang.Object r0 = r1.f14574OooOo0O
            OoooOOO.o0OO0oO0 r0 = (OoooOOO.o0OO0oO0) r0
            OoooOOO.oO00o000 r0 = r0.f14528Oooo00O
            OoooOOO.o0OO0oO0.OooOO0o(r0)
            r0.OooOOoo(r9, r10)
            return
        La1:
            java.lang.Object r2 = r1.f14574OooOo0O     // Catch: java.lang.Throwable -> L25
            OoooOOO.o0OO0oO0 r2 = (OoooOOO.o0OO0oO0) r2     // Catch: java.lang.Throwable -> L25
            OoooOOO.o0O0O0o0 r2 = r2.f14520OooOoOO     // Catch: java.lang.Throwable -> L25
            OoooOOO.o0OO0oO0.OooOOO0(r2)     // Catch: java.lang.Throwable -> L25
            OoooOOO.o0O0oo0o r2 = r2.f14393OooOoOO     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.OooO0OO(r0, r3)     // Catch: java.lang.Throwable -> L25
        Lb1:
            java.lang.Object r0 = r1.f14574OooOo0O
            OoooOOO.o0OO0oO0 r0 = (OoooOOO.o0OO0oO0) r0
            OoooOOO.oO00o000 r0 = r0.f14528Oooo00O
            OoooOOO.o0OO0oO0.OooOO0o(r0)
            r0.OooOOoo(r9, r10)
            return
        Lbe:
            java.lang.Object r1 = r1.f14574OooOo0O
            OoooOOO.o0OO0oO0 r1 = (OoooOOO.o0OO0oO0) r1
            OoooOOO.oO00o000 r1 = r1.f14528Oooo00O
            OoooOOO.o0OO0oO0.OooOO0o(r1)
            r1.OooOOoo(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO0OOo0o.OooO00o(com.google.android.gms.internal.measurement.o000O00, android.os.Bundle):void");
    }

    public final void OooO0O0(o000O00 o000o002) {
        oO00o000 oo00o000 = ((o0OO0oO0) this.f14750OooOo0O.f14574OooOo0O).f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        synchronized (oo00o000.f14692Oooo00O) {
            try {
                if (Objects.equals(oo00o000.f14688OooOoo0, o000o002)) {
                    oo00o000.f14688OooOoo0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((o0OO0oO0) oo00o000.f14574OooOo0O).f14519OooOoO0.OooOoO0()) {
            oo00o000.f14686OooOoOO.remove(Integer.valueOf(o000o002.zza));
        }
    }

    public final void OooO0OO(o000O00 o000o002) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14750OooOo0O.f14574OooOo0O;
        oO00o000 oo00o000 = o0oo0oo0.f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        synchronized (oo00o000.f14692Oooo00O) {
            oo00o000.f14691Oooo000 = false;
            oo00o000.f14687OooOoo = true;
        }
        o0OO0oO0 o0oo0oo02 = (o0OO0oO0) oo00o000.f14574OooOo0O;
        o0oo0oo02.f14527Oooo000.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (o0oo0oo02.f14519OooOoO0.OooOoO0()) {
            oO00OOo0 oo00ooo0OooOOOo = oo00o000.OooOOOo(o000o002);
            oo00o000.f14685OooOoO0 = oo00o000.f14683OooOo;
            oo00o000.f14683OooOo = null;
            o0OO0o00 o0oo0o00 = o0oo0oo02.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo00(new oOOoOOO0(oo00o000, oo00ooo0OooOOOo, jElapsedRealtime));
        } else {
            oo00o000.f14683OooOo = null;
            o0OO0o00 o0oo0o002 = o0oo0oo02.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o002);
            o0oo0o002.OooOo00(new o0oOO(oo00o000, jElapsedRealtime));
        }
        oO0O0O00 oo0o0o00 = o0oo0oo0.f14521OooOoo;
        o0OO0oO0.OooOO0o(oo0o0o00);
        o0OO0oO0 o0oo0oo03 = (o0OO0oO0) oo0o0o00.f14574OooOo0O;
        o0oo0oo03.f14527Oooo000.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        o0OO0o00 o0oo0o003 = o0oo0oo03.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o003);
        o0oo0o003.OooOo00(new oO0O00O(oo0o0o00, jElapsedRealtime2, 1));
    }

    public final void OooO0Oo(o000O00 o000o002) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14750OooOo0O.f14574OooOo0O;
        oO0O0O00 oo0o0o00 = o0oo0oo0.f14521OooOoo;
        o0OO0oO0.OooOO0o(oo0o0o00);
        o0OO0oO0 o0oo0oo02 = (o0OO0oO0) oo0o0o00.f14574OooOo0O;
        o0oo0oo02.f14527Oooo000.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        o0OO0o00 o0oo0o00 = o0oo0oo02.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOo00(new oO0O00O(oo0o0o00, jElapsedRealtime, 0));
        oO00o000 oo00o000 = o0oo0oo0.f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        Object obj = oo00o000.f14692Oooo00O;
        synchronized (obj) {
            oo00o000.f14691Oooo000 = true;
            if (!Objects.equals(o000o002, oo00o000.f14688OooOoo0)) {
                synchronized (obj) {
                    oo00o000.f14688OooOoo0 = o000o002;
                    oo00o000.f14687OooOoo = false;
                    o0OO0oO0 o0oo0oo03 = (o0OO0oO0) oo00o000.f14574OooOo0O;
                    if (o0oo0oo03.f14519OooOoO0.OooOoO0()) {
                        oo00o000.f14689OooOooO = null;
                        o0OO0o00 o0oo0o002 = o0oo0oo03.f14522OooOoo0;
                        o0OO0oO0.OooOOO0(o0oo0o002);
                        o0oo0o002.OooOo00(new oO00Oo0(oo00o000, 1));
                    }
                }
            }
        }
        o0OO0oO0 o0oo0oo04 = (o0OO0oO0) oo00o000.f14574OooOo0O;
        if (!o0oo0oo04.f14519OooOoO0.OooOoO0()) {
            oo00o000.f14683OooOo = oo00o000.f14689OooOooO;
            o0OO0o00 o0oo0o003 = o0oo0oo04.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o003);
            o0oo0o003.OooOo00(new oO00Oo0(oo00o000, 0));
            return;
        }
        oo00o000.OooOo00(o000o002.zzb, oo00o000.OooOOOo(o000o002), false);
        o0oOOo o0oooo = ((o0OO0oO0) oo00o000.f14574OooOo0O).f14526Oooo0;
        o0OO0oO0.OooOO0(o0oooo);
        o0OO0oO0 o0oo0oo05 = (o0OO0oO0) o0oooo.f14574OooOo0O;
        o0oo0oo05.f14527Oooo000.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        o0OO0o00 o0oo0o004 = o0oo0oo05.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o004);
        o0oo0o004.OooOo00(new o0oOO(o0oooo, jElapsedRealtime2));
    }

    public final void OooO0o0(o000O00 o000o002, Bundle bundle) {
        oO00OOo0 oo00ooo0;
        oO00o000 oo00o000 = ((o0OO0oO0) this.f14750OooOo0O.f14574OooOo0O).f14528Oooo00O;
        o0OO0oO0.OooOO0o(oo00o000);
        if (!((o0OO0oO0) oo00o000.f14574OooOo0O).f14519OooOoO0.OooOoO0() || bundle == null || (oo00ooo0 = (oO00OOo0) oo00o000.f14686OooOoOO.get(Integer.valueOf(o000o002.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(C3007ch.f7763x, oo00ooo0.f14660OooO0OO);
        bundle2.putString("name", oo00ooo0.f14658OooO00o);
        bundle2.putString("referrer_name", oo00ooo0.f14659OooO0O0);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        OooO00o(o000O00.OooO0o0(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        OooO0O0(o000O00.OooO0o0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        OooO0OO(o000O00.OooO0o0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        OooO0Oo(o000O00.OooO0o0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        OooO0o0(o000O00.OooO0o0(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
