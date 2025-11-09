package OooOooo;

import OooOoo0.o000OOo;
import Oooo00O.o000;
import Oooo00O.o0OO00O;
import Oooo00o.o000O000;
import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o00O00OO extends o000O000 {
    public static final Parcelable.Creator<o00O00OO> CREATOR = new o000OOo(5);
    private final String zza;
    private final o00oOoo zzb;
    private final boolean zzc;
    private final boolean zzd;

    public o00O00OO(String str, o00O000 o00o000, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = o00o000;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, str);
        o00oOoo o00oooo = this.zzb;
        if (o00oooo == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            o00oooo = null;
        }
        o00oO0o.OooOOo(parcel, 2, o00oooo);
        boolean z = this.zzc;
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzd;
        o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public o00O00OO(String str, IBinder iBinder, boolean z, boolean z2) {
        o0OO00O o000Var;
        this.zza = str;
        o00O000 o00o000 = null;
        if (iBinder != null) {
            try {
                int i = o00oOoo.f13694OooOo;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (iInterfaceQueryLocalInterface instanceof o0OO00O) {
                    o000Var = (o0OO00O) iInterfaceQueryLocalInterface;
                } else {
                    o000Var = new o000(iBinder, "com.google.android.gms.common.internal.ICertData", 0);
                }
                OooO0O0 oooO0O0Zzd = o000Var.zzd();
                byte[] bArr = oooO0O0Zzd == null ? null : (byte[]) OooO0OO.o000O0oO(oooO0O0Zzd);
                if (bArr != null) {
                    o00o000 = new o00O000(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.zzb = o00o000;
        this.zzc = z;
        this.zzd = z2;
    }
}
