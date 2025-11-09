package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.ze */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2304ze extends AbstractBinderC2181w2 implements InterfaceC1383af {
    public AbstractBinderC2304ze() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC1383af o000O0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface : new C2267ye(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1939pj c1903oj;
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i2 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                OooO00o(i2);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                OooOOOO(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    boolean z = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd") instanceof InterfaceC1415ba;
                }
                parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 13:
                OooOoO0();
                break;
            case 14:
                C1865nj c1865nj = (C1865nj) AbstractC2218x2.OooO00o(parcel, C1865nj.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                o0000o(c1865nj);
                break;
            case 15:
                OooO0O0();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c1903oj = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c1903oj = iInterfaceQueryLocalInterface instanceof InterfaceC1939pj ? (InterfaceC1939pj) iInterfaceQueryLocalInterface : new C1903oj(strongBinder3);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o0000oo(c1903oj);
                break;
            case 17:
                int i3 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                o00O0O(i3);
                break;
            case 18:
                zzu();
                break;
            case 19:
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String string3 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzl(string3);
                break;
            case 22:
                int i4 = parcel.readInt();
                String string4 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                OooOoO(i4, string4);
                break;
            case 23:
                zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                OooOoo0(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                OoooOOo(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
