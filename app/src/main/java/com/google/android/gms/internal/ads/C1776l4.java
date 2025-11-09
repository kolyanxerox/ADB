package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l4 */
/* loaded from: classes2.dex */
public final class C1776l4 extends C2274yl {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f20791OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f20792OooOo0o = 0;

    public C1776l4(com.google.android.gms.internal.measurement.o0OOO00 o0ooo00) {
        this.f20791OooOo = o0ooo00;
    }

    public void OooO0O0() {
        zzc(this.f20791OooOo);
    }

    @Override // com.google.android.gms.internal.ads.C2274yl, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        switch (this.f20792OooOo0o) {
            case 0:
                com.google.android.gms.internal.measurement.o0OOO00.OooO0o0((com.google.android.gms.internal.measurement.o0OOO00) this.f20791OooOo);
                break;
        }
        return super.cancel(z);
    }

    public C1776l4(Object obj) {
        this.f20791OooOo = obj;
    }
}
