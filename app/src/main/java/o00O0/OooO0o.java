package o00O0;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class OooO0o extends OooO implements RandomAccess {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f31235OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooO f31236OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f31237OooOo0o;

    public OooO0o(OooO oooO, int i, int i2) {
        this.f31236OooOo0O = oooO;
        this.f31237OooOo0o = i;
        OooO0O0 oooO0O0 = OooO.Companion;
        int size = oooO.size();
        oooO0O0.getClass();
        OooO0O0.OooO0OO(i, i2, size);
        this.f31235OooOo = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        OooO0O0 oooO0O0 = OooO.Companion;
        int i2 = this.f31235OooOo;
        oooO0O0.getClass();
        OooO0O0.OooO00o(i, i2);
        return this.f31236OooOo0O.get(this.f31237OooOo0o + i);
    }

    @Override // o00O0.OooO00o
    public final int getSize() {
        return this.f31235OooOo;
    }

    @Override // o00O0.OooO, java.util.List
    public final List subList(int i, int i2) {
        OooO0O0 oooO0O0 = OooO.Companion;
        int i3 = this.f31235OooOo;
        oooO0O0.getClass();
        OooO0O0.OooO0OO(i, i2, i3);
        int i4 = this.f31237OooOo0o;
        return new OooO0o(this.f31236OooOo0O, i + i4, i4 + i2);
    }
}
