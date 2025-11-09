package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.cr */
/* loaded from: classes2.dex */
public final class C1468cr {

    /* renamed from: OooO, reason: collision with root package name */
    public InterfaceC1680ii f18043OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f18044OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final zzj f18045OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final g60 f18046OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final q10 f18047OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final cq0 f18048OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C2163vl f18049OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ScheduledExecutorService f18050OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public InterfaceC1680ii f18051OooO0oo;

    public C1468cr(Context context, zzj zzjVar, g60 g60Var, q10 q10Var, C2163vl c2163vl, cq0 cq0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f18044OooO00o = context;
        this.f18045OooO0O0 = zzjVar;
        this.f18046OooO0OO = g60Var;
        this.f18047OooO0Oo = q10Var;
        this.f18049OooO0o0 = c2163vl;
        this.f18048OooO0o = cq0Var;
        this.f18050OooO0oO = scheduledExecutorService;
    }

    public static boolean OooO0O0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0));
    }

    public final o00000oO.OooOOO OooO00o(String str, Random random) {
        return TextUtils.isEmpty(str) ? ii0.OooooOO(str) : ii0.OoooOoO(OooO0OO(str, this.f18047OooO0Oo.f23479OooO00o, random), Throwable.class, new C1931pb(this, str, 1), this.f18049OooO0o0);
    }

    public final o00000oO.OooOOO OooO0OO(String str, MotionEvent motionEvent, Random random) {
        o00000oO.OooOOO oooOOOOoooo00;
        try {
            if (!str.contains((CharSequence) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0)) || this.f18045OooO0O0.zzN()) {
                return ii0.OooooOO(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooO0O0), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                builderBuildUpon.appendQueryParameter((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0O00), "11");
                return ii0.OooooOO(builderBuildUpon.toString());
            }
            g60 g60Var = this.f18046OooO0OO;
            g60Var.getClass();
            try {
                MeasurementManagerFutures measurementManagerFuturesFrom = MeasurementManagerFutures.from(g60Var.f19242OooO0O0);
                g60Var.f19241OooO00o = measurementManagerFuturesFrom;
                oooOOOOoooo00 = measurementManagerFuturesFrom == null ? ii0.Ooooo00(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesFrom.getMeasurementApiStatusAsync();
            } catch (Exception e) {
                oooOOOOoooo00 = ii0.Ooooo00(e);
            }
            return ii0.OoooOoO(ii0.ooOO(tp0.OooOOo(oooOOOOoooo00), new C1676ie(this, builderBuildUpon, str, motionEvent), this.f18048OooO0o), Throwable.class, new C1786le(2, this, builderBuildUpon), this.f18049OooO0o0);
        } catch (Exception e2) {
            return ii0.Ooooo00(e2);
        }
    }
}
