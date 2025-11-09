package o0000OoO;

import Oooo0o0.OooO;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00OOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f29522OooO00o;

    public o00OOO0O(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f29522OooO00o = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static o00OOO0O OooO00o(byte[] bArr) {
        if (bArr != null) {
            return new o00OOO0O(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o00OOO0O) {
            return Arrays.equals(((o00OOO0O) obj).f29522OooO00o, this.f29522OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29522OooO00o);
    }

    public final String toString() {
        return "Bytes(" + OooO.OooO(this.f29522OooO00o) + ")";
    }
}
