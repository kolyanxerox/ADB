package o0000Ooo;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0O0000O extends o00Oo00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient Object[] f29542OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final transient int f29543OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient int f29544OooOoO0;

    public o0O0000O(Object[] objArr, int i, int i2) {
        this.f29542OooOo = objArr;
        this.f29544OooOoO0 = i;
        this.f29543OooOoO = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        o0OO0O0.OooO0Oo(i, this.f29543OooOoO);
        Object obj = this.f29542OooOo[(i * 2) + this.f29544OooOoO0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29543OooOoO;
    }
}
