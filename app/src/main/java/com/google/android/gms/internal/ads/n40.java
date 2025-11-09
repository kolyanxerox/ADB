package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes2.dex */
public final class n40 extends AbstractBinderC2012ri {

    /* renamed from: OooOo0O */
    public final C2274yl f21410OooOo0O;

    /* renamed from: OooOo0o */
    public final C2197wi f21411OooOo0o;

    public n40(C2274yl c2274yl, C2197wi c2197wi) {
        this.f21410OooOo0O = c2274yl;
        this.f21411OooOo0o = c2197wi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0000O00(zzbb zzbbVar) {
        this.f21410OooOo0O.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0000Oo0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f21410OooOo0O.zzc(new w40(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f21411OooOo0o));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0Oo0oo(ParcelFileDescriptor parcelFileDescriptor, C2197wi c2197wi) {
        this.f21410OooOo0O.zzc(new w40(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2197wi));
    }
}
