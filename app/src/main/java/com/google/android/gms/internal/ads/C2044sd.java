package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.sd */
/* loaded from: classes2.dex */
public final class C2044sd implements InterfaceC2042sb {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C1822md f24061OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ long f24062OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C2192wd f24063OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C2229xd f24064OooOoO0;

    public C2044sd(C2229xd c2229xd, long j, C2192wd c2192wd, C1822md c1822md) {
        this.f24062OooOo0O = j;
        this.f24063OooOo0o = c2192wd;
        this.f24061OooOo = c1822md;
        this.f24064OooOoO0 = c2229xd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) {
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (System.currentTimeMillis() - this.f24062OooOo0O) + " ms.");
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f24064OooOoO0.f25607OooO0Oo) {
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (((AtomicInteger) this.f24063OooOo0o.f13857OooO0O0).get() != -1 && ((AtomicInteger) this.f24063OooOo0o.f13857OooO0O0).get() != 1) {
                this.f24064OooOoO0.f25606OooO0OO = 0;
                C1822md c1822md = this.f24061OooOo;
                c1822md.OooO0oo("/log", AbstractC2005rb.f23823OooO0oO);
                c1822md.OooO0oo("/result", AbstractC2005rb.f23829OooOOOO);
                ((C2274yl) this.f24063OooOo0o.f13856OooO00o).zzc(this.f24061OooOo);
                this.f24064OooOoO0.f25603OooO = this.f24063OooOo0o;
                zze.zza("Successfully loaded JS Engine.");
                zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
