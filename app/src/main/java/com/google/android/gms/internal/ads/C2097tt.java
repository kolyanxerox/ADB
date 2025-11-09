package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.tt */
/* loaded from: classes2.dex */
public final class C2097tt implements InterfaceC1693iw, InterfaceC1656hv {

    /* renamed from: OooOo, reason: collision with root package name */
    public final vd0 f24503OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f24504OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2134ut f24505OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final String f24506OooOoO0;

    public C2097tt(Oooo0OO.o00Ooo o00ooo2, C2134ut c2134ut, vd0 vd0Var, String str) {
        this.f24504OooOo0O = o00ooo2;
        this.f24505OooOo0o = c2134ut;
        this.f24503OooOo = vd0Var;
        this.f24506OooOoO0 = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() {
        ((Oooo0OO.oo000o) this.f24504OooOo0O).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f24503OooOo.f24955OooO0o;
        C2134ut c2134ut = this.f24505OooOo0o;
        ConcurrentHashMap concurrentHashMap = c2134ut.f24785OooO0OO;
        String str2 = this.f24506OooOoO0;
        Long l = (Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        c2134ut.f24786OooO0Oo.put(str, Long.valueOf(jElapsedRealtime - l.longValue()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1693iw
    public final void zza() {
        ((Oooo0OO.oo000o) this.f24504OooOo0O).getClass();
        this.f24505OooOo0o.f24785OooO0OO.put(this.f24506OooOoO0, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
