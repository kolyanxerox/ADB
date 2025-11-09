package o0000Ooo;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class o00OOOOo extends o00Oo00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient int f29529OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f29530OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient int f29531OooOoO0;

    public o00OOOOo(o00Oo00 o00oo00, int i, int i2) {
        this.f29530OooOoO = o00oo00;
        this.f29529OooOo = i;
        this.f29531OooOoO0 = i2;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO() {
        return this.f29530OooOoO.OooO() + this.f29529OooOo;
    }

    @Override // o0000Ooo.o0o0Oo
    public final Object[] OooO0o() {
        return this.f29530OooOoO.OooO0o();
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO0oO() {
        return this.f29530OooOoO.OooO() + this.f29529OooOo + this.f29531OooOoO0;
    }

    @Override // o0000Ooo.o00Oo00, java.util.List
    /* renamed from: OooOO0o */
    public final o00Oo00 subList(int i, int i2) {
        o0OO0O0.OooO0oo(i, i2, this.f29531OooOoO0);
        int i3 = this.f29529OooOo;
        return this.f29530OooOoO.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        o0OO0O0.OooO0Oo(i, this.f29531OooOoO0);
        return this.f29530OooOoO.get(i + this.f29529OooOo);
    }

    @Override // o0000Ooo.o00Oo00, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // o0000Ooo.o00Oo00, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29531OooOoO0;
    }

    @Override // o0000Ooo.o00Oo00, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
