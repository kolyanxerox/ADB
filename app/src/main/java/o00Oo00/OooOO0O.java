package o00Oo00;

import com.ironsource.C3037dc;
import java.util.Objects;
import o00OOooo.o00O0;
import o00OOooo.o00O00OO;

/* loaded from: classes3.dex */
public final class OooOO0O extends o00O0 {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f32666OooO0o0;

    public final OooOOO0 OooOO0() {
        o00O00OO o00o00oo = this.f32648OooO0Oo;
        if (o00o00oo != null) {
            return new OooOOO0((byte[]) o00o00oo.f32647OooO0Oo, this.f32666OooO0o0);
        }
        throw new IllegalStateException("origin == null");
    }

    public final void OooOO0O(byte[] bArr) {
        Objects.requireNonNull(bArr, C3037dc.f8261p);
        this.f32666OooO0o0 = bArr.length;
        this.f32648OooO0Oo = new o00O00OO(bArr);
    }
}
