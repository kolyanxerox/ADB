package o00O0o0O;

import java.util.NoSuchElementException;
import o00O0.o0Oo0oo;

/* loaded from: classes3.dex */
public final class o00Oo0 extends o0Oo0oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f31439OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f31440OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f31441OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f31442OooOoO0;

    public o00Oo0(int i, int i2, int i3) {
        this.f31440OooOo0O = i3;
        this.f31441OooOo0o = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f31439OooOo = z;
        this.f31442OooOoO0 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31439OooOo;
    }

    @Override // o00O0.o0Oo0oo
    public final int nextInt() {
        int i = this.f31442OooOoO0;
        if (i != this.f31441OooOo0o) {
            this.f31442OooOoO0 = this.f31440OooOo0O + i;
            return i;
        }
        if (!this.f31439OooOo) {
            throw new NoSuchElementException();
        }
        this.f31439OooOo = false;
        return i;
    }
}
