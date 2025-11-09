package OooOOOo;

/* loaded from: classes2.dex */
public final class oo000o extends o00000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Integer f13438OooO00o;

    public oo000o(Integer num) {
        this.f13438OooO00o = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00000O)) {
            return false;
        }
        Integer num = this.f13438OooO00o;
        oo000o oo000oVar = (oo000o) ((o00000O) obj);
        return num == null ? oo000oVar.f13438OooO00o == null : num.equals(oo000oVar.f13438OooO00o);
    }

    public final int hashCode() {
        Integer num = this.f13438OooO00o;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f13438OooO00o + "}";
    }
}
