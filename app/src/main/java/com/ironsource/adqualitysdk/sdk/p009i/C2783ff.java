package com.ironsource.adqualitysdk.sdk.p009i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ff */
/* loaded from: classes2.dex */
public class C2783ff<T> extends AbstractC2755ee {

    /* renamed from: ﾒ */
    private T f6341;

    public C2783ff(T t, C2736dm c2736dm) {
        super(c2736dm);
        this.f6341 = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t = this.f6341;
            T t2 = ((C2783ff) obj).f6341;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.f6341;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6341);
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        return new C2744du(this.f6341);
    }
}
