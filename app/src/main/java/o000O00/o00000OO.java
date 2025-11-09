package o000O00;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00000OO extends o00O0O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29868OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f29869OooO0O0;

    public o00000OO(String str, byte[] bArr) {
        this.f29868OooO00o = str;
        this.f29869OooO0O0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0O00) {
            o00O0O00 o00o0o00 = (o00O0O00) obj;
            if (this.f29868OooO00o.equals(((o00000OO) o00o0o00).f29868OooO00o)) {
                if (Arrays.equals(this.f29869OooO0O0, (o00o0o00 instanceof o00000OO ? (o00000OO) o00o0o00 : (o00000OO) o00o0o00).f29869OooO0O0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29868OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f29869OooO0O0);
    }

    public final String toString() {
        return "File{filename=" + this.f29868OooO00o + ", contents=" + Arrays.toString(this.f29869OooO0O0) + "}";
    }
}
