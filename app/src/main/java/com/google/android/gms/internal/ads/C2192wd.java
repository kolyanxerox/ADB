package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* renamed from: com.google.android.gms.internal.ads.wd */
/* loaded from: classes2.dex */
public final class C2192wd extends Oooo0o.OooO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f25294OooO0OO = new Object();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f25295OooO0Oo = false;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f25296OooO0o0 = 0;

    public C2192wd(C2007rd c2007rd) {
    }

    public final C2155vd OooOO0o() {
        C2155vd c2155vd = new C2155vd(this);
        zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.f25294OooO0OO) {
            zze.zza("createNewReference: Lock acquired");
            OooOO0O(new p80(c2155vd, 8), new sj0(c2155vd, 8));
            Oooo00O.o000000O.OooOO0(this.f25296OooO0o0 >= 0);
            this.f25296OooO0o0++;
        }
        zze.zza("createNewReference: Lock released");
        return c2155vd;
    }

    public final void OooOOO() {
        zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.f25294OooO0OO) {
            try {
                zze.zza("maybeDestroy: Lock acquired");
                Oooo00O.o000000O.OooOO0(this.f25296OooO0o0 >= 0);
                if (this.f25295OooO0Oo && this.f25296OooO0o0 == 0) {
                    zze.zza("No reference is left (including root). Cleaning up engine.");
                    OooOO0O(new C2007rd(2), new C2007rd(13));
                } else {
                    zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("maybeDestroy: Lock released");
    }

    public final void OooOOO0() {
        zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f25294OooO0OO) {
            zze.zza("markAsDestroyable: Lock acquired");
            Oooo00O.o000000O.OooOO0(this.f25296OooO0o0 >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f25295OooO0Oo = true;
            OooOOO();
        }
        zze.zza("markAsDestroyable: Lock released");
    }

    public final void OooOOOO() {
        zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.f25294OooO0OO) {
            zze.zza("releaseOneReference: Lock acquired");
            Oooo00O.o000000O.OooOO0(this.f25296OooO0o0 > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            this.f25296OooO0o0--;
            OooOOO();
        }
        zze.zza("releaseOneReference: Lock released");
    }
}
