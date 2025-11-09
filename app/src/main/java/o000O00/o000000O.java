package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o000000O extends oo00o {

    /* renamed from: OooO, reason: collision with root package name */
    public final List f29855OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f29856OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29857OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29858OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f29859OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f29860OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f29861OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final long f29862OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f29863OooO0oo;

    public o000000O(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.f29856OooO00o = i;
        this.f29857OooO0O0 = str;
        this.f29858OooO0OO = i2;
        this.f29859OooO0Oo = i3;
        this.f29861OooO0o0 = j;
        this.f29860OooO0o = j2;
        this.f29862OooO0oO = j3;
        this.f29863OooO0oo = str2;
        this.f29855OooO = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oo00o) {
            oo00o oo00oVar = (oo00o) obj;
            if (this.f29856OooO00o == ((o000000O) oo00oVar).f29856OooO00o) {
                o000000O o000000o2 = (o000000O) oo00oVar;
                if (this.f29857OooO0O0.equals(o000000o2.f29857OooO0O0) && this.f29858OooO0OO == o000000o2.f29858OooO0OO && this.f29859OooO0Oo == o000000o2.f29859OooO0Oo && this.f29861OooO0o0 == o000000o2.f29861OooO0o0 && this.f29860OooO0o == o000000o2.f29860OooO0o && this.f29862OooO0oO == o000000o2.f29862OooO0oO) {
                    String str = o000000o2.f29863OooO0oo;
                    String str2 = this.f29863OooO0oo;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        List list = o000000o2.f29855OooO;
                        List list2 = this.f29855OooO;
                        if (list2 != null ? list2.equals(list) : list == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f29856OooO00o ^ 1000003) * 1000003) ^ this.f29857OooO0O0.hashCode()) * 1000003) ^ this.f29858OooO0OO) * 1000003) ^ this.f29859OooO0Oo) * 1000003;
        long j = this.f29861OooO0o0;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f29860OooO0o;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f29862OooO0oO;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f29863OooO0oo;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f29855OooO;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f29856OooO00o + ", processName=" + this.f29857OooO0O0 + ", reasonCode=" + this.f29858OooO0OO + ", importance=" + this.f29859OooO0Oo + ", pss=" + this.f29861OooO0o0 + ", rss=" + this.f29860OooO0o + ", timestamp=" + this.f29862OooO0oO + ", traceFile=" + this.f29863OooO0oo + ", buildIdMappingForArch=" + this.f29855OooO + "}";
    }
}
