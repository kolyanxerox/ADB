package OooOooo;

import Oooo00O.o000000O;
import Oooo00O.o0OO00O;
import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import OoooO0.OooO;
import OoooO0.OooOO0;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class o00oOoo extends OooO implements o0OO00O {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f13694OooOo = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f13695OooOo0o;

    public o00oOoo(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        o000000O.OooO0O0(bArr.length == 25);
        this.f13695OooOo0o = Arrays.hashCode(bArr);
    }

    public static byte[] o000O0o0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        OooO0O0 oooO0O0Zzd;
        if (obj != null && (obj instanceof o0OO00O)) {
            try {
                o0OO00O o0oo00o = (o0OO00O) obj;
                if (o0oo00o.zzc() == this.f13695OooOo0o && (oooO0O0Zzd = o0oo00o.zzd()) != null) {
                    return Arrays.equals(o000O0oO(), (byte[]) OooO0OO.o000O0oO(oooO0O0Zzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13695OooOo0o;
    }

    public abstract byte[] o000O0oO();

    @Override // OoooO0.OooO
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            OooO0O0 oooO0O0Zzd = zzd();
            parcel2.writeNoException();
            OooOO0.OooO0OO(parcel2, oooO0O0Zzd);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f13695OooOo0o);
        return true;
    }

    @Override // Oooo00O.o0OO00O
    public final int zzc() {
        return this.f13695OooOo0o;
    }

    @Override // Oooo00O.o0OO00O
    public final OooO0O0 zzd() {
        return new OooO0OO(o000O0oO());
    }
}
