package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.be */
/* loaded from: classes2.dex */
public final class C1419be {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f17487OooO00o = new Object();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f17488OooO0O0 = new Object();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public C1602ge f17489OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public C1602ge f17490OooO0Oo;

    public final C1602ge OooO00o(Context context, VersionInfoParcel versionInfoParcel, nf0 nf0Var) {
        C1602ge c1602ge;
        synchronized (this.f17487OooO00o) {
            try {
                if (this.f17489OooO0OO == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f17489OooO0OO = new C1602ge(context, versionInfoParcel, (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17710OooO00o), nf0Var);
                }
                c1602ge = this.f17489OooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1602ge;
    }

    public final C1602ge OooO0O0(Context context, VersionInfoParcel versionInfoParcel, nf0 nf0Var) {
        C1602ge c1602ge;
        synchronized (this.f17488OooO0O0) {
            try {
                if (this.f17490OooO0Oo == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f17490OooO0Oo = new C1602ge(context, versionInfoParcel, (String) wz0.OooOo0.OooOOO(), nf0Var);
                }
                c1602ge = this.f17490OooO0Oo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1602ge;
    }
}
