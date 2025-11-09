package o00000oo;

import Oooo0o0.OooO;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00oO0o implements Comparable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final byte[] f29295OooOo0O;

    public o00oO0o(byte[] bArr) {
        this.f29295OooOo0O = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o00oO0o o00oo0o = (o00oO0o) obj;
        byte[] bArr = this.f29295OooOo0O;
        int length = bArr.length;
        byte[] bArr2 = o00oo0o.f29295OooOo0O;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = o00oo0o.f29295OooOo0O[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o00oO0o) {
            return Arrays.equals(this.f29295OooOo0O, ((o00oO0o) obj).f29295OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29295OooOo0O);
    }

    public final String toString() {
        return OooO.OooO(this.f29295OooOo0O);
    }
}
