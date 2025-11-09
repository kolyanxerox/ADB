package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import com.google.android.gms.ads.internal.client.zzbe;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.g1 */
/* loaded from: classes2.dex */
public final class C1589g1 implements InterfaceC1552f1 {

    /* renamed from: OoooO, reason: collision with root package name */
    public static final Object f19156OoooO = new Object();

    /* renamed from: OoooO0O, reason: collision with root package name */
    public static volatile C2143v1 f19157OoooO0O = null;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public static boolean f19158OoooOO0 = false;

    /* renamed from: OoooOOO, reason: collision with root package name */
    public static C1847n1 f19159OoooOOO;

    /* renamed from: OoooOOo, reason: collision with root package name */
    public static C1443c2 f19160OoooOOo;

    /* renamed from: OoooOo0, reason: collision with root package name */
    public static o0OOO0o f19161OoooOo0;

    /* renamed from: OoooOoO, reason: collision with root package name */
    public static de0 f19162OoooOoO;

    /* renamed from: OoooOoo, reason: collision with root package name */
    public static C1847n1 f19163OoooOoo;
    public static long o000oOoO;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public MotionEvent f19165OooOo0O;

    /* renamed from: OooOooo, reason: collision with root package name */
    public double f19173OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.o0OOO00 f19174Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public float f19175Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public double f19176Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public double f19177Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public float f19178Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public float f19179Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public float f19180Oooo0OO;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public final DisplayMetrics f19183Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final p80 f19184Oooo0oo;

    /* renamed from: OoooO0, reason: collision with root package name */
    public final HashMap f19185OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC1370a2 f19186OoooO00;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final LinkedList f19166OooOo0o = new LinkedList();

    /* renamed from: OooOo, reason: collision with root package name */
    public long f19164OooOo = 0;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f19168OooOoO0 = 0;

    /* renamed from: OooOoO, reason: collision with root package name */
    public long f19167OooOoO = 0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public long f19169OooOoOO = 0;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public long f19171OooOoo0 = 0;

    /* renamed from: OooOoo, reason: collision with root package name */
    public long f19170OooOoo = 0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public long f19172OooOooO = 0;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f19182Oooo0o0 = false;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public boolean f19181Oooo0o = false;

