package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.lj */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1791lj extends AbstractBinderC2181w2 implements InterfaceC1828mj {
    public AbstractBinderC1791lj() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                OooooOo(oooO0O0O000O0o0);
                break;
            case 2:
                Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                o0000();
                break;
            case 3:
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                Oooo00O(oooO0O0O000O0o02);
                break;
            case 4:
                Oooo0o.OooO0O0 oooO0O0O000O0o03 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzj(oooO0O0O000O0o03);
                break;
            case 5:
                Oooo0o.OooO0O0 oooO0O0O000O0o04 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o0OO00O(oooO0O0O000O0o04);
                break;
            case 6:
                Oooo0o.OooO0O0 oooO0O0O000O0o05 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o000OoO(oooO0O0O000O0o05);
                break;
            case 7:
                Oooo0o.OooO0O0 oooO0O0O000O0o06 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                C1865nj c1865nj = (C1865nj) AbstractC2218x2.OooO00o(parcel, C1865nj.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                o000Ooo(oooO0O0O000O0o06, c1865nj);
                break;
            case 8:
                Oooo0o.OooO0O0 oooO0O0O000O0o07 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zze(oooO0O0O000O0o07);
                break;
            case 9:
                Oooo0o.OooO0O0 oooO0O0O000O0o08 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                OoooO0O(oooO0O0O000O0o08, i2);
                break;
            case 10:
                Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o000O00();
                break;
            case 11:
                Oooo0o.OooO0O0 oooO0O0O000O0o09 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzn(oooO0O0O000O0o09);
                break;
            case 12:
                AbstractC2218x2.OooO0O0(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
