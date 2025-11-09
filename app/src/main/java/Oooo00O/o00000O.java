package Oooo00O;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes2.dex */
public final class o00000O extends OoooO0.OooO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f13787OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public OooOO0O f13788OooOo0o;

    public o00000O(OooOO0O oooOO0O, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f13788OooOo0o = oooOO0O;
        this.f13787OooOo = i;
    }

    @Override // OoooO0.OooO
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) OoooO0.OooOO0.OooO00o(parcel, Bundle.CREATOR);
            OoooO0.OooOO0.OooO0O0(parcel);
            o000000O.OooO(this.f13788OooOo0o, "onPostInitComplete can be called only once per call to getRemoteService");
            OooOO0O oooOO0O = this.f13788OooOo0o;
            oooOO0O.getClass();
            o0000Ooo o0000ooo = new o0000Ooo(oooOO0O, i2, strongBinder, bundle);
            o00000O0 o00000o02 = oooOO0O.f13748Oooo00O;
            o00000o02.sendMessage(o00000o02.obtainMessage(1, this.f13787OooOo, -1, o0000ooo));
            this.f13788OooOo0o = null;
        } else if (i == 2) {
            parcel.readInt();
            OoooO0.OooOO0.OooO0O0(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            o0000O00 o0000o00 = (o0000O00) OoooO0.OooOO0.OooO00o(parcel, o0000O00.CREATOR);
            OoooO0.OooOO0.OooO0O0(parcel);
            OooOO0O oooOO0O2 = this.f13788OooOo0o;
            o000000O.OooO(oooOO0O2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            o000000O.OooO0oo(o0000o00);
            oooOO0O2.f13761OoooOOO = o0000o00;
            if (oooOO0O2.usesClientTelemetry()) {
                OooOOO0 oooOOO0 = o0000o00.f13803OooOoO0;
                Oooo000 oooo000OooO0O0 = Oooo000.OooO0O0();
                Oooo0 oooo0OooOO0O = oooOOO0 == null ? null : oooOOO0.OooOO0O();
                synchronized (oooo000OooO0O0) {
                    if (oooo0OooOO0O == null) {
                        oooo0OooOO0O = Oooo000.f13779OooOo;
                    } else {
                        Oooo0 oooo0 = (Oooo0) oooo000OooO0O0.f13781OooOo0O;
                        if (oooo0 == null || oooo0.OooOO0() < oooo0OooOO0O.OooOO0()) {
                        }
                    }
                    oooo000OooO0O0.f13781OooOo0O = oooo0OooOO0O;
                }
            }
            Bundle bundle2 = o0000o00.f13801OooOo0O;
            o000000O.OooO(this.f13788OooOo0o, "onPostInitComplete can be called only once per call to getRemoteService");
            OooOO0O oooOO0O3 = this.f13788OooOo0o;
            oooOO0O3.getClass();
            o0000Ooo o0000ooo2 = new o0000Ooo(oooOO0O3, i3, strongBinder2, bundle2);
            o00000O0 o00000o03 = oooOO0O3.f13748Oooo00O;
            o00000o03.sendMessage(o00000o03.obtainMessage(1, this.f13787OooOo, -1, o0000ooo2));
            this.f13788OooOo0o = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
