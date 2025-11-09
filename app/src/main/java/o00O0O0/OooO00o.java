package o00O0O0;

import java.util.Comparator;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooO00o implements Comparator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31315OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO00o f31314OooOo0o = new OooO00o(0);

    /* renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f31313OooOo = new OooO00o(1);

    public /* synthetic */ OooO00o(int i) {
        this.f31315OooOo0O = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f31315OooOo0O) {
            case 0:
                Comparable a = (Comparable) obj;
                Comparable b = (Comparable) obj2;
                OooOo.OooO0o0(a, "a");
                OooOo.OooO0o0(b, "b");
                return a.compareTo(b);
            default:
                Comparable a2 = (Comparable) obj;
                Comparable b2 = (Comparable) obj2;
                OooOo.OooO0o0(a2, "a");
                OooOo.OooO0o0(b2, "b");
                return b2.compareTo(a2);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f31315OooOo0O) {
            case 0:
                return f31313OooOo;
            default:
                return f31314OooOo0o;
        }
    }
}
