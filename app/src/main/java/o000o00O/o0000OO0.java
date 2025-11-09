package o000o00o;

import androidx.datastore.preferences.protobuf.OooO00o;

/* loaded from: classes2.dex */
public final class o0000OO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30762OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f30763OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f30764OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f30765OooO0Oo;

    public o0000OO0(String str, int i, int i2, boolean z) {
        this.f30762OooO00o = str;
        this.f30763OooO0O0 = i;
        this.f30764OooO0OO = i2;
        this.f30765OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000OO0)) {
            return false;
        }
        o0000OO0 o0000oo02 = (o0000OO0) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f30762OooO00o, o0000oo02.f30762OooO00o) && this.f30763OooO0O0 == o0000oo02.f30763OooO0O0 && this.f30764OooO0OO == o0000oo02.f30764OooO0OO && this.f30765OooO0Oo == o0000oo02.f30765OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30765OooO0Oo) + OooO00o.OooO00o(this.f30764OooO0OO, OooO00o.OooO00o(this.f30763OooO0O0, this.f30762OooO00o.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f30762OooO00o);
        sb.append(", pid=");
        sb.append(this.f30763OooO0O0);
        sb.append(", importance=");
        sb.append(this.f30764OooO0OO);
        sb.append(", isDefaultProcess=");
        return OooO00o.OooOOOO(sb, this.f30765OooO0Oo, ')');
    }
}
