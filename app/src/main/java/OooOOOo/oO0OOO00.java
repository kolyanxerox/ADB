package OoooOOO;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.o0OO00O;
import com.google.android.gms.internal.measurement.o0Oo0oo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class oO0OOO00 extends o0Oo0oo implements o0OoO00O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14749OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(oOo000o0 ooo000o0, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f14749OooOo0O = atomicReference;
    }

    @Override // com.google.android.gms.internal.measurement.o0Oo0oo
    public final boolean OooO(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(oOo0o0oO.CREATOR);
        o0OO00O.OooO0Oo(parcel);
        o00oO0O(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // OoooOOO.o0OoO00O
    public final void o00oO0O(List list) {
        AtomicReference atomicReference = this.f14749OooOo0O;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
