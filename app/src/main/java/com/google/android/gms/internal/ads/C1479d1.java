package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.ironsource.C3121fl;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.d1 */
/* loaded from: classes2.dex */
public final class C1479d1 implements InterfaceC1552f1 {

    /* renamed from: Oooo0o, reason: collision with root package name */
    public static C1479d1 f18111Oooo0o;

    /* renamed from: OooOo, reason: collision with root package name */
    public final fj0 f18112OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f18113OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final b40 f18114OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final OoooO0O.o00Ooo f18115OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final hj0 f18116OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final OoooOOO.o0O0oo00 f18117OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final o0O f18118OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final ExecutorService f18119OooOoo0;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final C1443c2 f18121OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final o0OOO0o f18123Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final p80 f18124Oooo00O;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public volatile boolean f18126Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public volatile boolean f18127Oooo0OO;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public final int f18128Oooo0o0;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public volatile long f18125Oooo00o = 0;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final Object f18122Oooo0 = new Object();

    /* renamed from: OooOooO, reason: collision with root package name */
    public final CountDownLatch f18120OooOooO = new CountDownLatch(1);

    public C1479d1(Context context, OoooOOO.o0O0oo00 o0o0oo00, b40 b40Var, fj0 fj0Var, hj0 hj0Var, OoooO0O.o00Ooo o00ooo2, ExecutorService executorService, o0O o0o, int i, C1443c2 c1443c2, o0OOO0o o0ooo0o, p80 p80Var) {
        this.f18127Oooo0OO = false;
        this.f18113OooOo0O = context;
        this.f18117OooOoOO = o0o0oo00;
        this.f18114OooOo0o = b40Var;
        this.f18112OooOo = fj0Var;
        this.f18116OooOoO0 = hj0Var;
        this.f18115OooOoO = o00ooo2;
        this.f18119OooOoo0 = executorService;
        this.f18128Oooo0o0 = i;
        this.f18121OooOooo = c1443c2;
        this.f18123Oooo000 = o0ooo0o;
        this.f18124Oooo00O = p80Var;
        this.f18127Oooo0OO = false;
        this.f18118OooOoo = new o0O(o0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[Catch: all -> 0x0098, k01 -> 0x009b, TryCatch #0 {k01 -> 0x009b, blocks: (B:6:0x001d, B:8:0x002b, B:12:0x0031, B:13:0x003f, B:15:0x004d, B:17:0x005b, B:20:0x0068, B:32:0x009e, B:36:0x00b7, B:42:0x00d0, B:43:0x00dd, B:45:0x00e3, B:47:0x00eb, B:48:0x00ee, B:39:0x00c1, B:40:0x00c8, B:23:0x006f, B:25:0x0085, B:49:0x00f8, B:50:0x0105, B:51:0x0112), top: B:58:0x001d, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO00o(com.google.android.gms.internal.ads.C1479d1 r7) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1479d1.OooO00o(com.google.android.gms.internal.ads.d1):void");
    }

    public static synchronized C1479d1 OooO0Oo(Context context, ExecutorService executorService, hi0 hi0Var, boolean z) {
        try {
            if (f18111Oooo0o == null) {
                OoooOOO.o0O0oo00 o0o0oo00OooO0OO = OoooOOO.o0O0oo00.OooO0OO(context, executorService, z);
                C1847n1 c1847n1OooO0Oo = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17938oo0O)).booleanValue() ? C1847n1.OooO0Oo(context) : null;
                C1443c2 c1443c2 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17888o00OO)).booleanValue() ? new C1443c2(context, executorService, C1443c2.f17651OooO0o0) : null;
                o0OOO0o o0ooo0o = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue() ? new o0OOO0o() : null;
                p80 p80Var = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17875o00O0Oo0)).booleanValue() ? new p80(5) : null;
                OooOOo0.o0OOO0o o0ooo0oOooOoO0 = OooOOo0.o0OOO0o.OooOoO0(context, executorService, o0o0oo00OooO0OO, hi0Var);
                zzavw zzavwVar = new zzavw(context);
                OoooO0O.o00Ooo o00ooo2 = new OoooO0O.o00Ooo(hi0Var, o0ooo0oOooOoO0, new ViewOnAttachStateChangeListenerC1370a2(context, zzavwVar), zzavwVar, c1847n1OooO0Oo, c1443c2, o0ooo0o, p80Var);
                int iOooOo0o = ii0.OooOo0o(context, o0o0oo00OooO0OO);
                o0O o0o = new o0O(3);
                C1479d1 c1479d1 = new C1479d1(context, o0o0oo00OooO0OO, new b40(context, iOooOo0o), new fj0(context, iOooOo0o, new wj0(o0o0oo00OooO0OO, 4), ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17926o0O0ooO)).booleanValue()), new hj0(context, o00ooo2, o0o0oo00OooO0OO, o0o), o00ooo2, executorService, o0o, iOooOo0o, c1443c2, o0ooo0o, p80Var);
                f18111Oooo0o = c1479d1;
                c1479d1.OooO0O0();
                f18111Oooo0o.OooO0OO();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18111Oooo0o;
    }

    public final synchronized void OooO0O0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        OooOOo0.o0OOO0o o0ooo0oOooO0o0 = OooO0o0();
        if (o0ooo0oOooO0o0 == null) {
            this.f18117OooOoOO.OooO0oo(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f18116OooOoO0.OooO0O0(o0ooo0oOooO0o0)) {
            this.f18127Oooo0OO = true;
            this.f18120OooOooO.countDown();
        }
    }

    public final void OooO0OO() {
        OooOOo0.o0OOO0o o0ooo0o;
        if (this.f18126Oooo0O0) {
            return;
        }
        synchronized (this.f18122Oooo0) {
            try {
                if (!this.f18126Oooo0O0) {
                    if ((System.currentTimeMillis() / 1000) - this.f18125Oooo00o < 3600) {
                        return;
                    }
                    hj0 hj0Var = this.f18116OooOoO0;
                    synchronized (hj0Var.f19805OooO0o0) {
                        C2051sk c2051sk = hj0Var.f19804OooO0Oo;
                        o0ooo0o = c2051sk != null ? (OooOOo0.o0OOO0o) c2051sk.f24096OooOo : null;
                    }
                    if (o0ooo0o == null || ((C2070t2) o0ooo0o.f13518OooOo0o).OooOo() - (System.currentTimeMillis() / 1000) < 3600) {
                        int i = this.f18128Oooo0o0 - 1;
                        if (i == 2 || i == 4 || i == 5 || i == 6 || i == 7) {
                            this.f18119OooOoo0.execute(new RunnableC1442c1(this, 0));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }

    public final OooOOo0.o0OOO0o OooO0o0() {
        int i = this.f18128Oooo0o0 - 1;
        if (i == 2 || i == 4 || i == 5 || i == 6 || i == 7) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17768o00)).booleanValue()) {
                fj0 fj0Var = this.f18112OooOo;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (fj0.f18953OooOoOO) {
                    try {
                        C2070t2 c2070t2OooO0oO = fj0Var.OooO0oO(1);
                        if (c2070t2OooO0oO == null) {
                            fj0Var.OooO0o(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileOooO0Oo = fj0Var.OooO0Oo(c2070t2OooO0oO.OooOooo());
                        File file = new File(fileOooO0Oo, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileOooO0Oo, "pcam");
                        }
                        File file2 = new File(fileOooO0Oo, "pcbc");
                        File file3 = new File(fileOooO0Oo, "pcopt");
                        fj0Var.OooO0o(5016, jCurrentTimeMillis);
                        return new OooOOo0.o0OOO0o(c2070t2OooO0oO, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            b40 b40Var = this.f18114OooOo0o;
            C2070t2 c2070t2OooO0Oo = b40Var.OooO0Oo(1);
            if (c2070t2OooO0Oo != null) {
                String strOooOooo = c2070t2OooO0Oo.OooOooo();
                File fileOooo00O = xh0.Oooo00O(strOooOooo, "pcam.jar", b40Var.OooO0oO());
                if (!fileOooo00O.exists()) {
                    fileOooo00O = xh0.Oooo00O(strOooOooo, "pcam", b40Var.OooO0oO());
                }
                return new OooOOo0.o0OOO0o(c2070t2OooO0Oo, fileOooo00O, xh0.Oooo00O(strOooOooo, "pcbc", b40Var.OooO0oO()), xh0.Oooo00O(strOooOooo, "pcopt", b40Var.OooO0oO()));
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zze(Context context, String str, View view, Activity activity) {
        String strOooOooo;
        C1443c2 c1443c2 = this.f18121OooOooo;
        if (c1443c2 != null && c1443c2.f17655OooO0Oo) {
            c1443c2.f17653OooO0O0 = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
            o0OOO0o o0ooo0o = this.f18123Oooo000;
            o0ooo0o.f22138OooO0oo = o0ooo0o.f22137OooO0oO;
            o0ooo0o.f22137OooO0oO = SystemClock.uptimeMillis();
        }
        OooO0OO();
        C2051sk c2051skOooO00o = this.f18116OooOoO0.OooO00o();
        if (c2051skOooO00o == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (c2051skOooO00o) {
            OoooO0O.o00Ooo o00ooo2 = (OoooO0O.o00Ooo) c2051skOooO00o.f24100OooOoO0;
            HashMap mapOooO0Oo = o00ooo2.OooO0Oo();
            ViewOnAttachStateChangeListenerC1370a2 viewOnAttachStateChangeListenerC1370a2 = (ViewOnAttachStateChangeListenerC1370a2) o00ooo2.f14026OooO0OO;
            if (viewOnAttachStateChangeListenerC1370a2.f16890Oooo00O <= -2) {
                WeakReference weakReference = viewOnAttachStateChangeListenerC1370a2.f16885OooOoo;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    viewOnAttachStateChangeListenerC1370a2.f16890Oooo00O = -3L;
                }
            }
            mapOooO0Oo.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC1370a2.f16890Oooo00O));
            mapOooO0Oo.put("f", "c");
            mapOooO0Oo.put("ctx", context);
            mapOooO0Oo.put("cs", str);
            mapOooO0Oo.put(C3121fl.f8585b, null);
            mapOooO0Oo.put("view", view);
            mapOooO0Oo.put("act", activity);
            strOooOooo = C2051sk.OooOooo(c2051skOooO00o.Oooo000(mapOooO0Oo));
        }
        this.f18117OooOoOO.OooOO0(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strOooOooo, null);
        return strOooOooo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzf(Context context) {
        String strOooOooo;
        C1443c2 c1443c2 = this.f18121OooOooo;
        if (c1443c2 != null && c1443c2.f17655OooO0Oo) {
            c1443c2.f17653OooO0O0 = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
            o0OOO0o o0ooo0o = this.f18123Oooo000;
            o0ooo0o.f22132OooO0O0 = o0ooo0o.f22131OooO00o;
            o0ooo0o.f22131OooO00o = SystemClock.uptimeMillis();
        }
        OooO0OO();
        C2051sk c2051skOooO00o = this.f18116OooOoO0.OooO00o();
        if (c2051skOooO00o == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (c2051skOooO00o) {
            HashMap mapOooO0OO = ((OoooO0O.o00Ooo) c2051skOooO00o.f24100OooOoO0).OooO0OO();
            mapOooO0OO.put("f", "q");
            mapOooO0OO.put("ctx", context);
            mapOooO0OO.put(C3121fl.f8585b, null);
            strOooOooo = C2051sk.OooOooo(c2051skOooO00o.Oooo000(mapOooO0OO));
        }
        this.f18117OooOoOO.OooOO0(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - jCurrentTimeMillis, null, strOooOooo, null);
        return strOooOooo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzh(Context context, View view, Activity activity) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String strOooOooo;
        C1443c2 c1443c2 = this.f18121OooOooo;
        if (c1443c2 != null && c1443c2.f17655OooO0Oo) {
            c1443c2.f17653OooO0O0 = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
            this.f18123Oooo000.OooO0O0(context, view);
        }
        OooO0OO();
        C2051sk c2051skOooO00o = this.f18116OooOoO0.OooO00o();
        if (c2051skOooO00o == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (c2051skOooO00o) {
            OoooO0O.o00Ooo o00ooo2 = (OoooO0O.o00Ooo) c2051skOooO00o.f24100OooOoO0;
            HashMap mapOooO0Oo = o00ooo2.OooO0Oo();
            p80 p80Var = (p80) o00ooo2.f14031OooO0oo;
            if (p80Var != null) {
                List list = (List) p80Var.f23242OooOo0o;
                p80Var.f23242OooOo0o = Collections.EMPTY_LIST;
                mapOooO0Oo.put("vst", list);
            }
            mapOooO0Oo.put("f", "v");
            mapOooO0Oo.put("ctx", context);
            mapOooO0Oo.put(C3121fl.f8585b, null);
            mapOooO0Oo.put("view", view);
            mapOooO0Oo.put("act", activity);
            strOooOooo = C2051sk.OooOooo(c2051skOooO00o.Oooo000(mapOooO0Oo));
        }
        this.f18117OooOoOO.OooOO0(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - jCurrentTimeMillis, null, strOooOooo, null);
        return strOooOooo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzk(MotionEvent motionEvent) {
        C2051sk c2051skOooO00o = this.f18116OooOoO0.OooO00o();
        if (c2051skOooO00o != null) {
            try {
                c2051skOooO00o.OooOo0(motionEvent);
            } catch (gj0 e) {
                this.f18117OooOoOO.OooO0oO(e.f19372OooOo0O, -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000Oo)).booleanValue() || (displayMetrics = this.f18113OooOo0O.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        p80 p80Var = this.f18124Oooo00O;
        if (p80Var != null) {
            p80Var.f23242OooOo0o = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzo(View view) {
        ((ViewOnAttachStateChangeListenerC1370a2) this.f18115OooOoO.f14026OooO0OO).OooO00o(view);
    }
}
