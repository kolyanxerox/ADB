package o00O0oO;

import OooO0oO.OooOo;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o00O0Oo.o00O0O;
import o00O0Oo0.o00Oo0;
import o00O0OoO.OooO0OO;
import o00O0o0O.o00Ooo;
import o00Oo0oo.o00oO0o;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class oo0o0Oo implements Iterator, OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f31455OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31456OooOo0O = -1;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31457OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f31458OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public o00Ooo f31459OooOoO0;

    public oo0o0Oo(o00Oo0 o00oo0) {
        this.f31458OooOoO = o00oo0;
        o00oo0.getClass();
        int length = ((String) o00oo0.f31392OooO0O0).length();
        if (length < 0) {
            throw new IllegalArgumentException(OooOo.OooO0oO(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f31457OooOo0o = length;
        this.f31455OooOo = length;
    }

    public final void OooO00o() {
        OooOO0 oooOO0;
        int i = this.f31455OooOo;
        if (i < 0) {
            this.f31456OooOo0O = 0;
            this.f31459OooOoO0 = null;
            return;
        }
        o00Oo0 o00oo0 = this.f31458OooOoO;
        o00oo0.getClass();
        String str = (String) o00oo0.f31392OooO0O0;
        if (i <= str.length() && (oooOO0 = (OooOO0) ((o00O0O) o00oo0.f31393OooO0OO).invoke(str, Integer.valueOf(this.f31455OooOo))) != null) {
            int iIntValue = ((Number) oooOO0.f33185OooOo0O).intValue();
            int iIntValue2 = ((Number) oooOO0.f33186OooOo0o).intValue();
            this.f31459OooOoO0 = o00oO0o.OooOOOO(this.f31457OooOo0o, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.f31457OooOo0o = i2;
            this.f31455OooOo = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f31459OooOoO0 = new o00Ooo(this.f31457OooOo0o, o000000.Oooo0oo(str), 1);
            this.f31455OooOo = -1;
        }
        this.f31456OooOo0O = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31456OooOo0O == -1) {
            OooO00o();
        }
        return this.f31456OooOo0O == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f31456OooOo0O == -1) {
            OooO00o();
        }
        if (this.f31456OooOo0O == 0) {
            throw new NoSuchElementException();
        }
        o00Ooo o00ooo2 = this.f31459OooOoO0;
        kotlin.jvm.internal.OooOo.OooO0OO(o00ooo2, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f31459OooOoO0 = null;
        this.f31456OooOo0O = -1;
        return o00ooo2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
