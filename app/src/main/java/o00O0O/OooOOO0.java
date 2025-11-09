package o00O0o;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class OooOOO0 implements Oooo000, OooOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31408OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000 f31409OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f31410OooO0OO;

    public OooOOO0(Oooo000 oooo000, int i, int i2) {
        this.f31408OooO00o = i2;
        switch (i2) {
            case 1:
                this.f31409OooO0O0 = oooo000;
                this.f31410OooO0OO = i;
                if (i >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
            default:
                this.f31409OooO0O0 = oooo000;
                this.f31410OooO0OO = i;
                if (i >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override // o00O0o.OooOOO
    public final Oooo000 OooO00o(int i) {
        switch (this.f31408OooO00o) {
            case 0:
                int i2 = this.f31410OooO0OO + i;
                return i2 < 0 ? new OooOOO0(this, i, 0) : new OooOOO0(this.f31409OooO0O0, i2, 0);
            default:
                int i3 = this.f31410OooO0OO;
                return i >= i3 ? OooOOOO.f31411OooO00o : new oo000o(this.f31409OooO0O0, i, i3);
        }
    }

    @Override // o00O0o.OooOOO
    public final Oooo000 OooO0O0(int i) {
        switch (this.f31408OooO00o) {
            case 0:
                int i2 = this.f31410OooO0OO;
                int i3 = i2 + i;
                return i3 < 0 ? new OooOOO0(this, i, 1) : new oo000o(this.f31409OooO0O0, i2, i3);
            default:
                return i >= this.f31410OooO0OO ? this : new OooOOO0(this.f31409OooO0O0, i, 1);
        }
    }

    @Override // o00O0o.Oooo000
    public final Iterator iterator() {
        switch (this.f31408OooO00o) {
            case 0:
                return new OooOO0O(this);
            default:
                return new OooOO0O(this, (byte) 0);
        }
    }
}
