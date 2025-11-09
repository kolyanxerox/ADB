package OoooOOO;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.o0OO00O;
import com.google.android.gms.internal.measurement.o0Oo0oo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class oO00o00O extends o0Oo0oo implements o0O00O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14693OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f14694OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00O(oOo000o0 ooo000o0, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f14693OooOo0O = atomicReference;
        this.f14694OooOo0o = ooo000o0;
    }

    @Override // com.google.android.gms.internal.measurement.o0Oo0oo
    public final boolean OooO(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        oO0OO0O oo0oo0o = (oO0OO0O) o0OO00O.OooO00o(parcel, oO0OO0O.CREATOR);
        o0OO00O.OooO0Oo(parcel);
        o000O0o(oo0oo0o);
        return true;
    }

    @Override // OoooOOO.o0O00O
    public final void o000O0o(oO0OO0O oo0oo0o) {
        AtomicReference atomicReference = this.f14693OooOo0O;
        synchronized (atomicReference) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14694OooOo0o.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0OO(Integer.valueOf(oo0oo0o.zza.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(oo0oo0o);
            atomicReference.notifyAll();
        }
    }
}
