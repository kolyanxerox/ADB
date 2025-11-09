package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* renamed from: com.google.android.gms.internal.ads.fh */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1568fh extends AbstractBinderC2181w2 implements InterfaceC1605gh {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f18947OooOo0O = 0;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws Resources.NotFoundException {
        switch (i) {
            case 1:
                Intent intent = (Intent) AbstractC2218x2.OooO00o(parcel, Intent.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                ((x50) this).OooOOo(intent);
                break;
            case 2:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                ((x50) this).Oooo0O0(oooO0O0O000O0o0, new zza(string, string2, ""));
                break;
            case 3:
                ((x50) this).zzh();
                break;
            case 4:
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                ((x50) this).OooOOo0(oooO0O0O000O0o02);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                Oooo0o.OooO0O0 oooO0O0O000O0o03 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                ((x50) this).Oooooo(strArrCreateStringArray, iArrCreateIntArray, oooO0O0O000O0o03);
                break;
            case 6:
                Oooo0o.OooO0O0 oooO0O0O000O0o04 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zza zzaVar = (zza) AbstractC2218x2.OooO00o(parcel, zza.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                ((x50) this).Oooo0O0(oooO0O0O000O0o04, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
