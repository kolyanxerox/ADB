package o0000Ooo;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0O0o extends o00Oo00 {

    /* renamed from: OooOo */
    public final /* synthetic */ C4521o0 f29554OooOo;

    public o0O0o(C4521o0 c4521o0) {
        this.f29554OooOo = c4521o0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4521o0 c4521o0 = this.f29554OooOo;
        o0OO0O0.OooO0Oo(i, c4521o0.f29525OooOoOO);
        int i2 = i * 2;
        Object[] objArr = c4521o0.f29523OooOoO;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29554OooOo.f29525OooOoOO;
    }
}
