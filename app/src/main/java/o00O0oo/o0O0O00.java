package o00O0oO;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOo;
import o00O0OoO.OooO0OO;

/* loaded from: classes3.dex */
public final class o0O0O00 implements Iterator, OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f31446OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f31447OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31448OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f31449OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f31450OooOoO0;

    public o0O0O00(String string) {
        OooOo.OooO0o0(string, "string");
        this.f31447OooOo0O = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f31448OooOo0o;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f31449OooOoO < 0) {
            this.f31448OooOo0o = 2;
            return false;
        }
        String str = this.f31447OooOo0O;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f31446OooOo; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f31448OooOo0o = 1;
                this.f31449OooOoO = i;
                this.f31450OooOoO0 = length;
                return true;
            }
        }
        i = -1;
        this.f31448OooOo0o = 1;
        this.f31449OooOoO = i;
        this.f31450OooOoO0 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f31448OooOo0o = 0;
        int i = this.f31450OooOoO0;
        int i2 = this.f31446OooOo;
        this.f31446OooOo = this.f31449OooOoO + i;
        return this.f31447OooOo0O.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
