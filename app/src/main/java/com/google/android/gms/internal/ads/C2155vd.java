package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* renamed from: com.google.android.gms.internal.ads.vd */
/* loaded from: classes2.dex */
public final class C2155vd extends Oooo0o.OooO {

    /* renamed from: OooO0OO */
    public final Object f24947OooO0OO = new Object();

    /* renamed from: OooO0Oo */
    public final C2192wd f24948OooO0Oo;

    /* renamed from: OooO0o0 */
    public boolean f24949OooO0o0;

    public C2155vd(C2192wd c2192wd) {
        this.f24948OooO0Oo = c2192wd;
    }

    public final void OooOO0o() {
        zze.zza("release: Trying to acquire lock");
        synchronized (this.f24947OooO0OO) {
            try {
                zze.zza("release: Lock acquired");
                if (this.f24949OooO0o0) {
                    zze.zza("release: Lock already released");
                    return;
                }
                this.f24949OooO0o0 = true;
                OooOO0O(new C2007rd(1), new C2007rd(13));
                OooOO0O(new wj0(this, 7), new C1847n1(this, 6));
                zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
