package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes2.dex */
public final class m40 extends AbstractBinderC2012ri {

    /* renamed from: OooOo0O */
    public final /* synthetic */ o40 f21060OooOo0O;

    public m40(o40 o40Var) {
        this.f21060OooOo0O = o40Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0000O00(zzbb zzbbVar) {
        this.f21060OooOo0O.f22329OooOo0O.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0000Oo0(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        o40 o40Var = this.f21060OooOo0O;
        o40Var.f22329OooOo0O.zzc(new w40(autoCloseInputStream, o40Var.f22331OooOoO));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0Oo0oo(ParcelFileDescriptor parcelFileDescriptor, C2197wi c2197wi) {
        this.f21060OooOo0O.f22329OooOo0O.zzc(new w40(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2197wi));
    }
}
