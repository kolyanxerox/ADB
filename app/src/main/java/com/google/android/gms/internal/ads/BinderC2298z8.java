package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.z8 */
/* loaded from: classes2.dex */
public final class BinderC2298z8 extends AbstractBinderC2181w2 implements InterfaceC1707j9 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final double f26113OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Drawable f26114OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Uri f26115OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f26116OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f26117OooOoO0;

    public BinderC2298z8(Drawable drawable, Uri uri, double d, int i, int i2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f26114OooOo0O = drawable;
        this.f26115OooOo0o = uri;
        this.f26113OooOo = d;
        this.f26117OooOoO0 = i;
        this.f26116OooOoO = i2;
    }

    public static InterfaceC1707j9 o000O0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1707j9 ? (InterfaceC1707j9) iInterfaceQueryLocalInterface : new C1671i9(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Oooo0o.OooO0O0 oooO0O0Zzf = zzf();
            parcel2.writeNoException();
            AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zzf);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            AbstractC2218x2.OooO0Oo(parcel2, this.f26115OooOo0o);
            return true;
        }
        if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeDouble(this.f26113OooOo);
            return true;
        }
        if (i == 4) {
            parcel2.writeNoException();
            parcel2.writeInt(this.f26117OooOoO0);
            return true;
        }
        if (i != 5) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f26116OooOoO);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final double zzb() {
        return this.f26113OooOo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final int zzc() {
        return this.f26116OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final int zzd() {
        return this.f26117OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final Uri zze() {
        return this.f26115OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final Oooo0o.OooO0O0 zzf() {
        return new Oooo0o.OooO0OO(this.f26114OooOo0O);
    }
}
