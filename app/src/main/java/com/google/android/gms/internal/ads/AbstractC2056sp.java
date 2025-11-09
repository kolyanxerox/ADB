package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.sp */
/* loaded from: classes2.dex */
public abstract class AbstractC2056sp implements InterfaceC1723jp {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public C1759ko f24133OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public C1759ko f24134OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public C1759ko f24135OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public ByteBuffer f24136OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public C1759ko f24137OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public ByteBuffer f24138OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public boolean f24139OooO0oo;

    public AbstractC2056sp() {
        ByteBuffer byteBuffer = InterfaceC1723jp.f20345OooO00o;
        this.f24136OooO0o = byteBuffer;
        this.f24138OooO0oO = byteBuffer;
        C1759ko c1759ko = C1759ko.f20636OooO0o0;
        this.f24135OooO0Oo = c1759ko;
        this.f24137OooO0o0 = c1759ko;
        this.f24133OooO0O0 = c1759ko;
        this.f24134OooO0OO = c1759ko;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final C1759ko OooO0O0(C1759ko c1759ko) {
        this.f24135OooO0Oo = c1759ko;
        this.f24137OooO0o0 = OooO0OO(c1759ko);
        return zzg() ? this.f24137OooO0o0 : C1759ko.f20636OooO0o0;
    }

    public abstract C1759ko OooO0OO(C1759ko c1759ko);

    public final ByteBuffer OooO0Oo(int i) {
        if (this.f24136OooO0o.capacity() < i) {
            this.f24136OooO0o = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f24136OooO0o.clear();
        }
        ByteBuffer byteBuffer = this.f24136OooO0o;
        this.f24138OooO0oO = byteBuffer;
        return byteBuffer;
    }

    public void OooO0o() {
    }

    public void OooO0o0() {
    }

    public void OooO0oO() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f24138OooO0oO;
        this.f24138OooO0oO = InterfaceC1723jp.f20345OooO00o;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void zzc() {
        this.f24138OooO0oO = InterfaceC1723jp.f20345OooO00o;
        this.f24139OooO0oo = false;
        this.f24133OooO0O0 = this.f24135OooO0Oo;
        this.f24134OooO0OO = this.f24137OooO0o0;
        OooO0o0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void zzd() {
        this.f24139OooO0oo = true;
        OooO0o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void zzf() {
        zzc();
        this.f24136OooO0o = InterfaceC1723jp.f20345OooO00o;
        C1759ko c1759ko = C1759ko.f20636OooO0o0;
        this.f24135OooO0Oo = c1759ko;
        this.f24137OooO0o0 = c1759ko;
        this.f24133OooO0O0 = c1759ko;
        this.f24134OooO0OO = c1759ko;
        OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public boolean zzg() {
        return this.f24137OooO0o0 != C1759ko.f20636OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public boolean zzh() {
        return this.f24139OooO0oo && this.f24138OooO0oO == InterfaceC1723jp.f20345OooO00o;
    }
}
