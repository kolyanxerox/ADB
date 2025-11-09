package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.sv */
/* loaded from: classes2.dex */
public final class RunnableC2062sv implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24169OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final WeakReference f24170OooOo0o;

    public /* synthetic */ RunnableC2062sv(C2099tv c2099tv, int i) {
        this.f24169OooOo0O = i;
        switch (i) {
            case 1:
                this.f24170OooOo0o = new WeakReference(c2099tv);
                break;
            default:
                this.f24170OooOo0o = new WeakReference(c2099tv);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24169OooOo0O) {
            case 0:
                C2099tv c2099tv = (C2099tv) this.f24170OooOo0o.get();
                if (c2099tv != null) {
                    c2099tv.o0000Ooo(new C1582fv(8));
                    break;
                }
                break;
            default:
                C2099tv c2099tv2 = (C2099tv) this.f24170OooOo0o.get();
                if (c2099tv2 != null) {
                    c2099tv2.o0000Ooo(new C1582fv(9));
                    break;
                }
                break;
        }
    }
}
