package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.zzg;

/* renamed from: com.google.android.gms.internal.ads.j7 */
/* loaded from: classes2.dex */
public final class BinderC1705j7 extends AbstractBinderC2181w2 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f20211OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final zzg f20212OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f20213OooOo0o;

    public BinderC1705j7(zzg zzgVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f20212OooOo0O = zzgVar;
        this.f20213OooOo0o = str;
        this.f20211OooOo = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f20213OooOo0o);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f20211OooOo);
            return true;
        }
        zzg zzgVar = this.f20212OooOo0O;
        if (i == 3) {
            Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
            AbstractC2218x2.OooO0O0(parcel);
            if (oooO0O0O000O0o0 != null) {
                zzgVar.zza((View) Oooo0o.OooO0OO.o000O0oO(oooO0O0O000O0o0));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            zzgVar.zzb();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzgVar.zzc();
        parcel2.writeNoException();
        return true;
    }
}
