package OooOOOo;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00Ooo extends o00000O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f13409OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f13410OooO0O0;

    public o00Ooo(byte[] bArr, byte[] bArr2) {
        this.f13409OooO00o = bArr;
        this.f13410OooO0O0 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00000O0) {
            o00000O0 o00000o02 = (o00000O0) obj;
            boolean z = o00000o02 instanceof o00Ooo;
            if (Arrays.equals(this.f13409OooO00o, z ? ((o00Ooo) o00000o02).f13409OooO00o : ((o00Ooo) o00000o02).f13409OooO00o)) {
                if (Arrays.equals(this.f13410OooO0O0, z ? ((o00Ooo) o00000o02).f13410OooO0O0 : ((o00Ooo) o00000o02).f13410OooO0O0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f13409OooO00o) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13410OooO0O0);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f13409OooO00o) + ", encryptedBlob=" + Arrays.toString(this.f13410OooO0O0) + "}";
    }
}
