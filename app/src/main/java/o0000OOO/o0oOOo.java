package o0000Ooo;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0oOOo extends o00Oo00 {

    /* renamed from: OooOoO */
    public static final o0oOOo f29560OooOoO = new o0oOOo(0, new Object[0]);

    /* renamed from: OooOo */
    public final transient Object[] f29561OooOo;

    /* renamed from: OooOoO0 */
    public final transient int f29562OooOoO0;

    public o0oOOo(int i, Object[] objArr) {
        this.f29561OooOo = objArr;
        this.f29562OooOoO0 = i;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO() {
        return 0;
    }

    @Override // o0000Ooo.o0o0Oo
    public final Object[] OooO0o() {
        return this.f29561OooOo;
    }

    @Override // o0000Ooo.o00Oo00, o0000Ooo.o0o0Oo
    public final int OooO0o0(Object[] objArr) {
        Object[] objArr2 = this.f29561OooOo;
        int i = this.f29562OooOoO0;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO0oO() {
        return this.f29562OooOoO0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        o0OO0O0.OooO0Oo(i, this.f29562OooOoO0);
        Object obj = this.f29561OooOo[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29562OooOoO0;
    }
}