    public C1589g1(Context context, com.google.android.gms.internal.measurement.o0OOO00 o0ooo00) {
        try {
            AbstractC2142v0.OooO0O0();
            this.f19183Oooo0oO = context.getResources().getDisplayMetrics();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17875o00O0Oo0)).booleanValue()) {
                this.f19184Oooo0oo = new p80(5);
            }
        } catch (Throwable unused) {
        }
        this.f19185OoooO0 = new HashMap();
        this.f19174Oooo = o0ooo00;
    }

    public static C2143v1 OooO0o(Context context, boolean z) {
        if (f19157OoooO0O == null) {
            synchronized (f19156OoooO) {
                try {
                    if (f19157OoooO0O == null) {
                        C2143v1 c2143v1OooO0OO = C2143v1.OooO0OO(context, z, f19163OoooOoo);
                        if (c2143v1OooO0OO.f24829OooOOo0) {
                            try {
                                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OO0o0)).booleanValue()) {
                                    c2143v1OooO0OO.OooO0o0("w4g9FXzOzEwcEeCpaSre5nXuOUCFa92GFetfeeKgPQcF4KCZSoB1ybtd0ZEBGNIA", "edZBbMBYITINvHy1TGuBnyHrwyVIJEJzJQocfZ8d7ZI=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            c2143v1OooO0OO.OooO0o0("mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", Context.class);
                            c2143v1OooO0OO.OooO0o0("dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", Context.class);
                            c2143v1OooO0OO.OooO0o0("fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", Context.class);
                            c2143v1OooO0OO.OooO0o0("BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", Context.class);
                            c2143v1OooO0OO.OooO0o0("P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", Context.class);
                            Class cls = Boolean.TYPE;
                            c2143v1OooO0OO.OooO0o0("GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", Context.class, cls);
                            c2143v1OooO0OO.OooO0o0("rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", Context.class);
                            c2143v1OooO0OO.OooO0o0("IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", Context.class);
                            c2143v1OooO0OO.OooO0o0("zquiBLNsiJH5keRetXBCNmjSlO+FJBcpgfDbltZRb+WTF5I/NRR9hCGZxARfGH0K", "1hqMb526iXwDuGjyfOFzL8CpmWwTXgqej4g8gq9uBJ4=", MotionEvent.class, DisplayMetrics.class);
                            c2143v1OooO0OO.OooO0o0("kP6ItNwnvZ5+WyUcaZ02EOdpRTj+BEXM0VKXOe+cRQHvvVlFaFzrbSSXSpAmSH7O", "CbvMM1RmBqY6HgXPSjmPhmgdiwuju3NT+G66/tI7UPk=", MotionEvent.class, DisplayMetrics.class);
                            c2143v1OooO0OO.OooO0o0("y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", new Class[0]);
                            c2143v1OooO0OO.OooO0o0("ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", new Class[0]);
                            c2143v1OooO0OO.OooO0o0("IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", new Class[0]);
                            c2143v1OooO0OO.OooO0o0("bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", new Class[0]);
                            c2143v1OooO0OO.OooO0o0("bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", new Class[0]);
                            c2143v1OooO0OO.OooO0o0("SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", new Class[0]);
                            c2143v1OooO0OO.OooO0o0("oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", Context.class, cls, String.class);
                            c2143v1OooO0OO.OooO0o0("xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", StackTraceElement[].class);
                            c2143v1OooO0OO.OooO0o0("mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", View.class, DisplayMetrics.class, cls, cls);
                            c2143v1OooO0OO.OooO0o0("dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", Context.class, cls);
                            c2143v1OooO0OO.OooO0o0("gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", View.class, Activity.class, cls);
                            c2143v1OooO0OO.OooO0o0("IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", Long.TYPE);
                            c2143v1OooO0OO.OooO0o0("3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", new Class[0]);
                            try {
                                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17896o00OO0oo)).booleanValue()) {
                                    c2143v1OooO0OO.OooO0o0("VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            c2143v1OooO0OO.OooO0o0("yo4AnI5HYhoV2EsbpvhPGv0ZIHdCUEOv2Gre1uIL5QmSqEaPxW/DTBG1l9mfjeJL", "v4ERF2BZ8VhfOGsNaLYR31bPmiZ7/cUjCjYq2SCVO2Q=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17938oo0O)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        c2143v1OooO0OO.OooO0o0("zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17875o00O0Oo0)).booleanValue()) {
                                    c2143v1OooO0OO.OooO0o0("nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                            } catch (IllegalStateException unused5) {
                            }
                            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                c2143v1OooO0OO.OooO0o0("e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17866o00O0O0)).booleanValue()) {
                                        c2143v1OooO0OO.OooO0o0("SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused6) {
                                }
                            }
                        }
                        f19157OoooO0O = c2143v1OooO0OO;
                    }
                } finally {
                }
            }
        }
        return f19157OoooO0O;
    }

    public static C2180w1 OooO0oo(C2143v1 c2143v1, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws C1995r1 {
        Method methodOooO0Oo = c2143v1.OooO0Oo("zquiBLNsiJH5keRetXBCNmjSlO+FJBcpgfDbltZRb+WTF5I/NRR9hCGZxARfGH0K", "1hqMb526iXwDuGjyfOFzL8CpmWwTXgqej4g8gq9uBJ4=");
        if (methodOooO0Oo == null || motionEvent == null) {
            throw new C1995r1();
        }
        try {
            return new C2180w1((String) methodOooO0Oo.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C1995r1(e);
        }
    }

    public static final void OooOO0o(List list) throws InterruptedException {
        ExecutorService executorService;
        if (f19157OoooO0O == null || (executorService = f19157OoooO0O.f24815OooO0O0) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17864o00O00oO)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Log.d("g1", "class methods got exception: " + stringWriter.toString());
        }
    }

    public static C1589g1 OooOOO0(Context context, com.google.android.gms.internal.measurement.o0OOO00 o0ooo00) {
        synchronized (C1589g1.class) {
            try {
                if (!f19158OoooOO0) {
                    o000oOoO = System.currentTimeMillis() / 1000;
                    f19157OoooO0O = OooO0o(context, o0ooo00.f26563OooOo0O);
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17938oo0O)).booleanValue()) {
                        f19159OoooOOO = C1847n1.OooO0Oo(context);
                    }
                    ExecutorService executorService = f19157OoooO0O.f24815OooO0O0;
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17888o00OO)).booleanValue() && executorService != null) {
                        f19160OoooOOo = new C1443c2(context, executorService, C1443c2.f17651OooO0o0);
                    }
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
                        f19161OoooOo0 = new o0OOO0o();
                    }
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17872o00O0OOO)).booleanValue() || ((C1993r) o0ooo00.f26562OooOo).OooOoo0()) {
                        f19163OoooOoo = new C1847n1(context, executorService);
                    }
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17869o00O0O0o)).booleanValue() || ((C1993r) o0ooo00.f26562OooOo).OooOoOO()) {
                        f19162OoooOoO = new de0(context, executorService, (C1993r) o0ooo00.f26562OooOo, f19163OoooOoo);
                    }
                    f19158OoooOO0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new C1589g1(context, o0ooo00);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OooO(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1589g1.OooO(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    public final long OooO00o(StackTraceElement[] stackTraceElementArr) throws C1995r1 {
        Method methodOooO0Oo = f19157OoooO0O.OooO0Oo("xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=");
        if (methodOooO0Oo == null || stackTraceElementArr == null) {
            throw new C1995r1();
        }
        try {
            return new C1773l1((String) methodOooO0Oo.invoke(null, stackTraceElementArr)).f20768OooO0oo.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C1995r1(e);
        }
    }

    public final C2104u OooO0O0(Context context, View view, Activity activity) throws InterruptedException {
        C1443c2 c1443c2 = f19160OoooOOo;
        if (c1443c2 != null && c1443c2.f17655OooO0Oo) {
            c1443c2.f17653OooO0O0 = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
            o0OOO0o o0ooo0o = f19161OoooOo0;
            o0ooo0o.f22138OooO0oo = o0ooo0o.f22137OooO0oO;
            o0ooo0o.f22137OooO0oO = SystemClock.uptimeMillis();
        }
        C2104u c2104uOoooOOO = C1514e0.OoooOOO();
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f19174Oooo;
        if (!TextUtils.isEmpty((String) o0ooo00.f26564OooOo0o)) {
            c2104uOoooOOO.OooO0Oo();
            C1514e0.o000OOo((C1514e0) c2104uOoooOOO.f25822OooOo0o, (String) o0ooo00.f26564OooOo0o);
        }
        OooOO0O(OooO0o(context, o0ooo00.f26563OooOo0O), c2104uOoooOOO, view, activity, true, context);
        return c2104uOoooOOO;
    }

    public final C2104u OooO0OO(Context context) throws InterruptedException {
        ArrayList arrayListOooOO0;
        C1443c2 c1443c2 = f19160OoooOOo;
        if (c1443c2 != null && c1443c2.f17655OooO0Oo) {
            c1443c2.f17653OooO0O0 = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
            o0OOO0o o0ooo0o = f19161OoooOo0;
            o0ooo0o.f22132OooO0O0 = o0ooo0o.f22131OooO00o;
            o0ooo0o.f22131OooO00o = SystemClock.uptimeMillis();
        }
        C2104u c2104uOoooOOO = C1514e0.OoooOOO();
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f19174Oooo;
        if (!TextUtils.isEmpty((String) o0ooo00.f26564OooOo0o)) {
            c2104uOoooOOO.OooO0Oo();
            C1514e0.o000OOo((C1514e0) c2104uOoooOOO.f25822OooOo0o, (String) o0ooo00.f26564OooOo0o);
        }
        boolean z = o0ooo00.f26563OooOo0O;
        C2143v1 c2143v1OooO0o = OooO0o(context, z);
        if (c2143v1OooO0o.f24815OooO0O0 != null) {
            if (z) {
                int iOooO00o = c2143v1OooO0o.OooO00o();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(OooOO0(c2143v1OooO0o, context, c2104uOoooOOO));
                arrayList.add(new C1664i2(c2143v1OooO0o, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", c2104uOoooOOO, iOooO00o, 24));
                arrayListOooOO0 = arrayList;
            } else {
                arrayListOooOO0 = OooOO0(c2143v1OooO0o, context, c2104uOoooOOO);
            }
            OooOO0o(arrayListOooOO0);
        }
        return c2104uOoooOOO;
    }

    public final C2104u OooO0Oo(Context context, View view, Activity activity) throws IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
        C1443c2 c1443c2 = f19160OoooOOo;
        if (c1443c2 != null && c1443c2.f17655OooO0Oo) {
            c1443c2.f17653OooO0O0 = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
            f19161OoooOo0.OooO0O0(context, view);
        }
        C2104u c2104uOoooOOO = C1514e0.OoooOOO();
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f19174Oooo;
        String str = (String) o0ooo00.f26564OooOo0o;
        c2104uOoooOOO.OooO0Oo();
        C1514e0.o000OOo((C1514e0) c2104uOoooOOO.f25822OooOo0o, str);
        OooOO0O(OooO0o(context, o0ooo00.f26563OooOo0O), c2104uOoooOOO, view, activity, false, context);
        return c2104uOoooOOO;
    }

    public final C2180w1 OooO0o0(MotionEvent motionEvent) throws C1995r1 {
        Method methodOooO0Oo = f19157OoooO0O.OooO0Oo("kP6ItNwnvZ5+WyUcaZ02EOdpRTj+BEXM0VKXOe+cRQHvvVlFaFzrbSSXSpAmSH7O", "CbvMM1RmBqY6HgXPSjmPhmgdiwuju3NT+G66/tI7UPk=");
        if (methodOooO0Oo == null || motionEvent == null) {
            throw new C1995r1();
        }
        try {
            return new C2180w1((String) methodOooO0Oo.invoke(null, motionEvent, this.f19183Oooo0oO));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C1995r1(e);
        }
    }

    public final void OooO0oO() {
        this.f19171OooOoo0 = 0L;
        this.f19164OooOo = 0L;
        this.f19168OooOoO0 = 0L;
        this.f19167OooOoO = 0L;
        this.f19169OooOoOO = 0L;
        this.f19170OooOoo = 0L;
        this.f19172OooOooO = 0L;
        LinkedList linkedList = this.f19166OooOo0o;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f19165OooOo0O;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f19165OooOo0O = null;
    }

    public final ArrayList OooOO0(C2143v1 c2143v1, Context context, C2104u c2104u) {
        long j;
        int iOooO00o = c2143v1.OooO00o();
        ArrayList arrayList = new ArrayList();
        if (!c2143v1.f24829OooOOo0) {
            c2104u.OooO0Oo();
            C1514e0.Oooo00o((C1514e0) c2104u.f25822OooOo0o, Http2Stream.EMIT_BUFFER_SIZE);
            return arrayList;
        }
        C1553f2 c1553f2 = new C1553f2(c2143v1, c2104u, iOooO00o, context, (C1993r) this.f19174Oooo.f26562OooOo, f19162OoooOoO);
        int i = iOooO00o;
        arrayList.add(c1553f2);
        arrayList.add(new C1627h2(c2143v1, c2104u, o000oOoO, i));
        arrayList.add(new C1590g2(c2143v1, c2104u, i, 2));
        arrayList.add(new C1480d2(c2143v1, c2104u, i, context));
        C2104u c2104u2 = c2104u;
        arrayList.add(new C1590g2(c2143v1, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", c2104u, i, 33, 3));
        arrayList.add(new C1516e2(c2143v1, c2104u2, i, context));
        arrayList.add(new C1590g2(c2143v1, c2104u2, i, 6));
        arrayList.add(new C1590g2(c2143v1, c2104u2, i, 8));
        arrayList.add(new C1590g2(c2143v1, c2104u2, i, 9));
        arrayList.add(new C1590g2(c2143v1, c2104u2, i, 0));
        arrayList.add(new C1590g2(c2143v1, c2104u2, i, 1));
        arrayList.add(new C1590g2(c2143v1, c2104u2, i, 12));
        arrayList.add(new C1590g2(c2143v1, c2104u2, i, 5));
        arrayList.add(new C1590g2(c2143v1, c2104u2, i, 11));
        arrayList.add(new C1848n2(c2143v1, c2104u2, i));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17938oo0O)).booleanValue()) {
            C1443c2 c1443c2 = f19160OoooOOo;
            long j2 = -1;
            if (c1443c2 != null) {
                long j3 = c1443c2.f17655OooO0Oo ? c1443c2.f17653OooO0O0 - c1443c2.f17652OooO00o : -1L;
                long j4 = c1443c2.f17654OooO0OO;
                c1443c2.f17654OooO0OO = -1L;
                j2 = j3;
                j = j4;
            } else {
                j = -1;
            }
            C1811m2 c1811m2 = new C1811m2(c2143v1, c2104u2, i, f19159OoooOOO, j2, j);
            i = i;
            arrayList.add(c1811m2);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17896o00OO0oo)).booleanValue()) {
            C1590g2 c1590g2 = new C1590g2(c2143v1, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", c2104u2, i, 73, 10);
            c2104u2 = c2104u2;
            arrayList.add(c1590g2);
        }
        C2104u c2104u3 = c2104u2;
        arrayList.add(new C1590g2(c2143v1, "yo4AnI5HYhoV2EsbpvhPGv0ZIHdCUEOv2Gre1uIL5QmSqEaPxW/DTBG1l9mfjeJL", "v4ERF2BZ8VhfOGsNaLYR31bPmiZ7/cUjCjYq2SCVO2Q=", c2104u3, i, 76, 7));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17898o00OOO0)).booleanValue()) {
            arrayList.add(new C1590g2(c2143v1, c2104u3, i, 4));
        }
        return arrayList;
    }

    public final void OooOO0O(C2143v1 c2143v1, C2104u c2104u, View view, Activity activity, boolean z, Context context) throws InterruptedException {
        List listAsList;
        MotionEvent motionEvent;
        int i = 1;
        if (c2143v1.f24829OooOOo0) {
            synchronized (this) {
                try {
                    try {
                        C2180w1 c2180w1OooO0oo = OooO0oo(c2143v1, this.f19165OooOo0O, this.f19183Oooo0oO);
                        Long l = c2180w1OooO0oo.f25162OooO0oO;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            c2104u.OooO0Oo();
                            C1514e0.OoooO0((C1514e0) c2104u.f25822OooOo0o, jLongValue);
                        }
                        Long l2 = c2180w1OooO0oo.f25163OooO0oo;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            c2104u.OooO0Oo();
                            C1514e0.OoooO0O((C1514e0) c2104u.f25822OooOo0o, jLongValue2);
                        }
                        Long l3 = c2180w1OooO0oo.f25161OooO;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            c2104u.OooO0Oo();
                            C1514e0.Oooo((C1514e0) c2104u.f25822OooOo0o, jLongValue3);
                        }
                        if (this.f19181Oooo0o) {
                            Long l4 = c2180w1OooO0oo.f25164OooOO0;
                            if (l4 != null) {
                                long jLongValue4 = l4.longValue();
                                c2104u.OooO0Oo();
                                C1514e0.Oooo0oo((C1514e0) c2104u.f25822OooOo0o, jLongValue4);
                            }
                            Long l5 = c2180w1OooO0oo.f25165OooOO0O;
                            if (l5 != null) {
                                long jLongValue5 = l5.longValue();
                                c2104u.OooO0Oo();
                                C1514e0.Oooo0o0((C1514e0) c2104u.f25822OooOo0o, jLongValue5);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (C1995r1 unused) {
                }
                C1368a0 c1368a0OooOo0o = C1405b0.OooOo0o();
                if (this.f19164OooOo > 0) {
                    DisplayMetrics displayMetrics = this.f19183Oooo0oO;
                    char[] cArr = AbstractC2217x1.f25494OooO00o;
                    if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                        long jOooO00o = AbstractC2217x1.OooO00o(this.f19173OooOooo, displayMetrics);
                        c1368a0OooOo0o.OooO0Oo();
                        C1405b0.OooOoOO((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jOooO00o);
                        long jOooO00o2 = AbstractC2217x1.OooO00o(this.f19179Oooo0O0 - this.f19178Oooo00o, this.f19183Oooo0oO);
                        c1368a0OooOo0o.OooO0Oo();
                        C1405b0.Oooo0oO((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jOooO00o2);
                        long jOooO00o3 = AbstractC2217x1.OooO00o(this.f19180Oooo0OO - this.f19175Oooo0, this.f19183Oooo0oO);
                        c1368a0OooOo0o.OooO0Oo();
                        C1405b0.Oooo0oo((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jOooO00o3);
                        long jOooO00o4 = AbstractC2217x1.OooO00o(this.f19178Oooo00o, this.f19183Oooo0oO);
                        c1368a0OooOo0o.OooO0Oo();
                        C1405b0.Oooo00O((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jOooO00o4);
                        long jOooO00o5 = AbstractC2217x1.OooO00o(this.f19175Oooo0, this.f19183Oooo0oO);
                        c1368a0OooOo0o.OooO0Oo();
                        C1405b0.Oooo0((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jOooO00o5);
                        if (this.f19181Oooo0o && (motionEvent = this.f19165OooOo0O) != null) {
                            long jOooO00o6 = AbstractC2217x1.OooO00o(((this.f19178Oooo00o - this.f19179Oooo0O0) + motionEvent.getRawX()) - this.f19165OooOo0O.getX(), this.f19183Oooo0oO);
                            if (jOooO00o6 != 0) {
                                c1368a0OooOo0o.OooO0Oo();
                                C1405b0.Oooo0o0((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jOooO00o6);
                            }
                            long jOooO00o7 = AbstractC2217x1.OooO00o(((this.f19175Oooo0 - this.f19180Oooo0OO) + this.f19165OooOo0O.getRawY()) - this.f19165OooOo0O.getY(), this.f19183Oooo0oO);
                            if (jOooO00o7 != 0) {
                                c1368a0OooOo0o.OooO0Oo();
                                C1405b0.Oooo0o((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jOooO00o7);
                            }
                        }
                    }
                }
                try {
                    C2180w1 c2180w1OooO0o0 = OooO0o0(this.f19165OooOo0O);
                    Long l6 = c2180w1OooO0o0.f25162OooO0oO;
                    if (l6 != null) {
                        long jLongValue6 = l6.longValue();
                        c1368a0OooOo0o.OooO0Oo();
                        C1405b0.Oooo00o((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jLongValue6);
                    }
                    Long l7 = c2180w1OooO0o0.f25163OooO0oo;
                    if (l7 != null) {
                        long jLongValue7 = l7.longValue();
                        c1368a0OooOo0o.OooO0Oo();
                        C1405b0.Oooo0O0((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jLongValue7);
                    }
                    long jLongValue8 = c2180w1OooO0o0.f25161OooO.longValue();
                    c1368a0OooOo0o.OooO0Oo();
                    C1405b0.Oooo000((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jLongValue8);
                    if (this.f19181Oooo0o) {
                        Long l8 = c2180w1OooO0o0.f25165OooOO0O;
                        if (l8 != null) {
                            long jLongValue9 = l8.longValue();
                            c1368a0OooOo0o.OooO0Oo();
                            C1405b0.OooOooO((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jLongValue9);
                        }
                        Long l9 = c2180w1OooO0o0.f25164OooOO0;
                        if (l9 != null) {
                            long jLongValue10 = l9.longValue();
                            c1368a0OooOo0o.OooO0Oo();
                            C1405b0.OooOooo((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jLongValue10);
                        }
                        Long l10 = c2180w1OooO0o0.OooOO0o;
                        if (l10 != null) {
                            int i2 = l10.longValue() != 0 ? 2 : 1;
                            c1368a0OooOo0o.OooO0Oo();
                            C1405b0.OoooO00((C1405b0) c1368a0OooOo0o.f25822OooOo0o, i2);
                        }
                        long j = this.f19168OooOoO0;
                        if (j > 0) {
                            DisplayMetrics displayMetrics2 = this.f19183Oooo0oO;
                            char[] cArr2 = AbstractC2217x1.f25494OooO00o;
                            Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f19172OooOooO / j)) : null;
                            if (lValueOf != null) {
                                long jLongValue11 = lValueOf.longValue();
                                c1368a0OooOo0o.OooO0Oo();
                                C1405b0.OooOoO0((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jLongValue11);
                            } else {
                                c1368a0OooOo0o.OooO0Oo();
                                C1405b0.OooOo((C1405b0) c1368a0OooOo0o.f25822OooOo0o);
                            }
                            long jRound = Math.round(this.f19170OooOoo / this.f19168OooOoO0);
                            c1368a0OooOo0o.OooO0Oo();
                            C1405b0.OooOoO((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jRound);
                        }
                        Long l11 = c2180w1OooO0o0.f25168OooOOOO;
                        if (l11 != null) {
                            long jLongValue12 = l11.longValue();
                            c1368a0OooOo0o.OooO0Oo();
                            C1405b0.OooOoo0((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jLongValue12);
                        }
                        Long l12 = c2180w1OooO0o0.f25169OooOOOo;
                        if (l12 != null) {
                            long jLongValue13 = l12.longValue();
                            c1368a0OooOo0o.OooO0Oo();
                            C1405b0.Oooo0OO((C1405b0) c1368a0OooOo0o.f25822OooOo0o, jLongValue13);
                        }
                        Long l13 = c2180w1OooO0o0.f25170OooOOo0;
                        if (l13 != null) {
                            int i3 = l13.longValue() != 0 ? 2 : 1;
                            c1368a0OooOo0o.OooO0Oo();
                            C1405b0.Oooo((C1405b0) c1368a0OooOo0o.f25822OooOo0o, i3);
                        }
                    }
                } catch (C1995r1 unused2) {
                }
                long j2 = this.f19171OooOoo0;
                if (j2 > 0) {
                    c1368a0OooOo0o.OooO0Oo();
                    C1405b0.OooOoo((C1405b0) c1368a0OooOo0o.f25822OooOo0o, j2);
                }
                C1405b0 c1405b0 = (C1405b0) c1368a0OooOo0o.OooO0O0();
                c2104u.OooO0Oo();
                C1514e0.o000oOoO((C1514e0) c2104u.f25822OooOo0o, c1405b0);
                long j3 = this.f19164OooOo;
                if (j3 > 0) {
                    c2104u.OooO0Oo();
                    C1514e0.Oooo0o((C1514e0) c2104u.f25822OooOo0o, j3);
                }
                long j4 = this.f19168OooOoO0;
                if (j4 > 0) {
                    c2104u.OooO0Oo();
                    C1514e0.Oooo0oO((C1514e0) c2104u.f25822OooOo0o, j4);
                }
                long j5 = this.f19167OooOoO;
                if (j5 > 0) {
                    c2104u.OooO0Oo();
                    C1514e0.OoooO00((C1514e0) c2104u.f25822OooOo0o, j5);
                }
                long j6 = this.f19169OooOoOO;
                if (j6 > 0) {
                    c2104u.OooO0Oo();
                    C1514e0.Oooo0OO((C1514e0) c2104u.f25822OooOo0o, j6);
                }
                try {
                    int size = this.f19166OooOo0o.size() - 1;
                    if (size > 0) {
                        c2104u.OooO0Oo();
                        C1514e0.o0ooOoO((C1514e0) c2104u.f25822OooOo0o);
                        for (int i4 = 0; i4 < size; i4++) {
                            C2180w1 c2180w1OooO0oo2 = OooO0oo(f19157OoooO0O, (MotionEvent) this.f19166OooOo0o.get(i4), this.f19183Oooo0oO);
                            C1368a0 c1368a0OooOo0o2 = C1405b0.OooOo0o();
                            long jLongValue14 = c2180w1OooO0oo2.f25162OooO0oO.longValue();
                            c1368a0OooOo0o2.OooO0Oo();
                            C1405b0.Oooo00o((C1405b0) c1368a0OooOo0o2.f25822OooOo0o, jLongValue14);
                            long jLongValue15 = c2180w1OooO0oo2.f25163OooO0oo.longValue();
                            c1368a0OooOo0o2.OooO0Oo();
                            C1405b0.Oooo0O0((C1405b0) c1368a0OooOo0o2.f25822OooOo0o, jLongValue15);
                            C1405b0 c1405b02 = (C1405b0) c1368a0OooOo0o2.OooO0O0();
                            c2104u.OooO0Oo();
                            C1514e0.o0ooOOo((C1514e0) c2104u.f25822OooOo0o, c1405b02);
                        }
                    }
                } catch (C1995r1 unused3) {
                    c2104u.OooO0Oo();
                    C1514e0.o0ooOoO((C1514e0) c2104u.f25822OooOo0o);
                }
            }
            ArrayList arrayList = new ArrayList();
            if (c2143v1.f24815OooO0O0 != null) {
                int iOooO00o = c2143v1.OooO00o();
                arrayList.add(new CallableC2031s0(i, c2143v1, c2104u));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 2));
                arrayList.add(new C1627h2(c2143v1, c2104u, o000oOoO, iOooO00o));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 0));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 8));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 9));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 1));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 6));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 12));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 5));
                arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 11));
                arrayList.add(new C1700j2(c2143v1, c2104u, iOooO00o, new Throwable().getStackTrace()));
                arrayList.add(new C1700j2(c2143v1, c2104u, iOooO00o, view));
                arrayList.add(new C1848n2(c2143v1, c2104u, iOooO00o));
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17937oo00o)).booleanValue()) {
                    arrayList.add(new C1480d2(c2143v1, c2104u, iOooO00o, view, activity));
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17898o00OOO0)).booleanValue()) {
                    arrayList.add(new C1590g2(c2143v1, c2104u, iOooO00o, 4));
                }
                if (!z) {
                    try {
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17866o00O0O0)).booleanValue()) {
                            arrayList.add(new C1737k2(c2143v1, c2104u, iOooO00o, this.f19185OoooO0, view, context));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17868o00O0O0O)).booleanValue()) {
                            arrayList.add(new C1700j2(c2143v1, c2104u, iOooO00o, f19161OoooOo0));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17875o00O0Oo0)).booleanValue()) {
                        arrayList.add(new C1700j2(c2143v1, c2104u, iOooO00o, this.f19184Oooo0oo));
                    }
                } else if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17867o00O0O00)).booleanValue()) {
                    arrayList.add(new C1885o2(c2143v1, c2104u, iOooO00o, this.f19186OoooO00));
                }
            }
            listAsList = arrayList;
        } else {
            c2104u.OooO0Oo();
            C1514e0.Oooo00o((C1514e0) c2104u.f25822OooOo0o, Http2Stream.EMIT_BUFFER_SIZE);
            listAsList = Arrays.asList(new CallableC2031s0(i, c2143v1, c2104u));
        }
        OooOO0o(listAsList);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzd(Context context, String str, View view) {
        return OooO(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zze(Context context, String str, View view, Activity activity) {
        return OooO(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzf(Context context) {
        char[] cArr = AbstractC2217x1.f25494OooO00o;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return OooO(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final String zzh(Context context, View view, Activity activity) {
        return OooO(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.f19182Oooo0o0) {
                OooO0oO();
                this.f19182Oooo0o0 = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f19173OooOooo = 0.0d;
                this.f19176Oooo000 = motionEvent.getRawX();
                this.f19177Oooo00O = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.f19176Oooo000;
                double d2 = rawY - this.f19177Oooo00O;
                this.f19173OooOooo += Math.sqrt((d2 * d2) + (d * d));
                this.f19176Oooo000 = rawX;
                this.f19177Oooo00O = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f19165OooOo0O = motionEventObtain;
                        this.f19166OooOo0o.add(motionEventObtain);
                        if (this.f19166OooOo0o.size() > 6) {
                            ((MotionEvent) this.f19166OooOo0o.remove()).recycle();
                        }
                        this.f19167OooOoO++;
                        this.f19171OooOoo0 = OooO00o(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f19168OooOoO0 += motionEvent.getHistorySize() + 1;
                        C2180w1 c2180w1OooO0o0 = OooO0o0(motionEvent);
                        Long l2 = c2180w1OooO0o0.f25164OooOO0;
                        if (l2 != null && c2180w1OooO0o0.f25167OooOOO0 != null) {
                            this.f19170OooOoo = l2.longValue() + c2180w1OooO0o0.f25167OooOOO0.longValue() + this.f19170OooOoo;
                        }
                        if (this.f19183Oooo0oO != null && (l = c2180w1OooO0o0.f25165OooOO0O) != null && c2180w1OooO0o0.f25166OooOOO != null) {
                            this.f19172OooOooO = l.longValue() + c2180w1OooO0o0.f25166OooOOO.longValue() + this.f19172OooOooO;
                        }
                    } else if (action2 == 3) {
                        this.f19169OooOoOO++;
                    }
                } catch (C1995r1 unused) {
                }
            } else {
                this.f19178Oooo00o = motionEvent.getX();
                this.f19175Oooo0 = motionEvent.getY();
                this.f19179Oooo0O0 = motionEvent.getRawX();
                this.f19180Oooo0OO = motionEvent.getRawY();
                this.f19164OooOo++;
            }
            this.f19181Oooo0o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final synchronized void zzl(int i, int i2, int i3) {
        try {
            if (this.f19165OooOo0O != null) {
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17861o00O00Oo)).booleanValue()) {
                    OooO0oO();
                } else {
                    this.f19165OooOo0O.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f19183Oooo0oO;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f19165OooOo0O = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f19165OooOo0O = null;
            }
            this.f19181Oooo0o = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        p80 p80Var;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17875o00O0Oo0)).booleanValue() || (p80Var = this.f19184Oooo0oo) == null) {
            return;
        }
        p80Var.f23242OooOo0o = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1552f1
    public final void zzo(View view) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17867o00O0O00)).booleanValue()) {
            if (this.f19186OoooO00 == null) {
                C2143v1 c2143v1 = f19157OoooO0O;
                this.f19186OoooO00 = new ViewOnAttachStateChangeListenerC1370a2(c2143v1.f24814OooO00o, c2143v1.f24828OooOOo);
            }
            this.f19186OoooO00.OooO00o(view);
        }
    }
}
