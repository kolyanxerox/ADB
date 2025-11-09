package o00O0o;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class oo000o implements Oooo000, OooOOO {

    /* renamed from: OooO00o */
    public final Oooo000 f31433OooO00o;

    /* renamed from: OooO0O0 */
    public final int f31434OooO0O0;

    /* renamed from: OooO0OO */
    public final int f31435OooO0OO;

    public oo000o(Oooo000 oooo000, int i, int i2) {
        this.f31433OooO00o = oooo000;
        this.f31434OooO0O0 = i;
        this.f31435OooO0OO = i2;
        if (i < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(i2, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // o00O0o.OooOOO
    public final Oooo000 OooO00o(int i) {
        int i2 = this.f31435OooO0OO;
        int i3 = this.f31434OooO0O0;
        if (i >= i2 - i3) {
            return OooOOOO.f31411OooO00o;
        }
        return new oo000o(this.f31433OooO00o, i3 + i, i2);
    }

    @Override // o00O0o.OooOOO
    public final Oooo000 OooO0O0(int i) {
        int i2 = this.f31435OooO0OO;
        int i3 = this.f31434OooO0O0;
        if (i >= i2 - i3) {
            return this;
        }
        return new oo000o(this.f31433OooO00o, i3, i + i3);
    }

    @Override // o00O0o.Oooo000
    public final Iterator iterator() {
        return new OooOo(this);
    }
}
